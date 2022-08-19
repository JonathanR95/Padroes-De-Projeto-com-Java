package one.digitalinovation.strategy;

public class Robo {
	private Comportamento comportamento;


	public void setComportamento(Comportamento strategy) {
		this.comportamento = strategy;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
}
