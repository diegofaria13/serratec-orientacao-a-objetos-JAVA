package Media_Alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Aluno> listaAluno = new ArrayList();
		
		System.out.printf("Quantos alunos quer adicionar? ");
		int numAlunos = in.nextInt();
		
		for(int i = 0; i < numAlunos; i++ ) {
			Aluno aluno = new Aluno("", 0, 0);
			
			System.out.printf("Digite o nome do aluno: ");
			aluno.setNome(in.next());
			System.out.printf("Digite a nota 1 do aluno: ");
			aluno.setNota1(in.nextDouble());
			System.out.printf("Digite a nota 2 do aluno: ");
			aluno.setNota2(in.nextDouble());
			System.out.println("");
			
			listaAluno.add(aluno);
		}
		
		
		
		in.close();
	
		
		for(int i = 0; i < listaAluno.size() ; i++)
		try {
			
			System.out.printf(listaAluno.get(i) + " - Média Final: %.2f \n", listaAluno.get(i).calculaMedia());
			
		}catch(AlunoException e){	
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
