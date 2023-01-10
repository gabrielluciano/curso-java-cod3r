package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		System.out.println("==============UniDirecional");
		
		CompraUni compra1 = new CompraUni();
		compra1.cliente = "João Pedro";
		compra1.itens.add(new ItemUni("Caneta", 5, 1.99));
		compra1.itens.add(new ItemUni("Borracha", 12, 0.99));
		compra1.itens.add(new ItemUni("Caderno", 3, 18.79));

		System.out.println(compra1.itens.size());
		System.out.printf("R$%.2f", compra1.getValorTotal());
		
		System.out.println("");
		System.out.println("==============BiDirecional");
		
		CompraBi compra2 = new CompraBi();
		compra2.cliente = "João Pedro";
		compra2.adicionarItem(new ItemBi("Caneta", 10, 1.99));
		compra2.adicionarItem(new ItemBi("Borracha", 12, 0.99));
		compra2.adicionarItem(new ItemBi("Caderno", 5, 18.79));
		compra2.adicionarItem("Apontador", 1, 3.99);

		System.out.println(compra2.itens.size());
		System.out.printf("R$%.2f\n", compra2.getValorTotal());
		System.out.println(compra2.itens.get(0).compra.itens.get(1).compra.itens.size());
		
	}

}
