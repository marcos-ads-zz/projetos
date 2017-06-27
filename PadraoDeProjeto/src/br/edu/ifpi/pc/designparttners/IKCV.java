package br.edu.ifpi.pc.designparttners;

public class IKCV extends TemplateDeImpostoCondicional {
	public IKCV() {
		super();
	}
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for ( Item item : orcamento.getItens()){
			if (item.getValor()>100) return true;
		}
		return false;
	}
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor()>500 && temItemMaiorQue100ReaisNo(orcamento)){
			return true;
		} else {
			return false;
		}	
	}
	public double maximaTaxacao(Orcamento orcamento) {	
		return orcamento.getValor() * 0.1;
	}
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
