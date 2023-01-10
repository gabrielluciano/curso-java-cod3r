package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Separando centenas/dezenas/etc
		long a = 2_320_730;
		System.out.println(a);
		
		double x = 2_734_289.34820983;
		System.out.println(x);
		
		// Informando ao java o tipo long
		long ptsAcumulados;
		ptsAcumulados = 1_134_845_223; // OK
//		ptsAcumulados = 3_134_845_212; // Erro
		ptsAcumulados = 3_134_845_212L;
		
		// Tipos numéricos reais
		float salario;
//		salario = 11_445.44;  // Erro
		salario = 11_445.44F; // OK
		
		// Char aceita unicode
		char status = '\u0010';
		System.out.println(status);
	}
}
