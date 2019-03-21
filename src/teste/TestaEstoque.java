package teste;
import produto.Produto;
import repositorio.ListaDeProdutos;
import org.junit.Test;
import org.junit.Assert;

public class TestaEstoque {
	@Test
	public void testaProduto() {
		// create a new product and test his values
		Produto produto = new Produto("arroz", 2.5, 10, 3);
		Assert.assertEquals(10, produto.getQuantidade());
		// sell a product and test the his amount
		produto.vender(5);
		Assert.assertEquals(5, produto.getQuantidade());
		// buy a product and test his amount
		produto.comprar(10);
		Assert.assertEquals(15, produto.getQuantidade());
	}
	@Test
	public void testaListaDeProdutos() {
		// create some products
		Produto p1 = new Produto("arroz", 2.5, 5, 3);
		Produto p2 = new Produto("feijao", 7, 12, 3);
		Produto p3 = new Produto("farinha", 5, 20, 3);
		// create a list of products
		ListaDeProdutos lista = new ListaDeProdutos();
		// insert some products in the list and test if its all ok
		lista.insere(p1);
		Assert.assertEquals(true, lista.existe("arroz"));
		lista.insere(p2);
		Assert.assertEquals(true, lista.existe("feijao"));
		lista.insere(p3);
		Assert.assertEquals(true, lista.existe("farinha"));
		Assert.assertEquals(false, lista.existe("macarrao"));
//		lista.atualiza("farinha", 25);
//		Assert.assertEquals(25, p3.getQuantidade());
	}
}
