package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if (chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		/**
		 * Contains utiliza equals e hashCode e nesse caso esses
		 * métodos utilizam apenas a chave para comparar dois objetos
		 * do tipo Par, devido a nossa implementação. Dessa forma,
		 * contains vai retornar true se a chave for igual idenpende
		 * do valor, logo removemos o elemento antigo e adicionamos
		 * o novo para mudar o valor
		 */
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(new Par<C, V>(chave, valor));
	}
	
	public V getValor(C chave) {
		if (chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent()
				? parOpcional.get().getValor() : null;
	}
}
