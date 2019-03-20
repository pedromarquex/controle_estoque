package estoque;
import repositorio.ListaDeProdutos;
import produto.Produto;

// representation of a stock of products
public class Estoque {
	private ListaDeProdutos estoque = new ListaDeProdutos();
	
	// buy a product deducing the amount in stock
	public void comprar(Produto produto) {
		// verificar se o produto já existe do estoque
		Produto existe = estoque.procura(produto.getNome());
		if (existe != null) {
			
		}
		
		// caso exista, atualizar quantidade
		
		// caso nao exista incluir no estoque
	}
}
