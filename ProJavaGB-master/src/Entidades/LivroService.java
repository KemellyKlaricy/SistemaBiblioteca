package Entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class LivroService {
	
    Scanner entradaSt = new Scanner(System.in);

    public void cadastroLivro(ArrayList<Livro> biblioteca){
        Livro livro = new Livro();
        livro.cadastroL();
        biblioteca.add(livro);
    }
    
    public void excluirLivro(ArrayList<Livro> biblioteca){
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
    
    public void visualizarLivro(ArrayList<Livro> biblioteca){
        System.out.println("Informe o ID do usuário que deseja visualizar: ");
        String idTemp = entradaSt.nextLine();
        for(Livro book: biblioteca){
            String idAux = book.isbn;
            if(idAux.equals(idTemp)){
                System.out.printf("Titulo: %s\n" +
                        "Autor: %s\n" +
                        "ISBN: %s\n" +
                        "Editora: %s\n" +
                        "Ano: %d\n" +
                        "Estoque: %d",book.titulo,book.autor,book.isbn,book.editora,book.anoPublicacao,book.quantidadeDisponivel);
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }
}
