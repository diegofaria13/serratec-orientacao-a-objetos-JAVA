package Exercicio3;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;
	
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public void calculoIr() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.12);
	}
	
	

}
