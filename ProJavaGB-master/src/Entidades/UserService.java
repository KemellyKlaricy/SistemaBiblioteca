package Entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    Scanner entradaInt = new Scanner(System.in);

    public void cadastroUser(ArrayList<User> listaUser){
        User novoUser = new User();
        novoUser.registroU();
        listaUser.add(novoUser);
    }
    public void editarUser(ArrayList<User> listaUser){
        System.out.println("Informe o ID do usuário que deseja editadar: ");
        int idTemp = entradaInt.nextInt();
        for(User user: listaUser){
            int idAux = user.ID;
            if(idAux == idTemp){
                user.editarU();

            }
        }
    }
    public void excluirUser(ArrayList<User> listaUser){
        System.out.println("Informe o ID do usuário que deseja editadar: ");
        int idTemp = entradaInt.nextInt();
        for(User user: listaUser){
            int idAux = user.ID;
            if(idAux == idTemp){
                user.excluirU();
            }
        }
    }
    public void visualizarUser(ArrayList<User> listaUser){
        System.out.println("Informe o ID do usuário que deseja visualizar: ");
        int idTemp = entradaInt.nextInt();
        for(User user: listaUser){
            int idAux = user.ID;
            if(idAux == idTemp){
               System.out.printf("Nome: %s\n" +
                       "Idade: %d\n" +
                       "ID: %d\n" +
                       "Telefone: %s\n" +
                       "Email: %s\n" +
                       "Endereço: %s", user.nome, user.idade, user.ID, user.telefone, user.email, user.endereco);
           }
        }
    }
}