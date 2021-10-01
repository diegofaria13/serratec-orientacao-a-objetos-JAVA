package Exercicio_1;

public class programEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Diego", "Faria", 3552.20);
		Empregado empregado2 = new Empregado("Diego", "Denovo", 4900.00);
		
		
		empregado1.CalculaImpostoDeRenda(empregado1.getSalario());
		empregado2.CalculaImpostoDeRenda(empregado2.getSalario());
		
		empregado1.imprimirDadosEmpregado();
		empregado2.imprimirDadosEmpregado();
		
	}

}
