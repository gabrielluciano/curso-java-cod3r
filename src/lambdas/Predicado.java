package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) > 750.0;
		
		Produto produto = new Produto("Geladeira", 3021.99, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
