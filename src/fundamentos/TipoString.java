package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));		
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("ARDE"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 2000.14;

		System.out.println(
				"Nome: " + nome +
				"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%f", nome,
				sobrenome, idade, salario);
		
		System.out.println();
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome,
				sobrenome, idade, salario);
		System.out.println(frase);
	}
}
