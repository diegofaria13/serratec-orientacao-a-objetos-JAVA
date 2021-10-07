package Media_Alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno("", 0, 0);
		Aluno aluno2 = new Aluno("", 0, 0);
		Aluno aluno3 = new Aluno("", 0, 0);
		
		System.out.printf("Digite o nome do aluno: ");
		aluno1.setNome(in.next());
		System.out.printf("Digite a nota 1 do aluno: ");
		aluno1.setNota1(in.nextDouble());
		System.out.printf("Digite a nota 2 do aluno: ");
		aluno1.setNota2(in.nextDouble());
		System.out.println("");
		
		System.out.printf("Digite o nome do aluno: ");
		aluno2.setNome(in.next());
		System.out.printf("Digite a nota 1 do aluno: ");
		aluno2.setNota1(in.nextDouble());
		System.out.printf("Digite a nota 2 do aluno: ");
		aluno2.setNota2(in.nextDouble());
		System.out.println("");
		
		System.out.printf("Digite o nome do aluno: ");
		aluno3.setNome(in.next());
		System.out.printf("Digite a nota 1 do aluno: ");
		aluno3.setNota1(in.nextDouble());
		System.out.printf("Digite a nota 2 do aluno: ");
		aluno3.setNota2(in.nextDouble());
		System.out.println("");
		
		in.close();
		
		List<Aluno> listaAluno = new ArrayList();
		listaAluno.add(aluno1);
		listaAluno.add(aluno2);
		listaAluno.add(aluno3);
		
		for(int i = 0; i < listaAluno.size() ; i++)
		try {
			
			System.out.printf(listaAluno.get(i) + " - Média Final: %.2f \n", listaAluno.get(i).calculaMedia());
			
		}catch(AlunoException e){	
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
