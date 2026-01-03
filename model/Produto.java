package model;

import carregaID;

public class Produto{
	public short idproduto;
	public String nome;
	public int qtd;
	public double preco;


	Produto(String nome, int qtd, double preco){
		this.idproduto = carregaID.carregar();
		idproduto = (idproduto != -1) ? idproduto+= 1 : 0;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

}