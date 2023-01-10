package oo.composicao;

public class Carro {

	Motor motor;
	
	Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.1;
	}
	
	int velocidade() {
		return motor.giros();
	}
}
