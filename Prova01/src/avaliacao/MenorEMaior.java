package avaliacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenorEMaior{
	Produto maior;
	Produto menor;
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Produto> maiores = new ArrayList<>();
	public void encontra(CarrinhoDeCompras carrinho) {
		for (Produto produto : carrinho.getProdutos()){
			if (produto.getValor() > maiorDeTodos){
				maiorDeTodos = produto.getValor();
				maior = produto;
			}
			if (produto.getValor() < menorDeTodos){
				menorDeTodos = produto.getValor();
				menor = produto;
			}
		 }
		pegaEOrdena(carrinho);
	}
	private void pegaEOrdena(CarrinhoDeCompras carrinho) {
		int quantidade = carrinho.getProdutos().size();
		CarrinhoDeCompras ordena = carrinho;
		Collections.sort(ordena.getProdutos());
		maiores = carrinho.getProdutos().subList(0, quantidade);
	}
	public List<Produto> getMaiores() {
		return maiores;
	}
	public Produto getMaior() {
		return maior;
	}
	public Produto getMenor() {
		return menor;
	}
	public double getMaiorDeTodos() {
		return maiorDeTodos;
	}
	public double getMenorDeTodos() {
		return menorDeTodos;
	}
}
