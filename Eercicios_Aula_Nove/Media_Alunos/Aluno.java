package Media_Alunos;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calculaMedia() throws AlunoException{
		
		double mediaFinal = 0.0;
		
		if(nota1 < 0.0 || nota1 > 10.0 || nota2 < 0.0 || nota2 > 10.0) {
			
				throw new AlunoException("Nota Invalida! A nota deve estar entre 0 e 10.");
		}
				
			mediaFinal = (this.nota1 + this.nota2)/2.0;
			return mediaFinal;
		}
		
	
	@Override
	public String toString() {
		return String.format("Aluno: %s - Nota 1: %.2f - Nota 2: %.2f", this.nome, this.nota1, this.nota2);
	}
}
