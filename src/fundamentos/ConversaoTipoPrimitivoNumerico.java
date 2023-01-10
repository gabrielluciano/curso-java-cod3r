package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		float b = 1.0F; // conversão explícita
		System.out.println(b);
		
		float c = (float) 1.21019; // conversão explícita usando cast
		System.out.println(c);
		
		int d = 4;
//		byte e = d; // Erro
		byte e = (byte) d;
		System.out.println(e);
		
		// Exemplo de conversão que gera um resultado estranho
		int f = 200;
		byte g = (byte) f;
		System.out.println(g);
	}
}
