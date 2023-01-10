package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		// Criando stream diretamente pelos parâmetros de of
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		// Criando streams a partir de um array do java
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); // [1, 4[
		
		// Criando streams a partir de listas
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream infinita sem ordenação
		// Primeiro parâmetro é a função para gerar a stream
		// Stream.generate(() -> "a").forEach(print);
		
		// Stream infinita COM ordenação
		// Primeiro parâmetro é o seed (valor inicial)
		// Segundo parâmetro é a função que vai iterar sobre o valor da última iteração
		// (inicialmente o seed)
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
