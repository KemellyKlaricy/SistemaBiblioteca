package Entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService extends Service {

    //Adicionado o atributo Private.
    private Scanner entradaInt = new Scanner(System.in);
    private Scanner entradaSt = new Scanner(System.in);

    public void cadastro(ArrayList<User> listaUser){
        System.out.println("Informe o nome do Usuário a ser cadastrado: ");
        String nomeaux = entradaSt.nextLine();

        System.out.println("Informe a idade do Usuário a ser cadastrado: ");
        int idadeaux = entradaInt.nextInt();

        if (idadeaux >= 15) {
            System.out.println("Informe o CPF do Usuário a ser cadastrado: ex: xxx.xxx.xxx-xx");
            String cpf = entradaSt.nextLine();

            System.out.println("Informe o ID do Usuário a ser cadastrado: ");
            int ID = entradaInt.nextInt();

            System.out.println("Informe o Email do Usuário a ser cadastrado: ");
            String email = entradaSt.nextLine();

            System.out.println("Informe o número telefônico do Usuário para contato: ");
            String telefone = entradaSt.nextLine();

            System.out.println("Informe o Endereço residencial do Usuário: ");
            String endereco = entradaSt.nextLine();

            User novoUser = new User(nomeaux,cpf,idadeaux,endereco,email,telefone,ID);
            listaUser.add(novoUser);
        } else {

            System.out.println("O Usuário não pode ser cadastrado pois só é permitido " +
                    "o cadastro de pessoas com idade acima de 14 anos!");
        }

    }
    public void excluir(ArrayList<User> listaUser){
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
    public void visualizar(ArrayList<User> listaUser){
        System.out.println("Informe o ID do usuário que deseja visualizar: ");
        int idTemp = entradaInt.nextInt();
        for(User user: listaUser){
            int idAux = user.ID;
            if(idAux == idTemp){
                System.out.println("_______________________________________________");
                System.out.printf("Nome: %s\n" +
                       "Idade: %d\n" +
                        "CPF: %s\n" +
                       "ID: %d\n" +
                       "Telefone: %s\n" +
                       "Email: %s\n" +
                       "Endereço: %s", user.nome, user.idade,user.cpf, user.ID, user.telefone, user.email, user.endereco);
                String status;
                System.out.println("\nEmprestimos Registrados.");
                for(int i = 0; i < 3; i++){

                    if(user.historicoEmprestimo[i] != null){
                        if(user.historicoEmprestimo[i].devolvido == true){
                            status = "Devolvido";
                        }else{
                            status = "Encaminhado";
                        }
                        System.out.println("");
                        System.out.println("Nome: " + user.historicoEmprestimo[i].usuario.nome + "\nLivro: " + user.historicoEmprestimo[i].livro.titulo
                               + "\nData de emprestimo: " + user.historicoEmprestimo[i].dataEmprestimo + "\nData de devolução: "
                               + user.historicoEmprestimo[i].dataDevolucao + "\nStatus: " + status);
                        System.out.println("_______________________________________________");
                    }
                }
                if(user.historicoEmprestimo[0] == null && user.historicoEmprestimo[1] == null && user.historicoEmprestimo[2] == null){
                    System.out.println("\nUsuario não possui emprestimos realizados!");
                    System.out.println("_______________________________________________");
                }
                return;
           }
        }
        System.out.println("Usuário não encontrado!");
    }
}