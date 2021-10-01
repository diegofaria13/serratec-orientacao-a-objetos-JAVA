package Exercicio4;

public class testaProgram {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Diego", 6000.20);
		Assistente assistente = new Assistente("Fulano", 1800.27, 180.02);
		
		CalcularBonificacao(gerente);
		CalcularBonificacao(assistente);
		
	}
	
	public static void CalcularBonificacao(Funcionario funcionario) {
		funcionario.bonificarComParticipacao();
		System.out.println(funcionario);
		
	}
	

}
