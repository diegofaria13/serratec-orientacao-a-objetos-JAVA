package Exercicio4;

public class Gerente extends Funcionario {
	private String nivel;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void bonificarComParticipacao() {
		super.bonificarComParticipacao();
		this.salario+= 200;
	}

}
