package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,  "Roberto");
		usuarios.put(1,  "Ricardo"); // Altera
		usuarios.put(1,  "Ricardo");
		usuarios.put(2,  "Rafaela");
		usuarios.put(3,  "Bruno");
		usuarios.put(4,  "Jack");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Bruno"));
		System.out.println(usuarios.get(4));

		System.out.println("Chaves: ");
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("Valores: ");
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("Entradas: ");
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " = " + registro.getValue());
		}
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(32));
		System.out.println(usuarios.remove(2, "Rafaela"));
	}
}
