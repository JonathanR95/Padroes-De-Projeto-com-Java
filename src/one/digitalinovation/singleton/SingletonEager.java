package one.digitalinovation.singleton;

/**
 * Singleton "apressado"
 * 
 * @author flavojr
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
}
