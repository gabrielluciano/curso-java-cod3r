package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// Pode lançar exceção de Cast
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		// Pode lançar exceção de Cast
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimoNumero2);
	}
}
