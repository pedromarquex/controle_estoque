package repositorio;

import produto.Produto;

// representation of a linked list of products
public class ListaDeProdutos {
	public Produto produto = null;
	public ListaDeProdutos prox = null;

	// add a product to list
	public void insere(Produto produto) {
		// test if the list is empty
		if (this.produto == null) {
			this.produto = produto;
			this.prox = new ListaDeProdutos();
		} else if (this.prox == null) {
			this.prox = new ListaDeProdutos();
			this.prox.produto = produto;
			this.prox.prox = new ListaDeProdutos();
		} else {
			this.prox.insere(produto);
		}
	}

	// search product by name and returns true if exists
	public boolean existe(String nome) {
		if (this.produto == null) {
			return false;
		} else if (this.produto.getNome() == nome) {
			return true;
		} else if (this.prox.produto != null) {
			return this.prox.existe(nome);
		} else {
			return false;
		}
	}
	public boolean atualiza(String nome, int quantidade) {
		if (this.produto == null) {
			return false;
		} else if (this.produto.getNome() == nome) {
			if (this.produto.getQuantidade() < quantidade) {
				return false;
			}
			this.produto.setQuantidade(quantidade);
			return true;
		} else if (this.prox.produto != null) {
			return this.prox.atualiza(nome, quantidade);
		} else {
			return false;
		}
	}
}
