package Exercicio_1_E_2;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;

	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	@Override
	public String toString() {
		return String.format("Plano - %s, Valor Pago: %.2f - " , this.empresa, this.valorPago);
	}

	
	public double calcularPagamento() {
		return valorPago = valorPago - (valorPago * (valorIss/100));
	}

}
