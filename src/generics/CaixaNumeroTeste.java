package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		// CaixaNumero<String> caixaA = new CaixaNumero<>(); // Erro
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(3.1415);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(3);
		System.out.println(caixaB.abrir());
	}
}
