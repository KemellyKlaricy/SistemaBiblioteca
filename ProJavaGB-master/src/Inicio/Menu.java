package Inicio;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void OpcaoMenu(){
		System.out.println("====== Menu Inicial =====");
		
		char escolha;
		do {
			System.out.println("Escolha um das opcões a seguir:\n" +
                    "1 - Registrar emprestimo.\n" +
                    "2 - Registrar Livro.\n" +
                    "3 - Registrar User\n");
            escolha = sc.next().charAt(0);
		
			switch(escolha){
	
	        case '1':
	        	
	            break;
	
	        case '2':
	            break;
	
	        case '3':
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
