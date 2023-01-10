package fundamentos;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Trabalho terça?: ");
		boolean trabalho1 = Boolean.parseBoolean(s.nextLine());
		System.out.print("Trabalho quinta?: ");
		boolean trabalho2 = Boolean.parseBoolean(s.nextLine());
		
		System.out.println("\nTV 32\": " + (trabalho1 ^ trabalho2));
		System.out.println("TV 50\": " + (trabalho1 && trabalho2));
		System.out.println("Sorvete: " + (trabalho1 || trabalho2));
		System.out.println("Mais saudável?: " + !(trabalho1 || trabalho2));
		
		s.close();
	}
}
