package oo.heranca;

public class Heroi extends Jogador {

	//	Na opção abaixo reescrevo o método inteiro apenas dobrando o valor do ataque
	
//	boolean atacar(Jogador oponente) {
//		
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if (deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		}
//		
//		return false;
//	}
	
	// 	Outra forma de obter o mesmo resultado é chamando o método atacar da classe pai
	//	(Jogador) duas vezes
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
}
