package Entidades;
import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    String editora;
    String isbn;
    String genero;
    int anoPublicacao;
    int quantidadeDisponivel;

    Livro(){}
    public Livro(String titulo, String autor, String editora, String isbn, String genero, int anopublicacao, int estoque){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.genero = genero;
        this.anoPublicacao = anopublicacao;
        this.quantidadeDisponivel = estoque;
    }
}