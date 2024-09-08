package Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class EmprestimoService {
    Scanner entradaInt = new Scanner(System.in);
    Scanner entradaSt = new Scanner(System.in);

    public boolean verificacaoEmprestimo(ArrayList<User> listaUser, String isbn, int id){
        for(User user: listaUser){
            if(user.ID == id){
                for(int i = 0; i < 3; i++){
                    if(user.historicoEmprestimo[i] != null){
                        if(user.historicoEmprestimo[i].livro.isbn.equalsIgnoreCase(isbn)){
                            System.out.println("O emprestimo não pode ser comcluido," +
                                    " pois o usuario já retem um livro com este ISBN!");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public void registroEmprestimo(ArrayList<User> listaUser, ArrayList<Livro> biblioteca, ArrayList<Emprestimo> emprestimos) {
        System.out.println("Informe o ISBN do livro para registrar o empréstimo: ");
        String isbnaux = entradaSt.nextLine();

        System.out.println("Informe o ID do usuário para registrar o empréstimo: ");
        int idaux = entradaInt.nextInt();
        entradaSt.nextLine();


        Livro livro = null;
        User usuario = null;

        for (Livro livro1 : biblioteca) {
            if (livro1.isbn.equals(isbnaux)) {
                livro = livro1;
                break;
            }
        }

        for (User user : listaUser) {
            if (user.ID == idaux) {
                usuario = user;
                break;
            }
        }

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }


        if (livro.quantidadeDisponivel <= 0) {
            System.out.println("Nenhum exemplar disponível.");
            return;
        }


        if (!verificacaoEmprestimo(listaUser, isbnaux, idaux)) {
            return;
        }

        Emprestimo novoEmprestimo = new Emprestimo();
        novoEmprestimo.usuario = usuario;
        novoEmprestimo.livro = livro;
        novoEmprestimo.dataEmprestimo = LocalDate.now();
        novoEmprestimo.dataDevolucao = LocalDate.now().plusMonths(1);
        novoEmprestimo.devolvido = false;

        emprestimos.add(novoEmprestimo);
        livro.quantidadeDisponivel--;


        for (User user : listaUser) {
            if (user.ID == idaux) {
                for (int i = 0; i < 3; i++) {
                    if (user.historicoEmprestimo[i] == null) {
                        user.historicoEmprestimo[i] = novoEmprestimo;
                        break;
                    }
                }
                break;
            }
        }

        System.out.println("Empréstimo registrado com sucesso!");
    }

    public void verEmprestimo(ArrayList<Emprestimo> emprestimos){
        String status;
        System.out.println("Informe o ID do usuario para verificar o status de emprestimo: ");
        int auxID = entradaInt.nextInt();

        System.out.println("Informe o ISBN do livro para verificar o status de emprestimo: ");
        String auxISBN = entradaSt.nextLine();

        for(Emprestimo auxEmprestimo: emprestimos){
            if(auxEmprestimo.usuario.ID == auxID && auxEmprestimo.livro.isbn.equalsIgnoreCase(auxISBN)){
                if(auxEmprestimo.devolvido == true){
                    status = "Devolvido";
                }else{
                    status = "Encaminhado";
                }
                System.out.println("Nome: " + auxEmprestimo.usuario.nome + "\nLivro: " + auxEmprestimo.livro.titulo
                        + "\nData de emprestimo: " + auxEmprestimo.dataEmprestimo + "\nData de devolução: "
                        + auxEmprestimo.dataDevolucao + "Status: " + status);
            }
        }

    }

    public void registroDevolucao(ArrayList<Emprestimo> emprestimos) {
        System.out.println("Informe o ID do usuário para registrar a devolução: ");
        int auxID = entradaInt.nextInt();

        System.out.println("Informe o ISBN do livro para registrar a devolução: ");
        String auxISBN = entradaSt.nextLine();

        boolean encontrado = false;
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.usuario.ID == auxID && emprestimo.livro.isbn.equalsIgnoreCase(auxISBN)) {
                emprestimo.devolvido = true;
                emprestimo.livro.quantidadeDisponivel++;
                System.out.println("Devolução registrada com sucesso!");
                encontrado = true;
                emprestimo.usuario.devolverLivro(auxISBN);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Empréstimo não encontrado.");
        }
    }



}