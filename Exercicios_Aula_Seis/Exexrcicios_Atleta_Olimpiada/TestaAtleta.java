package Exercicio;

public class TestaAtleta {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Japão");
		
		Atleta atleta1 = new Atleta("Diego", 82.00, "Futebol", pais1);
		Atleta atleta2 = new Atleta("Diego 2", 93, "Boxe", pais2);
		Atleta atleta3 = new Atleta("Diego 3", 58, "Corrida", pais1);
		
		atleta1.verificaSituacao(atleta1.getPeso());
		atleta2.verificaSituacao(atleta2.getPeso());
		atleta3.verificaSituacao(atleta3.getPeso());
		
		System.out.println(atleta1);
		System.out.println(atleta2);
		System.out.println(atleta3);
		
		System.out.println("Total Participantes: " + Atleta.getTotalParticipantes());

	}

}
