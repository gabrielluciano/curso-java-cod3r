package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1); // NullPointerException
		} catch(Exception exception) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do aluno");
		}
		
		
		try {
			System.out.println(7 / 0); // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
