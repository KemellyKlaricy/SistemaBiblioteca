package Entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class LivroService extends Service{
	
    private Scanner entradaSt = new Scanner(System.in);
    private Scanner entradaInt = new Scanner(System.in);


    public void cadastro(ArrayList<Livro> biblioteca){

        System.out.println("Informe o Titulo do livro a ser registrado: ");
        String titulo = entradaSt.nextLine();

        System.out.println("Informe o gênero do livro: ");
        String gereno = entradaSt.nextLine();

        System.out.println("Informe o nome do Autor: ");
        String autor = entradaSt.nextLine();

        System.out.println("Informe a Editora: ");
        String editora = entradaSt.nextLine();

        System.out.println("Informe o ISBN: ");
        String isbn = entradaSt.nextLine();

        System.out.println("Informe o Ano de publicação: ");
        int anoPublicacao = entradaInt.nextInt();

        System.out.println("Informe a quantidade de Exemplares deisponiveis: ");
        int quantidadeDisponivel = entradaInt.nextInt();

        Livro livro = new Livro(titulo, autor,editora,isbn,gereno,anoPublicacao,quantidadeDisponivel);
        biblioteca.add(livro);
    }
    
    public void excluir(ArrayList<Livro> biblioteca){
        System.out.println("Informe o ISBN do livro que deseja deletar: ");
        String idTemp = entradaSt.nextLine();
        
        for(Livro book: biblioteca){
            String idAux = book.isbn;
            if(idAux.equals(idTemp)){
                biblioteca.remove(book);
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void visualizar(ArrayList<Livro> biblioteca){
        System.out.println("Informe o ISBN do livro que deseja visualizar: ");
        String idTemp = entradaSt.nextLine();
        System.out.println(" ");
        for(Livro book: biblioteca){
            String idAux = book.isbn;
            if(idAux.equals(idTemp)){
                System.out.println("_______________________________________________");
                System.out.printf("Titulo: %s\n" +
                        "Autor: %s\n" +
                        "ISBN: %s\n" +
                        "Gêmero: %s\n" +
                        "Editora: %s\n" +
                        "Ano: %d\n" +
                        "Estoque: %d",book.titulo,book.autor,book.isbn,book.genero,book.editora,book.anoPublicacao,book.quantidadeDisponivel);
                System.out.println("\n_______________________________________________");
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }
}
