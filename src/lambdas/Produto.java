package lambdas;

public class Produto extends Object {

	final String nome;
	final Double preco;
	final double desconto;
	
	public Produto(String nome, Double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
}
