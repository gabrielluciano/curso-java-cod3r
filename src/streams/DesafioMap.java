package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// Function<Integer, String> intToBinaryStr = n -> Integer.toBinaryString(n);
		UnaryOperator<String> reverseStr = 
				str -> new StringBuilder(str).reverse().toString();
		Function<String, Integer> binaryStrToInt =
				str -> Integer.valueOf(str, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(reverseStr)
			.map(binaryStrToInt)
			.forEach(System.out::println);
	}
}
