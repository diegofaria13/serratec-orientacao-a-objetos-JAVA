package Exercicio2;

import java.time.LocalDate;

public class venda {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1, LocalDate.now(), 2, 50.00);
		Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 9, 19), 4, 2.38);
		Pedido pedido3 = new Pedido(3, LocalDate.now(), 3, 36.12);
		
		pedido1.Finalizar();
		pedido2.Finalizar();
		pedido3.Finalizar();
		
		System.out.println(pedido1.getTotal());
		System.out.println(pedido2.getTotal());
		System.out.println(pedido3.getTotal());
		
		System.out.println("Total de pedidos de hoje: " + Pedido.TotPedidos);
		
		
		

	}

}
