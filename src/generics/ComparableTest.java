package generics;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(5);
		nums.add(8);
		nums.add(7);
		nums.add(32);
		nums.add(16);
		nums.add(-7);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
		
		TreeSet<Aluno> alunos = new TreeSet<>();
		alunos.add(new Aluno("Joao", 8.8));
		alunos.add(new Aluno("Maria", 9.5));
		alunos.add(new Aluno("Ze", 4.5));
		
		// Vai gerar um erro pois a classe a aluno
		// não implementa a interface Comparable e não
		// possui o método compareTo
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
