package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// Posso chamar métodos de uma string literal
		System.out.println("Gabriel".toUpperCase());
		
		// Usando múltiplos pontos
		String x = "Bom dia X"
				.replace("X", "povo")
				.toUpperCase()
				.concat("!!!");
		System.out.println(x);
	}
}
