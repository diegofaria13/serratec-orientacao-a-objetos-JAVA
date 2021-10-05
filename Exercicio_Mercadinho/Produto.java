package ExercicioMercado;

public abstract class Produto implements Venda {
	
	private String nome;
	private double valor;
	private double subTotal;
	private double totalCompra;
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorTotal() {
		return subTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.subTotal = valorTotal;
	}
	
	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	
	@Override
	public double Vender(int quantidadeDeItens) {
		double valorTotal  = (this.valor * quantidadeDeItens);
		return valorTotal;
	}
	
	public double CalcTotalFinal(double valorTotal) {
		totalCompra += valorTotal;
		return totalCompra;
	}
	
	@Override
	public String toString() {
		return String.format("Prdouto: %s - Valor Unitário: R$ %.2f - ", this.nome, this.valor);
		
	}

}
