package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	// posso ter método default
	default String legal() {
		return "legal";
	}
	
	// também posso ter métodos static
	static String muitoLegal() {
		return "muito legal";
	}
}
