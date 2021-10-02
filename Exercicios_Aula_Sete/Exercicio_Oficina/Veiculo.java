package Exercicio_Oficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public abstract class Veiculo implements Oficina{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	@Override
	public String toString() {
		return String.format("- Modelo: %s, Data: %s, Proprietario: %s, Valor Cobrado: %.2f ", this.modelo, this.dataConserto, proprietario.getNome(), this.valorCobrado);
	}
	
	public double getValorCobrado() {
		return valorCobrado;
	}
	
	@Override
	public double lavarVeiculo() {
		return valorCobrado;
	}
	
	@Override
	
	public double trocarOleo() {
		return valorCobrado;
	}
	
	@Override
	public double revisao() {
		return valorCobrado;
	}

}
