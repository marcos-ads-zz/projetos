package br.edu.ifpi.pc.designparttners;

public class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Não recebe desconto extra"); 
	}
	public void aprova(Orcamento orcamento) {	
		throw new RuntimeException("Orcamento já finalizado");
	}

	
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado");
	}

	
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado");
		
	}
}
