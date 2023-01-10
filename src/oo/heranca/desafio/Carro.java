package oo.heranca.desafio;

public class Carro {

	public int velocidadeAtual = 0;
	private int delta = 5;
	
	public boolean acelerar() {
		velocidadeAtual += delta;
		return true;
	}
	
	public boolean frear() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
			return true;
		}
		velocidadeAtual = 0;
		return false;
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
}
