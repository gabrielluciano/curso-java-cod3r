package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		
		a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		Produto p1 = new Produto();
		p1.nome = "Geladeira";
		
		Produto p2 = p1;
		p2.nome = "TV";
		
		System.out.println("Nome: " + p1.nome);
		
		modificaObjeto(p2);
		System.out.println(p2.preco);
	}
	
	static void modificaObjeto(Produto produto) {
		produto.preco = 1999.99;
	}
}
