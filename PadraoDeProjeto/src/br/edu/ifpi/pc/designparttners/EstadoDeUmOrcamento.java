package br.edu.ifpi.pc.designparttners;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
