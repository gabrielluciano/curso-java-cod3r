package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		// Ex. 1
		Function<Produto, Double> precoComDesconto = 
				p -> p.preco * (1 - p.desconto);
				
		Produto p1 = new Produto("Máquina de Lavar", 1000.0, 0.1);
		System.out.println(precoComDesconto.apply(p1));
		
		
		// Ex. 2
		Function<Integer, String> parOuImpar =
				n -> n % 2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar.apply(2));
		System.out.println(parOuImpar.apply(15));
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";	
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}
}
