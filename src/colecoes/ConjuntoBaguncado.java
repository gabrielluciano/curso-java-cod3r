package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("Teste"); // não aceita repetição!
		System.out.println("Tamanho é: " +  conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // não removeu
		System.out.println(conjunto.remove("Teste")); // removeu
		System.out.println("Tamanho é: " +  conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(2));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(conjunto);
		System.out.println(nums);
		
		conjunto.addAll(nums); // União entre dois conjuntos
//		conjunto.retainAll(nums); // Interseção entre dois conjuntos. Só vai manter os elementos de conjunto que estiverem contidos em nums
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
