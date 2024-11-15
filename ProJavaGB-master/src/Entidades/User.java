package Entidades;

public class User extends Pessoa{

    protected String endereco = new String();

    protected String email = new String();

    protected String telefone = new String();

    protected int ID;

    protected Emprestimo[] historicoEmprestimo = new Emprestimo[3];

    public User(){}
    public User(String nome, String cpf, int idade,String endereco, String email, String telefone, int id){
        super(nome, cpf, idade);
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.ID = id;
    }
}
