package Exercicio3;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;
	
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String toString() {
		return String.format(" - Pessoa fisica - \nNome: %s \nRendimentos: %.2f \nCPF: %s \nRG: %s", this.nome, this.rendimentos, this.cpf, this.rg);
	}
	

}
