package Entidades;
import java.time.LocalDate;

public class Emprestimo {
    protected User usuario;
    protected Livro livro;
    protected LocalDate dataEmprestimo;
    protected LocalDate dataDevolucao;
    protected boolean devolvido;
}
