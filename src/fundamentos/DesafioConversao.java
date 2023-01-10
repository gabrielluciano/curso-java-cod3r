package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário:");
		double salario1 = toDouble(s.nextLine());
		System.out.println("Digite o segundo salário:");
		double salario2 = toDouble(s.nextLine());
		System.out.println("Digite o terceiro salário:");
		double salario3 = toDouble(s.nextLine());
		
		double media = (salario1 + salario2 + salario3) / 2;
		System.out.printf("A média dos salários é R$%.2f", media);
		s.close();
	}
	
	private static double toDouble(String s) {
		return Double.parseDouble(s.replace(",", "."));
	}
}
