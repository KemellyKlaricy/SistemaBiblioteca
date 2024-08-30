package Entidades;
import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    String editora;
    String isbn;
    int anoPublicacao;
    int quantidadeDisponivel;

    Scanner entradaSt = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);

    public void cadastroL() {

        System.out.println("Informe o Titulo do livro a ser registrado: ");
        titulo = entradaSt.nextLine();

        System.out.println("Informe o nome do Autor: ");
        autor = entradaSt.nextLine();

        System.out.println("Informe a Editora: ");
        editora = entradaSt.nextLine();

        System.out.println("Informe o ISBN: ");
        isbn = entradaSt.nextLine();

        System.out.println("Informe o Ano de publicação: ");
        anoPublicacao = entradaInt.nextInt();

        System.out.println("Informe a quantidade de Exemplares deisponiveis: ");
        quantidadeDisponivel = entradaInt.nextInt();

    }

    public void editarL(){
        char c;
        do{
            System.out.println("Escolha um das opcões a seguir:\n" +
                    "1 - Para editar titulo.\n" +
                    "2 - Para editar autor.\n" +
                    "3 - Para editar editora.\n" +
                    "4 - Para editar isbn.\n" +
                    "5 - Para editar Ano de publicação.\n" +
                    "6 - Para editar a quantidade em estoque.\n");
            c = entradaSt.next().charAt(0);
            switch(c){

                case '1':
                    System.out.println("Informe o novo Titulo: ");
                    titulo = entradaSt.nextLine();
                    break;

                case '2':

                    System.out.println("Informe novo nome do Autor: ");
                    autor = entradaSt.nextLine();
                    break;

                case '3':

                    System.out.println("Informe a nova Editora do Livro: ");
                    editora = entradaSt.nextLine();
                    break;

                case '4':

                    System.out.println("Informe o novo ISBN: ");
                    isbn = entradaSt.nextLine();
                    break;

                case '5':

                    System.out.println("Informe o novo Ano de publicação: ");
                    anoPublicacao = entradaInt.nextInt();
                    break;

                case '6':

                    System.out.println("Informe a quantidade em estoque: ");
                    quantidadeDisponivel = entradaInt.nextInt();
                    break;

                default:
                    if(c == '0'){
                        break;
                    }else{
                        System.out.println("Opção não encontrada!!");
                        break;
                    }
            }
        }while(c != '0');

    }

    public void excluirL(){
        titulo = null;
        autor = null;
        editora = null;
        isbn = null;
        anoPublicacao = 0;
        quantidadeDisponivel = 0;
    }
}