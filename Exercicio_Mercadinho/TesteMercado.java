package ExercicioMercado;

public class TesteMercado {

	public static void main(String[] args) {

		Produto cerveja = new BebidaAlcoolica("Cerveja", 12.00, 4.60);
		Produto vinho = new BebidaAlcoolica("Vinho", 150.00, 8);
		Produto tv = new Eletrodomestico("Tv", 2000.00, 120);
		Produto geladeira = new Eletrodomestico("Geladeira", 2352.64, 220);
		Produto radio = new Eletrodomestico("Radio", 837.59, 110);
		
		Carrinho carrinho  = new Carrinho();
		
		carrinho.addItem(new Item(5, cerveja));
		carrinho.addItem(new Item(3, vinho));
		carrinho.addItem(new Item(9, tv));
		carrinho.addItem(new Item(3, geladeira));
		carrinho.addItem(new Item(1, radio));
		
		for(Item item : carrinho.getItens()) {
			Produto produto = item.getProduto();
			System.out.printf(produto + "Quantidade: %d - Subtotal: R$ %.2f\n"
					+ item.getQuantidadeDeItens(), produto.Vender(item.getQuantidadeDeItens()));
		}
		
		System.out.printf("\n\nTotal da compra: %.2f", carrinho.getValorTotal());
	}

}
