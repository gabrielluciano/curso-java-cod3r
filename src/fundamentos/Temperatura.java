package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		
		double tempFahrenheit = 60.0;
		double tempCelsius = (tempFahrenheit - 32) * FATOR;
		System.out.println(tempCelsius);
		
		tempFahrenheit = 86.0;
		tempCelsius = (tempFahrenheit - 32) * FATOR;
		System.out.println(tempCelsius);
	}
}
