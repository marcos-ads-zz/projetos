package br.edu.ifpi.pc.designparttners;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	private double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}
	public void aplicaDescontoExtra(){
		estadoAtual.aplicaDescontoExtra(this);
	}
	public void aprova(){
		estadoAtual.aprova(this);
	}
	public void reprova(){
		estadoAtual.reprova(this);
	}
	public void finaliza(){
		estadoAtual.finaliza(this);
	}
	public double getValor() {
		return valor;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void adicionaItem(Item item){
		itens.add(item);
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
