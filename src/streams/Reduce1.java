package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		BinaryOperator<Integer> soma = (acum, n) -> acum + n;
		
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(10, soma);
		System.out.println(total2);
		
		nums.stream()
			.filter(n -> n > 2)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
