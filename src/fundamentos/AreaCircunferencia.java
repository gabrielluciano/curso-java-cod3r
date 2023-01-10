package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		// PI = 1; // Error
		
		double area = PI * raio * raio;
		System.out.println(area);
	}
}
