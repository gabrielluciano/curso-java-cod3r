package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class CompraBi {

	String cliente;
	List<ItemBi> itens = new ArrayList<>();
	
	void adicionarItem(ItemBi item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new ItemBi(nome, quantidade, preco));
	}
	
	double getValorTotal() {
		double total = 0;
		for (ItemBi item : itens) {
			total += item.preco * item.quantidade;
		}
		return total;
	}
	
}
