package Entidades;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    Pessoa(){
    }

    Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}
