package Exercicio_Oficina;

import java.time.LocalDate;

public class TestaOficina {

	public static void main(String[] args) {
		Proprietario prop1 = new Proprietario("Diego");
		Carro carro1 = new Carro("Gol", LocalDate.now(), prop1, "Passeio");
		
		carro1.trocarOleo();
		carro1.revisao();
		
		System.out.println(carro1);

	}

}
