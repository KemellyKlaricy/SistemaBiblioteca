package Entidades;

public class User extends Pessoa {

    private String endereco;
    private String email;
    private String telefone;
    private int ID;
    private Emprestimo[] historicoEmprestimo;

    public User(String nome, String cpf, int idade, String endereco, String email, String telefone, int id) {
        super(nome, cpf, idade);
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.ID = id;
        this.historicoEmprestimo = new Emprestimo[3];
    }


    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Emprestimo[] getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(Emprestimo[] historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
