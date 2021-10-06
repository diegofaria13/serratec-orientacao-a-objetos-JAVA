package ExercicioMercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Item> Itens;
	
	public Carrinho() {
		this.Itens=new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.Itens.add(item);
	}

	public List<Item> getItens() {
		return Itens;
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for(Item item : this.Itens) {
			Produto produto = item.getProduto();
			valorTotal += produto.Vender(item.getQuantidadeDeItens());
		}
		
		return valorTotal;
	}
		
}
