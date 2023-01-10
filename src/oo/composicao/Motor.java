package oo.composicao;

public class Motor {

	Carro carro;
	boolean ligado = false;
	int rpmPadrao = 3000;
	double fatorInjecao = 1;
	
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	int giros() {
		return (int) Math.round(rpmPadrao * fatorInjecao);
	}
}
