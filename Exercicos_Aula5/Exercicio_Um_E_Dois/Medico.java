package Exercicio_1_E_2;

public class Medico extends Plano {
	protected String nome;
	private int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " Médico: %s", this.nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCrm() {
		return this.crm;
	}
	
	@Override
	public double calcularPagamento() {
		double valorPagoPlano = super.calcularPagamento();
		return valorPago = valorPagoPlano * 1.10;
	}

}
