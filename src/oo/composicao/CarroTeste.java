package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		System.out.println(c.motor.giros());
		c.acelerar();
		System.out.println(c.motor.giros());
		
		// Relacionamento bidirecional entre carro e motor
		System.out.println(c.motor.carro.motor.carro.motor.giros());
	}
}
