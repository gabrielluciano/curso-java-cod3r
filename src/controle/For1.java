package controle;

public class For1 {

	public static void main(String[] args) {
		
		int x = 2;
		for (; x <= 20; x+=2) {
			System.out.printf("x = %d\n", x);
		}
		
		int i = 1;
		for (; i <= 10;) {
			System.out.println("i = " + i);
			i++;
		}
	}
}
