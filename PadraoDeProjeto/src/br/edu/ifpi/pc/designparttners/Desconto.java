package br.edu.ifpi.pc.designparttners;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
