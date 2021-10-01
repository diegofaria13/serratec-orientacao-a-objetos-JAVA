package Exercicio3;

public class testaIr {

	public static void main(String[] args) {
		
		PessoaFisica Pfisica = new PessoaFisica ("Diego", 10.12, "123", "456");
		PessoaJuridica Pjuridica = new PessoaJuridica ("Carolina", 12.00, "456", "789");
		
		Pfisica.calculoIr();
		Pjuridica.calculoIr();
		
		System.out.println(Pfisica);
		System.out.println(Pjuridica);
	}
	
	

}
