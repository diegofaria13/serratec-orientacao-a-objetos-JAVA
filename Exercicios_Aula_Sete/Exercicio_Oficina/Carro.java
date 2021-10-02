package Exercicio_Oficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;	
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	@Override
	public double lavarVeiculo() {
		valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado; 
	}
	
	@Override
	
	public double trocarOleo() {
		if(dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50.00;
		}else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}
	
	@Override
	public double revisao() {
		if(dataConserto.getMonth().equals(Month.AUGUST)){
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() - (TipoServico.REVISAO.getValorPorServico() * 0.10);
		}else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}
	
	

}
