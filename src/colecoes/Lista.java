package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("José"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Manu"));
		
		// Retorna o objeto removido
		System.out.println(lista.remove(1));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		System.out.println(lista.get(2));
		
		// Irá utilizar o método equals para remover o Usuário
		// Retorna true/false
		System.out.println(lista.remove(new Usuario("Carlos")));
		
		System.out.println("Tem ? " + lista.contains(new Usuario("José")));
	}
}
