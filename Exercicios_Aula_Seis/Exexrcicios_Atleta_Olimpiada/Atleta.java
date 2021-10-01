package Exercicio;

public class Atleta implements Olimpiada{
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	public static int totalParticipantes;
	public String resposta;
	
	
	public Atleta(String nome, double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
		
		totalParticipantes += 1;
	}


	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public Pais getPais() {
		return pais;
	}


	public String getNome() {
		return nome;
	}


	public double getPeso() {
		return peso;
	}


	public static int getTotalParticipantes() {
		return totalParticipantes;
	}
	
	@Override
	public String verificaSituacao(double peso) {
		
		if(this.peso > 90) {
			this.modalidade = "Peso Pesado";
			resposta = "Participará";
		}else if(this.peso < 90 && this.peso > 60) {
			this.modalidade = "Peso Médio";
			resposta = "Participará";
		} else {
			resposta = "Não participará";
		}
		
		return resposta;
	}


	@Override
	public String toString() {
		return String.format("Atleta: %s \n%s \nModalidade: %s \nSituacao: %s\n", 
				this.nome, this.pais, this.modalidade, this.resposta);
	}
	
	
	

}
