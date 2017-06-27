package br.edu.ifpi.pc.designparttners;

import org.junit.Assert;
import org.junit.Test;

public class ImpostoTest {
	@Test
	public void testaTaxacaoMaximaICPP(){
		Orcamento o = new Orcamento(1000);
		Imposto i = new ICPP();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxaMaxima = 70.00;
		Assert.assertEquals(taxaMaxima, c.realizaCalculo(o, i), 0.001);
	}
	@Test
	public void testaTaxacaoMinimaICPP(){
		Orcamento o = new Orcamento(100);
		Imposto i = new ICPP();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxaMaxima = 5.00;
		Assert.assertEquals(taxaMaxima, c.realizaCalculo(o, i), 0.001);
	}
	@Test
	public void testaTaxacaoMaximaIKCV(){
		Orcamento o = new Orcamento(1000);
		o.adicionaItem(new Item("celular",1000.00));
		Imposto i = new IKCV();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxa = 100.00;
		Assert.assertEquals(taxa, c.realizaCalculo(o, i), 0.001);
	}
	@Test
	public void testaTaxacaoMinimaIKCV(){
		Orcamento o = new Orcamento(1000);
		o.adicionaItem(new Item("celular",99.00));
		Imposto i = new IKCV();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxa = 60.00;
		Assert.assertEquals(taxa, c.realizaCalculo(o, i), 0.001);
	}
	@Test
	public void testaTaxacaoMinimaIKCVValorAbaixode500Reais(){
		Orcamento o = new Orcamento(400);
		o.adicionaItem(new Item("celular",400.00));
		Imposto i = new IKCV();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxa = 24.00;
		Assert.assertEquals(taxa, c.realizaCalculo(o, i), 0.001);
	}
	@Test
	public void testaTaxacaoMinimaIKCVValorAbaixode500ReaisItemAvaixode100(){
		Orcamento o = new Orcamento(400);
		o.adicionaItem(new Item("celular",40.00));
		Imposto i = new IKCV();
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		double taxa = 24.00;
		Assert.assertEquals(taxa, c.realizaCalculo(o, i), 0.001);
	}
}
