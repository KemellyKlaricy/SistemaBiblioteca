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
    public void excluirUser(ArrayList<User> listaUser){
        System.out.println("Informe o ID do usuário que deseja editadar: ");
        int idTemp = entradaInt.nextInt();
        for(User user: listaUser){
            int idAux = user.ID;
            if(idAux == idTemp){
                listaUser.remove(user);
                System.out.println("Usuário desvinculado!");
                return;
            }
        }
        System.out.println("Usuário não encontrado!");
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
               String status;
               System.out.println("\nEmprestimos Registrados.");
               for(int i = 0; i < 3; i++){

                   if(user.historicoEmprestimo[i] != null){
                       if(user.historicoEmprestimo[i].devolvido == true){
                           status = "Devolvido";
                       }else{
                           status = "Encaminhado";
                       }
                       System.out.println("*****************************************");
                       System.out.println("Nome: " + user.historicoEmprestimo[i].usuario.nome + "\nLivro: " + user.historicoEmprestimo[i].livro.titulo
                               + "\nData de emprestimo: " + user.historicoEmprestimo[i].dataEmprestimo + "\nData de devolução: "
                               + user.historicoEmprestimo[i].dataDevolucao + "\nStatus: " + status);
                   }
               }
               return;
           }
        }
        System.out.println("Usuário não encontrado!");
    }
}