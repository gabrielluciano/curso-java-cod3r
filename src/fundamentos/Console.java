package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("\n\nNome = " + nome + ". Idade = " + idade);
		
		sc.close();
	}
}
