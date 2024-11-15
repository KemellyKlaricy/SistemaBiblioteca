package Entidades;

import java.util.ArrayList;

public abstract class Service {

    protected boolean verificacao(ArrayList<User> listaUser, String isbn, int id){
        return true;
    }
    protected void cadastro(){}
    protected void excluir(){}
    protected void visualizar(){}

}
