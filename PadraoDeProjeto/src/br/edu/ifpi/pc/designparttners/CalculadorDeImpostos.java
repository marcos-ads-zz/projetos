package br.edu.ifpi.pc.designparttners;

public class CalculadorDeImpostos {
	public double realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valor = imposto.calcula(orcamento);
		return valor;
	}
}
