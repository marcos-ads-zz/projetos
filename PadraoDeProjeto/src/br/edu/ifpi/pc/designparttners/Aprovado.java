package br.edu.ifpi.pc.designparttners;

public class Aprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		double valorComDesconto = orcamento.getValor();
		valorComDesconto -= valorComDesconto * 0.02;
		orcamento.setValor(valorComDesconto);
	}
	public void aprova(Orcamento orcamento) {	
		throw new RuntimeException("Orcamento j� aprovado");
	}

	
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� aprovado");
	}

	
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
