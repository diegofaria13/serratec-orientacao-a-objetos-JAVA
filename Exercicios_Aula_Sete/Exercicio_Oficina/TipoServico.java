package Exercicio_Oficina;

public enum TipoServico{
	OLEO(50), LAVAGEM(100), REVISAO(200);
	
	private double valorPorServico;
	
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return this.valorPorServico;
	}
		

}
