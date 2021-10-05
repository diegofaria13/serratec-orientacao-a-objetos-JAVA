package ExercicioMercado;

public class Eletrodomestico extends Produto {
	
	private int voltagem;

	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " - Voltagem: %d - ", this.voltagem);
	}
	

}
