package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jose Sauro";
		u1.email = "jsauro@mail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jose Sauro";
		u2.email = "jsauro@mail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
	}
}
