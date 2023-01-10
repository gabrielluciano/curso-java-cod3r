package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		System.out.println("carro vel. = " + carro.velocidadeAtual);
		System.out.println();
		
		System.out.println("carro acelerou? " + carro.acelerar());
		System.out.println("carro acelerou? " + carro.acelerar());
		System.out.println();
		
		System.out.println("carro vel. = " + carro.velocidadeAtual);
		System.out.println();
		
		System.out.println("carro freou? " + carro.frear());
		System.out.println("carro freou? " + carro.frear());
		System.out.println("carro freou? " + carro.frear());
		System.out.println("carro freou? " + carro.frear());
		System.out.println("carro freou? " + carro.frear());
		System.out.println("carro freou? " + carro.frear());
		System.out.println();
		
		System.out.println("carro vel. = " + carro.velocidadeAtual);
		System.out.println();
		
		Ferrari ferrari = new Ferrari();
		
		System.out.println("ferrari vel. = " + ferrari.velocidadeAtual);
		System.out.println();
		
		System.out.println("ferrari acelerou? " + ferrari.acelerar());
		System.out.println("ferrari acelerou? " + ferrari.acelerar());
		System.out.println();
		
		System.out.println("ferrari vel. = " + ferrari.velocidadeAtual);
		System.out.println();
		
		ferrari.ligarTurbo();
		System.out.println("ferrari acelerou? " + ferrari.acelerar());
		System.out.println();
		
		System.out.println("ferrari vel. = " + ferrari.velocidadeAtual);
		System.out.println();
		
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println();
		
		System.out.println("ferrari vel. = " + ferrari.velocidadeAtual);
		System.out.println();
		
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println("ferrari freou? " + ferrari.frear());
		System.out.println();
		
		System.out.println("ferrari vel. = " + ferrari.velocidadeAtual);
		System.out.println();
	}
}
