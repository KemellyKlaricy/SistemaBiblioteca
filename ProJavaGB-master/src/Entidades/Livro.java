package Entidades;
import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    String editora;
    String isbn;
    int anoPublicacao;
    int quantidadeDisponivel;

    Scanner entradaSt = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);
    public void cadastroL() {

        System.out.println("Informe o Titulo do livro a ser registrado: ");
        titulo = entradaSt.nextLine();

        System.out.println("Informe o nome do Autor: ");
        autor = entradaSt.nextLine();

        System.out.println("Informe a Editora: ");
        editora = entradaSt.nextLine();

        System.out.println("Informe o ISBN: ");
        isbn = entradaSt.nextLine();

        System.out.println("Informe o Ano de publicação: ");
        anoPublicacao = entradaInt.nextInt();

        System.out.println("Informe a quantidade de Exemplares deisponiveis: ");
        quantidadeDisponivel = entradaInt.nextInt();

    }
}