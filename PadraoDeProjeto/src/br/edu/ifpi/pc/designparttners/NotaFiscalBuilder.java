package br.edu.ifpi.pc.designparttners;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double impostos;
	private double valorBruto;
	private Calendar data;
	private String observacoes;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	public NotaFiscalBuilder paraEmpresa (String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder comItem (ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValorTotal();
		impostos += item.getValorTotal() * 0.05;
		return this;
	}
	public NotaFiscalBuilder comObservacoes(String observacoes){
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscalBuilder naDataAtual(){
		this.data = Calendar.getInstance();
		return this;
	}
	public NotaFiscal constroi(){
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
}
