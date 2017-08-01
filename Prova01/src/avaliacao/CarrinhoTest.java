package avaliacao;

import org.junit.Assert;
import org.junit.Test;

public class CarrinhoTest {
	@Test
	public void emOrdemCrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(new Produto("Feijao", 10.00));
		carrinho.adicionaProduto(new Produto("Arroz", 12.00));
		carrinho.adicionaProduto(new Produto("Leite", 18.00));
		carrinho.adicionaProduto(new Produto("Milho", 15.00));
		MenorEMaior verif = new MenorEMaior();
		verif.encontra(carrinho);
		double maiorEsperado = 18.00;
		double menorEsperado = 10.00;
		Assert.assertEquals(maiorEsperado, verif.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorEsperado, verif.getMenorDeTodos(),0.00001);
		//System.out.println("Lista em Ordem Crescente "+carrinho.getTeste());
		System.out.println("Tamanho do Array Crescente-> "+carrinho.getProdutos().size());
		for (Produto produto : verif.getMaiores()){
			System.out.println("Lista "+produto.getNome()+"R$ "+produto.getValor());
		}
		System.out.println("O Produto Mais Caro é o-> "+verif.getMaior().getNome() +" R$ "+ verif.getMaior().getValor());
		System.out.println("O Produto Mais Barato é o-> "+verif.getMenor().getNome() +" R$ "+ verif.getMenor().getValor());
	}
	@Test
	public void emOrdemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(new Produto("Feijao", 20.00));
		carrinho.adicionaProduto(new Produto("Arroz", 22.00));
		carrinho.adicionaProduto(new Produto("Leite", 28.00));
		carrinho.adicionaProduto(new Produto("Milho", 25.00));
		MenorEMaior verif = new MenorEMaior();
		verif.encontra(carrinho);
		double maiorEsperado = 28.00;
		double menorEsperado = 20.00;
		Assert.assertEquals(maiorEsperado, verif.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorEsperado, verif.getMenorDeTodos(),0.00001);
		System.out.println("\nLista em Ordem Decrescente");
		System.out.println("Tamanho do Array Decrescente-> "+carrinho.getProdutos().size());
		for (Produto produto : carrinho.getProdutos()){
			System.out.println("Lista "+produto.getNome()+" R$ "+produto.getValor());
		}
	}
	@Test
	public void umUnicoProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(new Produto("Feijao", 30.00));
		MenorEMaior verif = new MenorEMaior();
		verif.encontra(carrinho);
		double Esperado = 30.00;
		Assert.assertEquals(Esperado, verif.getMenorDeTodos(),0.00001);
		System.out.println("\nUm Único Valor na Lista");
		System.out.println("Tamanho do Array-> "+carrinho.getProdutos().size());
		System.out.println("Único Valor Esperado-> "+verif.getMaior().getNome() +" R$ "+ verif.getMaior().getValor());
	}
	@Test
	public void nenhumProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		MenorEMaior verif = new MenorEMaior();
		verif.encontra(carrinho);
		double Lista = 0;
		Assert.assertEquals(Lista,carrinho.getProdutos().size() ,0.00001);
		System.out.println("\nNenhum Produto na Lista");
		System.out.println("Tamanho do Array-> "+carrinho.getProdutos().size());
	}
}
