package oo.composicao.desafio;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Processador", 299.99);
		Produto p2 = new Produto("Memória RAM", 99.65);
		Produto p3 = new Produto("HD 500GB", 190.99);
		Produto p4 = new Produto("Placa mãe", 494.89);
		
		Compra c1 = new Compra();
		c1.adicionarItem(new Item(p1, 1));
		c1.adicionarItem(new Item(p2, 2));
		c1.adicionarItem(new Item(p3, 3));
		c1.adicionarItem(new Item(p4, 1));
		
		Compra c2 = new Compra();
		c2.adicionarItem(new Item(p2, 1));
		c2.adicionarItem(new Item(p3, 2));
		c2.adicionarItem(new Item(p4, 2));
		
		Cliente cliente = new Cliente("José");
		cliente.adicionarCompra(c1);
		System.out.printf("Total = R$%.2f\n", cliente.obterValorTotal());
		
		cliente.adicionarCompra(c2);
		System.out.printf("Total = R$%.2f\n", cliente.obterValorTotal());
	}
}
