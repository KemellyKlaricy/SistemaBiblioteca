package Entidades;


public class Livro {
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String isbn;
    protected String genero;
    protected int anoPublicacao;
    protected int quantidadeDisponivel;

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