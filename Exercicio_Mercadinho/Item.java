package ExercicioMercado;

public class Item {
	private int quantidadeDeItens;
	private Produto produto;

	public Item(int quantidadeDeItens, Produto produto) {
		this.quantidadeDeItens = quantidadeDeItens;
		this.produto = produto;
		
	}
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
}
