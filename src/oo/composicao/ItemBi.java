package oo.composicao;

public class ItemBi {

	String nome;
	int quantidade;
	double preco;
	CompraBi compra;
	
	public ItemBi(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
