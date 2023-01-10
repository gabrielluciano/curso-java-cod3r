package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class CompraUni {

	String cliente;
	List<ItemUni> itens = new ArrayList<>();
	
	double getValorTotal() {
		double total = 0;
		for (ItemUni item : itens) {
			total += item.preco * item.quantidade;
		}
		return total;
	}
	
}
