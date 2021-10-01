package Exercicio_1_E_2;

public class ControlePagamento {
	private double totalPago;
	
	public double getTotalPago() {
		return this.totalPago;
	}
	
	public void calcularTitalPago(Plano plano) {
		totalPago = totalPago + plano.getValorPago();
	}

}
