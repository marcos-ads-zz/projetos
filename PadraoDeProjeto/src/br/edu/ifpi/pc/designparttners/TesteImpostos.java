package br.edu.ifpi.pc.designparttners;

public class TesteImpostos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto ikcv = new IKCV();
		Imposto icpp = new ICPP();
		Imposto issComIcms = new ISS(new ICMS());
		Imposto ikcvComIcpp = new IKCV(new ICPP());
		Orcamento orcamento = new Orcamento(500.00);
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		System.out.println("ISS : "+calculador.realizaCalculo(orcamento, iss));
		System.out.println("ICMS : "+calculador.realizaCalculo(orcamento, icms));
		System.out.println("IKCV : "+calculador.realizaCalculo(orcamento, ikcv));
		System.out.println("ICPP : "+calculador.realizaCalculo(orcamento, icpp));
		System.out.println("Iss com ICMS : " + calculador.realizaCalculo(orcamento, issComIcms));
		System.out.println("IKCV com ICPP : " + calculador.realizaCalculo(orcamento, ikcvComIcpp));
	}
}
