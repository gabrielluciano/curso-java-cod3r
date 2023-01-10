package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = Double.parseDouble(s.nextLine().replace(",", "."));
		System.out.print("Digite o segundo número: ");
		double num2 = Double.parseDouble(s.nextLine().replace(",", "."));
		System.out.print("Digite a operação: ");
		String operacao = s.nextLine().trim(); // + - * / %
		
		boolean soma = operacao.equals("+");
		boolean subtracao = operacao.equals("-");
		boolean multiplicacao = operacao.equals("*");
		boolean divisao = operacao.equals("/");
		boolean modulo = operacao.equals("%");
		
		double resultado = 0;
		resultado = soma ? num1 + num2 : resultado;
		resultado = subtracao ? num1 - num2 : resultado;
		resultado = multiplicacao ? num1 * num2 : resultado;
		resultado = divisao ? num1 / num2 : resultado;
		resultado = modulo ? num1 % num2 : resultado;
		
		boolean opValida = soma || subtracao || multiplicacao || divisao || modulo;
		
		String mensagem = opValida ? "\n%.2f %s %.2f = %.2f" : "Operação inválida";
		System.out.printf(mensagem, num1, operacao, num2, resultado); 
		
		s.close();
	}
}
