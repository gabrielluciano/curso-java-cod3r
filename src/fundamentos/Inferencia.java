package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		a = 12; // Funciona pois o java irá converter para double
		
		// Java irá usar inferência de tipos
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 2.1; // Erro
		
		double d;
		d = 123.23;
		System.out.println(d);
		
//		var e;	// Erro, precisa ser inicializada
//		e = 2;
//		System.out.println(e);
		
	}
	
}
