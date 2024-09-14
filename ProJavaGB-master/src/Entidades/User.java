package Entidades;

import java.util.Scanner;

public class User {
    String nome = new String();
    String endereco = new String();
    String email = new String();
    String telefone = new String();
    int ID;
    int idade;
    Emprestimo[] historicoEmprestimo = new Emprestimo[3];
    Scanner entradaSt = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);


    public void registroU(){

            System.out.println("Informe o nome do Usuário a ser cadastrado: ");
            String nomeaux = entradaSt.nextLine();

            System.out.println("Informe a idade do Usuário a ser cadastrado: ");
            int idadeaux = entradaInt.nextInt();

        if (idadeaux >= 15) {
            nome = nomeaux;
            idade = idadeaux;
            System.out.println("Informe o ID do Usuário a ser cadastrado: ");
            ID = entradaInt.nextInt();

            System.out.println("Informe o Email do Usuário a ser cadastrado: ");
            email = entradaSt.nextLine();

            System.out.println("Informe o número telefônico do Usuário para contato: ");
            telefone = entradaSt.nextLine();

            System.out.println("Informe o Endereço residencial do Usuário: ");
            endereco = entradaSt.nextLine();

        } else {

            System.out.println("O Usuário não pode ser cadastrado pois só é permitido " +
                    "o cadastro de pessoas com idade acima de 14 anos!");
        }
    }
}
