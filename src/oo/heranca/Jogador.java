package oo.heranca;

public class Jogador {

	private int vida = 100;
	private int x;
	private int y;
	
	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Jogador() {
		this(0, 0);
	}
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}
		
		return false;
	}
	
	public boolean andar(Direcao direcao)	{
		switch(direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y--;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
