
public class Imovel {
	int codImovel;
	String bairro;
	String tipo;
	double valor;
	
	public void reajuste(String tipo) {
		if(tipo == "casa") {
			valor = valor * 1.05;
		}
		else {
			valor = valor * 1.08;
		}
		
		System.out.printf("\nO valor com reajuste é: %.2f ", valor);
	}
	
	public void Cat (double valor) {
		if(valor < 10000) {
			System.out.printf("\nImovel classe C");
		}
		else {
			if(valor < 50000) {
				System.out.printf("\nImovel classe B");
			}
			else {
				System.out.printf("\nImovel classe A");
			}
		}
	}
}
