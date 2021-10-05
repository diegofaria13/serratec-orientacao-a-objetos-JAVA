package Tratar_Erros;

public class Vetores_Erros_Excessoes {

	public static void main(String[] args) {
		
		int numerador[] = {1,2,3,4,5};
		int denominador[] = {3,0,2};
		
		for(int i = 0; i < numerador.length; i++) {
			try {
			System.out.println("O resultado da divisao de " + numerador[i] + " por "
			+ denominador[i] + " sera " + numerador[i]/denominador[i]);
			}catch (ArithmeticException e1) {
				System.out.println("Divisão por zero não permitida!");
			}catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Indice do vetor denominador não existe!");
			}
		}

	}

}
