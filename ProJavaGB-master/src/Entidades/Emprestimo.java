package Entidades;
import java.time.LocalDate;

public class Emprestimo {
    User usuario;
    Livro livro;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;
    boolean devolvido;
}
