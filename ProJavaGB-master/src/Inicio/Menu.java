package Inicio;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Emprestimo;
import Entidades.EmprestimoService;
import Entidades.Livro;
import Entidades.LivroService;
import Entidades.User;
import Entidades.UserService;

public class Menu {
	Scanner sc = new Scanner(System.in);
	ArrayList<User> listaUser = new ArrayList<>();
    ArrayList<Livro> biblioteca = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();
	
	public static void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPressione Enter:");
        scanner.nextLine();
    }
	
	public void OpcaoMenu(){
		System.out.println("====== Menu Inicial =====");
		
		char escolha;
		do {
			System.out.println("Escolha um das opcões a seguir:\n" +
                    "1 - Registrar emprestimo.\n" +
                    "2 - Cadastrar Livro.\n" +
                    "3 - Apagar Livro \n" +
                    "4 - Editar Livro \n" +
                    "5 - Visualizar Livro \n" +
                    "6 - Cadastrar User\n"+
                    "7 - Editar User\n"+
                    "8 - Excluir User \n"+
                    "9 - Visualizar User\n");
            escolha = sc.next().charAt(0);
		
			switch(escolha){
	
	        case '1':
	        	EmprestimoService emprestimoService = new EmprestimoService();
	            emprestimoService.registroemprestimo(listaUser, biblioteca, emprestimos);
	            break;
	
	        case '2':
	        	LivroService livroService = new LivroService();
	        	livroService.cadastroLivro(biblioteca);
	        	pause();
	            break;
	
	        case '3':
	        	LivroService livroService1 = new LivroService();
	        	livroService1.excluirLivro(biblioteca);
	        	pause();
	            break;
	        case '4':
	        	LivroService livroService2 = new LivroService();
	        	livroService2.editarLivro(biblioteca);
	        	pause();
	        	break;
	        case '5':
	        	LivroService livroService3= new LivroService();
	        	livroService3.visualizarLivro(biblioteca);
	        	pause();
	        	break;
	        case '6':
	        	UserService userService1 = new UserService();
	        	userService1.cadastroUser(listaUser);
	        	pause();
	        	break;
	        case '7':
	        	UserService userService2 = new UserService();
	        	userService2.editarUser(listaUser);
	        	pause();
	        	break;
	        case '8':
	        	UserService userService3 = new UserService();
	        	userService3.excluirUser(listaUser);
	        	pause();
	        	break;
	        case '9':
	        	UserService userService4 = new UserService();
	        	userService4.visualizarUser(listaUser);
	        	pause();
	        	break;
	        default:
	            if(escolha == '0'){
	                break;
	            }else{
	                System.out.println("Opção não encontrada!!");
	                break;
	            }
			}
		}while(escolha != '0');
	}
}
