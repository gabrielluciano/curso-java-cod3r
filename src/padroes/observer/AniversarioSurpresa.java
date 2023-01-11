package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		porteiro.registrarObservador((evt) -> {
			System.out.println("Data: " + evt.getMomento());
		});
		porteiro.monitorar();
	}
}
