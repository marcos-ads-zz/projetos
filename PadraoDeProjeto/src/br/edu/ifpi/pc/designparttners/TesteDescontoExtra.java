package br.edu.ifpi.pc.designparttners;

public class TesteDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
	}
}
