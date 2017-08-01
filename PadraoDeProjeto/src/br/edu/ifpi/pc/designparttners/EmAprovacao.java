package br.edu.ifpi.pc.designparttners;

public class EmAprovacao implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		double valorComDesconto = orcamento.getValor();
		valorComDesconto -= valorComDesconto * 0.05;
		orcamento.setValor(valorComDesconto);
	}
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("O orçamento em aprovação não pode ser finalizado");	
	}
}
