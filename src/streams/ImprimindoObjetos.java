package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "José");
		
		// Foreach
		System.out.println("Usando o foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// Usando iterators
		System.out.println("\nUsando o Iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Usando Stream
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!
	}
}
