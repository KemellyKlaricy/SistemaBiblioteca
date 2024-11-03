package Entidades;

import java.util.Scanner;

public class User extends Pessoa{

    String endereco = new String();

    String email = new String();

    String telefone = new String();

    int ID;

    Emprestimo[] historicoEmprestimo = new Emprestimo[3];

    Scanner entradaSt = new Scanner(System.in);

    Scanner entradaInt = new Scanner(System.in);

    User(){}
    User(String nome, String cpf, int idade,String endereco, String email, String telefone, int id){
        super(nome, cpf, idade);
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.ID = id;
    }
}
