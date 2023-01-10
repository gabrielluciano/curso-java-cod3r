package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; // Vai receber o valor unicode na base decimal
		
		System.out.println(a == b); // true
		System.out.println('\u0061'); // valor em hexadecimal que equivale ao caracter 'a' na tabela unicode
	}
}
