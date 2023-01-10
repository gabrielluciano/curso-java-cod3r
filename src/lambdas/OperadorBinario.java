package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(Double x, Double y) -> (x + y) / 2;
				
		System.out.println(media.apply(10.0, 5.0));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2; 
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
				
		System.out.println(resultado.apply(6.5, 6.8));
		
		Function<Double, String> conceito = m -> m >= 7.0 ? "Aprovado" : "Reprovado";
		
		String resultadoAluno = media.andThen(conceito).apply(8.0, 7.8);
		System.out.println(resultadoAluno);
	}
}
