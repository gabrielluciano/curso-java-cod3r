package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Geladeira", 3199.99, 0.1);
		Produto p2 = new Produto("iPad", 3235.89, 0.13);
				
		System.out.println(calculaPrecoFinal(p1));
		System.out.println(calculaPrecoFinal(p2));
	}
	
	public static String calculaPrecoFinal(Produto produto) {
		Function<Produto, Double> precoComDesconto = 
				p -> p.preco * (1 - p.desconto);
		
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete =
				preco -> preco + (preco >= 3000 ? 100 : 50);
				
		Function<Double, String> precoFormatado =
				preco -> String.format("R$%.2f", preco).replace(".", ",");
				
		return precoComDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(precoFormatado)
				.apply(produto);
	}
}
