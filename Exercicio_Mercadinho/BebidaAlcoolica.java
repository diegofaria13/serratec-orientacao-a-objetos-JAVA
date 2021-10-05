package ExercicioMercado;

public class BebidaAlcoolica extends Produto {
	
	private double teorAlcoolico;

	public BebidaAlcoolica(String nome, double valor, double teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " - Teor alcoolico: %.2f - ", this.teorAlcoolico);
	}
	
}
