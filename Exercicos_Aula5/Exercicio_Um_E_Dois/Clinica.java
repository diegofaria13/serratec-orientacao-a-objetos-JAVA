package Exercicio_1_E_2;

public class Clinica extends Plano {
	private String nomeExame;
	private String cgc;
	
	public Clinica(String empresa, String nomeExame, String cgc) {
		super(empresa);
		this.nomeExame = nomeExame;
		this.cgc = cgc;
	}

	public String getNome() {
		return this.nomeExame;
	}
	
	public String getCgc() {
		return cgc;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " Exame: %s - Cgc: %s", this.nomeExame, this.cgc);
	}
	
	

}
