package Exercicio_1;
import java.util.Scanner;

public class Empregado {
	private String nome;
	private String Sobrenome;
	private double salario;
	
	Scanner ler = new Scanner(System.in);
	
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		Sobrenome = sobrenome;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void CalculaImpostoDeRenda(double salario) {
			
		if(this.salario < 1903.98) {
			this.salario = salario;
		}
		else {
			if(this.salario < 2826.65) {
				this.salario = this.salario - (this.salario * 0.075);
			}
			else {
				if(this.salario < 3751.05) {
					this.salario = this.salario - (this.salario * 0.15);
				}
				else {
					if(this.salario < 4664.68) {
						this.salario = this.salario - (this.salario * 0.225);
					}
					else {
						this.salario = this.salario - (this.salario * 0.275);
					}
				}
			}
		}
	}
	
	public void imprimirDadosEmpregado() {
		System.out.printf("\n\nEmpregado: %s %s", getNome(), getSobrenome());
		System.out.printf("\nSalário Líquido: %.2f", getSalario());
	}

}
