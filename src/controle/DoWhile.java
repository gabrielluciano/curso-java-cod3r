package controle;

public class DoWhile {

	public static void main(String[] args) {
		
		// do {} while(...);
		
		int i = 10;
		do {
			System.out.println("i = " + i);
			i--;
		} while (i >= 1);
		
		int x = 0;
		do {
			System.out.println("x = " + x);
			x++;
		} while (x > 10);
	}
}
