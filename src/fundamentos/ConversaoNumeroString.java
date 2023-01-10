package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer n1 = 10000;
		System.out.println(n1.toString().length());
		
		int n2 = 2320;
		System.out.println(Integer.toString(n2).length());
		
		System.out.println(("" + n2).length());
	}
}
