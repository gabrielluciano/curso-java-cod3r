package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private final List<ObservadorChegadaAniversariante> observadores
		= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner sc = new Scanner(System.in);

		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			
			System.out.print("Aniversariante chegou? ");
			valor = sc.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				// criar evento
				EventoChegadaAniversariante evt = 
						new EventoChegadaAniversariante(new Date());
				
				// notificar observadores
				observadores.stream()
					.forEach(o ->o.chegou(evt));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}

		sc.close();
	}
}
