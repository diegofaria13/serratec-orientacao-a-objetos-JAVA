package Exercicio_1_E_2;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica1 = new Clinica("Clinprev", "Cardiograma", "123456-90");
		Medico medico1 = new Medico("Plan vida", "Augusto Medici", 123345621);
		Anestesista anestesista1= new Anestesista("Plan Vida", "Carlos Andre", 765431, "Geral");
		ControlePagamento controle = new ControlePagamento();
		
		clinica1.calcularPagamento();
		medico1.calcularPagamento();
		anestesista1.calcularPagamento();
		
		controle.calcularTitalPago(clinica1);
		controle.calcularTitalPago(medico1);
		controle.calcularTitalPago(anestesista1);
		
		System.out.println(clinica1);
		System.out.println(medico1);
		System.out.println(anestesista1);
		System.out.println(String.format("Total pago pelo plano: %.2f", controle.getTotalPago()));

	}

}
