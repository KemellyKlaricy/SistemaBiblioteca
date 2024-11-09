package Inicio;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.*;

public class Bibliotecario implements Menu {

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

	@Override
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
				emprestimoService.visualizar(emprestimos);
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

	@Override
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
					livroService.cadastro(biblioteca);
					break;
				case '2':
					livroService.excluirLivro(biblioteca);
					break;
				case '3':
					livroService.visualizar(biblioteca);
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

	@Override
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
					userService.cadastro(listaUser);
					break;
				case '2':
					userService.excluirUser(listaUser);
					break;
				case '3':
					userService.visualizar(listaUser);
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

	@Override
	public void OpcaoMenu() {
		Livro l1 = new Livro("O desaparecimento de Alice Norman", "Ólavo Meia-lua", "TS Livros",
				"157-24-854-4152-8","Mistério | Drama", 2018, 14);
		Livro l2 = new Livro("Os quatro filhos", "Larissa de Oliveira", "TS Livros",
				"178-24-157-5893-7","Horror | Drama | Sobrenatural", 2005, 8);
		biblioteca.add(l1);
		biblioteca.add(l2);

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