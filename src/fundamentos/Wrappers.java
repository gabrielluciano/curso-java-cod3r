package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		Integer i = Integer.parseInt(s.nextLine());
		System.out.printf("Resultado: %d\n", i*3);
		
		s.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		// Convertendo boolean primitivo para string
		boolean boo = false;
		System.out.println(("" + boo).toUpperCase());
	}
}
