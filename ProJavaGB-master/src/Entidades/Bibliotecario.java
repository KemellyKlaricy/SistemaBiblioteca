package Entidades;

import java.util.ArrayList;

public class Bibliotecario{

    final ArrayList<User> historicoUsuarios = new ArrayList<User>();
    final ArrayList<Livro> biblioteca = new ArrayList<Livro>();
    final ArrayList<Emprestimo> historicoEmprestimos = new ArrayList<Emprestimo>();
    final EmprestimoService emprestimo = new EmprestimoService();
    final UserService user = new UserService();
    final LivroService livro = new LivroService();

    public void addUser(){
        user.cadastroUser(historicoUsuarios);
    }
    public void editUser(){
        user.editarUser(historicoUsuarios);
    }
    public void deleteUser(){
        user.excluirUser(historicoUsuarios);
    }
    public void showUser(){
        user.visualizarUser(historicoUsuarios);
    }

    public void addLivro(){
        livro.cadastroLivro(biblioteca);
    }
    public void editLivro(){
        livro.editarLivro(biblioteca);
    }
    public void deleteLivro(){
        livro.excluirLivro(biblioteca);
    }
    public void showLivro(){
        livro.visualizarLivro(biblioteca);
    }

    public void addEmprestimo(){
        emprestimo.registroEmprestimo(historicoUsuarios,biblioteca,historicoEmprestimos);
    }
    public void addDevolucao(){
        emprestimo.registroDevolucao(historicoEmprestimos);
    }
    public void statusEmprestimo(){
        emprestimo.showEmprestimo(historicoEmprestimos);
    }

}
