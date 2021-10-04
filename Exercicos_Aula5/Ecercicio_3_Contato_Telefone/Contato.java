package Exercicio_3_Contato_Telefones;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> Telefones;
	

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.Telefones = new ArrayList<Telefone> ();
	}

	public List<Telefone> getTelefones() {
		return Telefones;
	}

	public void setTelefones(Telefone telefone) {
		this.Telefones.add(telefone);
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void mostrarTelefones() {
		for(Telefone Telefones : Telefones)
		System.out.printf("Telefone: %s \n", Telefones.getNumero());
	}
	
	@Override
	public String toString() {
		return String.format("\nNome: %s - %s", this.nome, this.endereco);
	}
	
	
	
	

}
