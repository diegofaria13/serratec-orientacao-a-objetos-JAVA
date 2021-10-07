package Map_Carro_Modelo;
import java.util.HashMap;
import java.util.Map;

public class Exercicio_Mapa_Carro_Marca_Modelo {

	public static void main(String[] args) {
		
		Map<String, String> carro = new HashMap<String, String>();
		carro.put("Fiat", "Uno");
		carro.put("Vw","Gol");
		carro.put("Toyota","Corola");
		carro.put("Citroen","C4");
		carro.put("Renalt","Clio");

		// para ver so a chave
//		for(String s: carro.keySet() ) {
//			System.out.println(s);
//		}
		
		
		//para ver a chave e o valor
		for(Map.Entry<String, String> m : carro.entrySet()) {
			System.out.println(m);
		}

	}

}
