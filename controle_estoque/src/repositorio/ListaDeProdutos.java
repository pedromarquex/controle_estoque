package repositorio;

import produto.Produto;

// representation of a linked list of products
public class ListaDeProdutos {
	private Produto produto;
	private ListaDeProdutos prox;

	// add a product to list
	public void insere(Produto produto) {
		if (this.produto == null) {
			this.produto = produto;
		} else if(this.produto.getNome().equals(produto.getNome()) ) {
			this.produto = produto;
		} else if (this.prox == null) {
			this.prox.produto = produto;
		} else {
			this.prox.insere(produto);
		}
	}

	// search and returns a product instance by name
	public Produto procura(String nome) {
		if (this.produto == null) {
			return null;
		} else if (this.produto.getNome() == nome) {
			return this.produto;
		} else if (this.prox.produto != null) {
			return this.prox.procura(nome);
		} else {
			return null;
		}
	}
}
