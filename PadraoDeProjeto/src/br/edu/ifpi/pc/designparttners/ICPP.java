package br.edu.ifpi.pc.designparttners;

public class ICPP extends TemplateDeImpostoCondicional {
	public ICPP() {
		super();
	}
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor()> 500){
			return true;
		} else{
			return false;
		}		
	}
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
