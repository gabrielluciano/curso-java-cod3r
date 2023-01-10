package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public final String mover() {
		return "usando as patas";
	}
	
	public abstract String alimentar();
}
