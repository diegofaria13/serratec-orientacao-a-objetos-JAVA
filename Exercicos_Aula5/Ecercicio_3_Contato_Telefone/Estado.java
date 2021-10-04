package Exercicio_3_Contato_Telefones;

public class Estado {
	private String nomeEstado;
	private String sigla;
	
	public Estado(String nomeEstado, String sigla) {
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
	
	@Override
	public String toString() {
		return String.format("Estado: %s - %s", this.nomeEstado, this.sigla);
	}

}
