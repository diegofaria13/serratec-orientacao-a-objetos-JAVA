package Exercicio_3_Contato_Telefones;

public class Cidade {
	private String nomeCidade;
	private Estado estado;

	public Cidade( String nomeCidade, Estado estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
	
	
	public String getNomeCidade() {
		return nomeCidade;
	}


	public Estado getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return String.format("Cidade: %s, %s ", this.nomeCidade, this.estado);
	}
	
}



