package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno príncipe"); // true ou exceção (pilha cheia)
		livros.push("Don Quixote"); // sem retorno ou exceção (pilha cheia)
		livros.push("O hobbit");
		
		// Sem remoção
		System.out.println(livros.peek()); // último elemento
		System.out.println(livros.peek());
		System.out.println(livros.element()); // último elemento
		
		// Removendo elemento
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll()); // null
		
//		System.out.println(livros.remove());
//		System.out.println(livros.remove());
//		System.out.println(livros.remove());
//		System.out.println(livros.remove()); // exception
		
//		System.out.println(livros.pop());
//		System.out.println(livros.pop());
//		System.out.println(livros.pop());
//		System.out.println(livros.pop()); // exception
	
//		livros.size();
//		livros.clear();
//		livros.contains(...);
//		livros.isEmpty();
	}
}
