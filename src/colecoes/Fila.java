package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // primeiro elemento
		System.out.println(fila.peek()); // primeiro elemento
		System.out.println(fila.element()); // primeiro elemento
		System.out.println(fila.element()); // primeiro elemento
		
		System.out.println(fila.size());
//		fila.clear();
		System.out.println(fila.isEmpty());
		
		// Retorna o primeiro elemento da fila REMOVENDO-O
		// Caso a fila esteja vazia se comporta como o peek (retorna null)
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// Remove é similar ao poll, mas lança exceção se a lista estiver vazia
		System.out.println(fila.remove());
		
		// fila.contains(...);
	}
}
