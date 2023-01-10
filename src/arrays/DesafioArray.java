package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas notas quer informar? ");
		int qtdNotas = sc.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nDigite a %dª nota: ", i + 1);
			notas[i] = sc.nextDouble();
		}

		sc.close();
		
		System.out.printf("\n\nSua média é: %.2f", calculaMedia(notas));
	}
	
	private static double calculaMedia(double[] notas) {
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		return total / notas.length;
	}
}
