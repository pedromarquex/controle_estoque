package estoque;

import repositorio.ListaDeProdutos;
import produto.Produto;

// representation of a stock of products
public class Estoque {
	private ListaDeProdutos estoque;
	
	public Estoque() {
		estoque = new ListaDeProdutos();
	}

	// buy a product deducing the amount in stock
	public void comprar(Produto produto) {
		// verificar se o estoque está vazio
		// caso sim, incluir o produto
		// verificar se o produto já existe do estoque
		// caso exista, atualizar quantidade
		// caso não exista, inserir o novo produto
		if (this.estoque == null) {
			this.estoque.insere(produto);
		} else if (this.estoque.existe(produto.getNome())) {
			this.compraProduto(produto);
		} else {
			this.estoque.insere(produto);
		}
	}
	
	public boolean vender(String nome, int quantidade) {
		// verificar se o estoque está vazio
		// caso esteja, não é possível vender
		// procurar o produto no estoque
		// caso exista, verificar se a quantidade do produto pode ser vendida
		
		if (estoque.produto == null) {
			return false;
		} else if (estoque.existe(nome)) {
			estoque.atualiza(nome, quantidade);
			return true;
		} else {
			return false;
		}
	}

	private void compraProduto(Produto produto) {
		if (this.estoque.produto.getNome().equals(produto.getNome())) {
			this.estoque.produto.comprar(produto.getQuantidade());
		} else if (this.estoque.prox != null) {
			this.estoque.prox.produto.comprar(produto.getQuantidade());
		}
	}
	
	public Produto pesquisaProduto(String nome) {
		return this.estoque.pesquisaProduto(nome);
	}
	
	public boolean atualizaProduto(Produto p) {
		return this.atualizaProduto(p);
	}

}
