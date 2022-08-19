package one.digitalinovation.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author flavojr
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
