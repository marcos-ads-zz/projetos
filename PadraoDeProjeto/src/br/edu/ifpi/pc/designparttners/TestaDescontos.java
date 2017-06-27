package br.edu.ifpi.pc.designparttners;

public class TestaDescontos {
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(501.00);
		orcamento.adicionaItem(new Item("Caneta", 251.00));
		orcamento.adicionaItem(new Item("Lapis", 100.00));
		orcamento.adicionaItem(new Item("Lapis2", 50.00));
		orcamento.adicionaItem(new Item("Lapis3", 50.00));
		orcamento.adicionaItem(new Item("Lapis4", 50.00));
		orcamento.adicionaItem(new Item("Lapis5", 50.00));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}
}
