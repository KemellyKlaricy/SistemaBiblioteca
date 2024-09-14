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

	public void menuEmprestimo(){
		System.out.println("");
		char escolha;
		do {
			System.out.println("Escolha uma das opções a seguir:\n" +
					"1 - Registrar empréstimo.\n" +
					"2 - Registrar devolução.\n" +
					"3 - Acessar empréstimo. \n" +
					"0 - Retornar.");

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
				emprestimoService.registroDevolucao(emprestimos);
				break;
			case '3':
				emprestimoService.verEmprestimo(emprestimos);
				break;
			case '0':
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
		}
		pause();
	} while (escolha != '0');

	}

	public void menuLivro(){
		System.out.println("");
		char escolha;
		do {
			System.out.println("Escolha uma das opções a seguir:\n" +
					"1 - Cadastrar livro.\n" +
					"2 - Retirar livro da biblioteca.\n" +
					"3 - Acessar livro. \n" +
					"0 - Retornar.");

			System.out.print("Digite sua escolha: ");
			String input = sc.nextLine();
			if (input.length() > 0) {
				escolha = input.charAt(0);
			} else {
				escolha = ' ';
			}
			switch (escolha) {
				case '1':
					livroService.cadastroLivro(biblioteca);
					break;
				case '2':
					livroService.excluirLivro(biblioteca);
					break;
				case '3':
					livroService.visualizarLivro(biblioteca);
					break;
				case '0':
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
			pause();
		} while (escolha != '0');
	}

	public void menuUsuario(){
		char escolha;
		System.out.println("");
		do {
			System.out.println("Escolha uma das opções a seguir:\n" +
					"1 - Cadastrar usuário.\n" +
					"2 - Desvincular usuário.\n" +
					"3 - Acessar dados do usuário. \n" +
					"0 - Retornar.");

			System.out.print("Digite sua escolha: ");
			String input = sc.nextLine();
			if (input.length() > 0) {
				escolha = input.charAt(0);
			} else {
				escolha = ' ';
			}
			switch (escolha) {
				case '1':
					userService.cadastroUser(listaUser);
					break;
				case '2':
					userService.excluirUser(listaUser);
					break;
				case '3':
					userService.visualizarUser(listaUser);
					break;
				case '0':
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
			pause();
		} while (escolha != '0');
	}

	public void OpcaoMenu() {
		System.out.println("====== Menu Inicial =====");

		char escolha;
		do {
			System.out.println("Escolha uma das opções a seguir:\n" +
					"1 - Analisar empréstimo.\n" +
					"2 - Analisar biblioteca.\n" +
					"3 - Analisar usuários\n" +
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
					menuEmprestimo();
					break;
				case '2':
					menuLivro();
					break;
				case '3':
					menuUsuario();
					break;
				case '0':
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					pause();
					break;
			}
		} while (escolha != '0');
	}
}