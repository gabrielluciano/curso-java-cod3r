package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	private static final Predicate<Aluno> aprovado = a -> a.nota >= 7;
	private static final Function<Aluno, Double> nota = a -> a.nota;
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna",6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		System.out.println(getSomatorioMediaAprovados(alunos));
	}
	
	private static Double getSomatorioMediaAprovados(List<Aluno> alunos) {
		return alunos.parallelStream()
			.filter(aprovado)
			.map(nota)
			.reduce(Double::sum)
			.orElse(0.0);
	}
}
