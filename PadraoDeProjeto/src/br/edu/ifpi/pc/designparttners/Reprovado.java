package br.edu.ifpi.pc.designparttners;

public class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Não recebe desconto extra"); 
	}

	public void aprova(Orcamento orcamento) {	
		throw new RuntimeException("Orcamento já reprovado");
	}

	
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já reprovado");
	}

	
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
