package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João", 8.9);
		Aluno a2 = new Aluno("Bia", 7.8);
		Aluno a3 = new Aluno("Leo", 5.2);
		Aluno a4 = new Aluno("Marcos", 4.4);
		Aluno a5 = new Aluno("Julia", 9.5);
		Aluno a6 = new Aluno("Renata", 6.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 6.0;
		Function<Aluno, String> parabens = a -> a.nome + " aprovado. Parabéns!";
		
		alunos.stream()
			.filter(aprovado)
			.map(parabens)
			.forEach(System.out::println);
	}
}
