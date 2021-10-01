package Exercicio;

public class Pais {
	private String nome;

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Pais: %s", this.nome);
	}
	
}
