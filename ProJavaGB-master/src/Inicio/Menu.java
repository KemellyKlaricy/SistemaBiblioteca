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
	private Scanner sc = new Scanner(System.in);
	private ArrayList<User> listaUser = new ArrayList<>();
	private ArrayList<Livro> biblioteca = new ArrayList<>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

	private EmprestimoService emprestimoService = new EmprestimoService();
	private LivroService livroService = new LivroService();
	private UserService userService = new UserService();

	public static void pause() {
		System.out.println("\nPressione Enter para continuar...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}

	public void OpcaoMenu() {
		System.out.println("====== Menu Inicial =====");

		char escolha;
		do {
			System.out.println("Escolha uma das opções a seguir:\n" +
					"1 - Registrar empréstimo.\n" +
					"2 - Cadastrar Livro.\n" +
					"3 - Apagar Livro \n" +
					"4 - Editar Livro \n" +
					"5 - Visualizar Livro \n" +
					"6 - Cadastrar Usuário\n"+
					"7 - Editar Usuário\n"+
					"8 - Excluir Usuário \n"+
					"9 - Visualizar Usuário\n" +
					"0 - Sair");

			System.out.print("Digite sua escolha: ");
			String input = sc.nextLine();

			if (input.length() > 0) {
				escolha = input.charAt(0);
			} else {
				escolha = ' ';
			}

			switch (escolha) {
				case '1':
					emprestimoService.registroEmprestimo(listaUser, biblioteca, emprestimos);
					break;
				case '2':
					livroService.cadastroLivro(biblioteca);
					break;
				case '3':
					livroService.excluirLivro(biblioteca);
					break;
				case '4':
					livroService.editarLivro(biblioteca);
					break;
				case '5':
					livroService.visualizarLivro(biblioteca);
					break;
				case '6':
					userService.cadastroUser(listaUser);
					break;
				case '7':
					userService.editarUser(listaUser);
					break;
				case '8':
					userService.excluirUser(listaUser);
					break;
				case '9':
					userService.visualizarUser(listaUser);
					break;
				case '0':
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
			pause();
		} while (escolha != '0');
	}
}