
public class MainImovel {

	public static void main(String[] args) {
		
		Imovel imovel_1 = new Imovel();
		imovel_1.codImovel = 1;
		imovel_1.bairro = "Centro";
		imovel_1.tipo = "apto";
		imovel_1.valor = 25000;
		
		Imovel imovel_2 = new Imovel();
		imovel_2.codImovel = 2;
		imovel_2.bairro = "Quitandinha";
		imovel_2.tipo = "casa";
		imovel_2.valor = 98900;	
		
		System.out.printf("Informações imóvel 1:");
		imovel_1.Cat(imovel_1.valor);
		imovel_1.reajuste(imovel_1.tipo);
		
		
		System.out.printf("\n\nInformações imóvel 2:");
		imovel_2.Cat(imovel_2.valor);
		imovel_2.reajuste(imovel_2.tipo);
		

	}
	

}
