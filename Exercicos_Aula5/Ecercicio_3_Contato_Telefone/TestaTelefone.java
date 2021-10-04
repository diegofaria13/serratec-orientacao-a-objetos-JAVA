package Exercicio_3_Contato_Telefones;

public class TestaTelefone {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de janeiro", "RJ");
		Estado estado2 = new Estado("Sao Paulo", "SP");
		
		Cidade cidade1 = new Cidade("Cordeiro", estado1);
		Cidade cidade2 = new Cidade("Ribeirao preto", estado2);
		
		Endereco endereco1 = new Endereco("Av. Presidente Vargas", "Centro", "28540-000", cidade1);
		Endereco endereco2 = new Endereco("Rua dois", "sao lourenco", "06457-007", cidade2);
		
		Telefone telefone1 = new Telefone("2551-03655");
		Telefone telefone2 = new Telefone("88696-6897");
		Telefone telefone3 = new Telefone("25624-2568");
		Telefone telefone4 = new Telefone("26548-5568");
		
		Contato contato1 = new Contato("Diego", endereco1);
		contato1.setTelefones(telefone1);
		contato1.setTelefones(telefone2);
		
		Contato contato2 = new Contato("Cristiane", endereco2);
		contato2.setTelefones(telefone3);
		contato2.setTelefones(telefone4);
		
		System.out.println(contato1);
		contato1.mostrarTelefones();
		
		System.out.println(contato2);
		contato2.mostrarTelefones();
		
		

	}

}
