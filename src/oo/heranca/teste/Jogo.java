package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.setX(10);
		monstro.setY(10);
		
		Jogador heroi = new Heroi(10, 11);
		
		System.out.printf("x = %d, y = %d\n", monstro.getX(), monstro.getY());
		
		System.out.println("vida monstro = " + monstro.getVida());
		System.out.println("vida heroi = " + heroi.getVida());
		System.out.println();
		
		System.out.println("heroi ataca? = " + heroi.atacar(monstro));
		System.out.println("monstro ataca? = " + monstro.atacar(heroi));
		System.out.println();
		
		System.out.println("heroi ataca? = " + heroi.atacar(monstro));
		System.out.println("monstro ataca? = " + monstro.atacar(heroi));
		System.out.println();
		
		System.out.println("heroi andou? "+ heroi.andar(Direcao.NORTE));
		System.out.println();
		
		System.out.println("heroi ataca? = " + heroi.atacar(monstro));
		System.out.println("monstro ataca? = " + monstro.atacar(heroi));
		System.out.println();
		
		System.out.println("vida monstro = " + monstro.getVida());
		System.out.println("vida heroi = " + heroi.getVida());
		System.out.println();
	}
}
