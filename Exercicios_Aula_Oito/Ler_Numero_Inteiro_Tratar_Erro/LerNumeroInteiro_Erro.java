package Tratar_Erros;

import java.util.Scanner;

public class LerNumeroInteiro_Erro {

	public static void main(String[] args) {

		
		System.out.println("Digite um numero inteiro: ");
				
		try {
			int num = lerNumero();
			System.out.println("O numero digitado �: " + num);			
			
		}catch (Exception e) {
			
			System.out.println("O que voc� digitou n�o � um inteiro v�lido!");
			
		}

	}
	
	public static int lerNumero() throws Exception{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		return num;
	}

}
