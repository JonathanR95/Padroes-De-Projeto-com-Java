package one.digitalinovation;

import one.digitalinovation.facade.Facade;
import one.digitalinovation.singleton.SingletonEager;
import one.digitalinovation.singleton.SingletonLazy;
import one.digitalinovation.singleton.SingletonLazyHolder;
import one.digitalinovation.strategy.Comportamento;
import one.digitalinovation.strategy.ComportamentoAgressivo;
import one.digitalinovation.strategy.ComportamentoDefensivo;
import one.digitalinovation.strategy.ComportamentoNormal;
import one.digitalinovation.strategy.Robo;


public class Teste {

	public static void main(String[] args) {
		//testes relacionados ao design pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
			
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();			
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton ", "1480178825");
		
	}

}
