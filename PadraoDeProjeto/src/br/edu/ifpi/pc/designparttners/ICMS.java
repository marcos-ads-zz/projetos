package br.edu.ifpi.pc.designparttners;

public class ICMS extends Imposto {
	public ICMS( Imposto outroImposto) {
		super(outroImposto);
	}
	public ICMS() {
		super();
	}
	public double calcula(Orcamento orcamento){
		return orcamento.getValor()*0.1 + calculoDoOutroImposto(orcamento);
	}
}
