package br.edu.ifpi.pc.designparttners;

public class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("N�o recebe desconto extra"); 
	}

	public void aprova(Orcamento orcamento) {	
		throw new RuntimeException("Orcamento j� reprovado");
	}

	
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� reprovado");
	}

	
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
