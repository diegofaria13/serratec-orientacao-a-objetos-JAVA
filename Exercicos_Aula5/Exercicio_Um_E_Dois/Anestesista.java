package Exercicio_1_E_2;

public class Anestesista extends Medico {
	private String tipoAnestesia;
	
	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}
	
	public String getTipoAnestesia() {
		return this.tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " - Tipo Anestesia: %s", this.tipoAnestesia);
	}
	
	@Override
	public double calcularPagamento() {
		double pagoPeloPlano = super.calcularPagamento();
		return valorPago = pagoPeloPlano + 1000; 
	}
	

}
