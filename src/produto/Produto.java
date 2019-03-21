package produto;

// representation of a Product
public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private int quantMin;

	public Produto(String nome, double preco, int quantidade, int quantMin) {
		//setting the atributes of Produto
		this.setNome(nome);
		this.setPreco(preco);
		this.comprar(quantidade);
		this.setQuantMin(quantMin);
	}

	// sell a amount of Produto
	public boolean vender(int quantidade) {
		// verifying if the quantity of product is available for sell
		if (quantidade > this.quantidade) {
			return false;
		} else {
			this.quantidade -= quantidade;
			return true;
		}
	}
	
	// buy a amount of Produto deducing of quantidade
	public void comprar(int quantidade) {
		this.quantidade += quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantMin() {
		return quantMin;
	}

	public void setQuantMin(int quantMin) {
		this.quantMin = quantMin;
	}

}
