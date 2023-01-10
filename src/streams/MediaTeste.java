package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(9.3).adicionar(6.7);
		Media m2 = new Media().adicionar(5.5).adicionar(8.9);
		Media m3 = Media.combinar(m1, m2);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		System.out.println(m3.getValor());
	}
}
