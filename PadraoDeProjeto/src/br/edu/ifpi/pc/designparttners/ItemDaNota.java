package br.edu.ifpi.pc.designparttners;

public class ItemDaNota {
	private String descricao;
	private int quantidade;
	private double valor;
	public ItemDaNota(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getValor() {
		return valor;
	}
	public double getValorTotal(){
		return valor * quantidade;
	}

}
