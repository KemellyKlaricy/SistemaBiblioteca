package Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class EmprestimoService {
    Scanner entradaInt = new Scanner(System.in);
    Scanner entradaSt = new Scanner(System.in);

    public void registroEmprestimo(ArrayList<User> listaUser, ArrayList<Livro> biblioteca, ArrayList<Emprestimo> emprestimos){

        System.out.println("Informe o ISBN do livro para registrar o imprestimo: ");
        String isbnaux = entradaSt.next();

        System.out.println("Informe o ID do usuário para registrar o imprestimo: ");
        int idaux = entradaInt.nextInt();

        Emprestimo novoEmprestimo = new Emprestimo();
        User aux = new User();
        Livro auxl = new Livro();

        for(User user: listaUser){
            int idtemp = user.ID;
            if(idtemp == idaux){
                aux = user;
            }
        }
        for(Livro livro: biblioteca){
            String isbntemp = livro.isbn;
            if(isbnaux.equals(isbntemp)){
                auxl = livro;
            }
        }

        novoEmprestimo.usuario = aux;
        novoEmprestimo.livro = auxl;
        novoEmprestimo.dataEmprestimo = LocalDate.now();
        novoEmprestimo.dataDevolucao = LocalDate.now().plusMonths(1);
        novoEmprestimo.devolvido = false;
        emprestimos.add(novoEmprestimo);
    }

    public void showEmprestimo(ArrayList<Emprestimo> emprestimos){
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

    public void registroDevolucao(ArrayList<Emprestimo> emprestimos){
        System.out.println("Informe o ID do usuario para registar a devolução: ");
        int auxID = entradaInt.nextInt();

        System.out.println("Informe o ISBN do livro para registar a devolução: ");
        String auxISBN = entradaSt.nextLine();

        for(Emprestimo auxEmprestimo: emprestimos){
            if(auxEmprestimo.usuario.ID == auxID && auxEmprestimo.livro.isbn.equalsIgnoreCase(auxISBN)){
                auxEmprestimo.devolvido = true;
                showEmprestimo(emprestimos);
            }
        }
    }

}
