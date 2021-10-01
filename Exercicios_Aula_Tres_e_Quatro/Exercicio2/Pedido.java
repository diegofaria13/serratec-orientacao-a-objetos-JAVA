package Exercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	private double total;
	static int TotPedidos;
	
	
	
	public Pedido() {
		TotPedidos += 1;
	}

	public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		
		TotPedidos += 1;
	}
	
	/*COnstrutor com data automatica. overload <----polimorfismo
	 * exemplo p a hora ser na hora do pedido sem eu entrar ela como parametro
	 * 
	 * public Pedido(int numero, double quantidade, double valor){
	 * 	this(numero, localDate.now(), quantidade valor);
	 * 
	 * */

	
	public int getNumero() {
		return numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
    }

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}
	
	
	public void Finalizar() {
		if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			this.total = (this.valor - (this.valor * 0.10)) * this.quantidade;
		}
		else {
			this.total = this.valor * this.quantidade;
		}
	}
	
}
