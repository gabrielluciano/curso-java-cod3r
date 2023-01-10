package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p = new Produto("Caneta", 1.99, 0.0);
		imprimir.accept(p);
		
		List<Produto> produtos = Arrays.asList(
				p,
				new Produto("TV", 3999.78, 0.10),
				new Produto("PS5", 2500.32, 0.15) 
		);
		
		produtos.forEach(imprimir);
	}
}
