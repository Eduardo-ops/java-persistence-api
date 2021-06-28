package br.com.univas.cliente.modelPedidos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

	// Variaveis da classe de acordo com tabela em bando de dados.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;

	@Column(name = "nome")
	private String nome;

	@Column(name = "data_pedido")
	private Date data_pedido;

	@Column(name = "quantidade")
	private int quantidade;

	@Column(name = "valor")
	private double valor;

	// Getters
	public int getIdPedido() {
		return idPedido;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataPedido() {
		return data_pedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	// Setters
	public int setIdPedido(int idPedido) {
		return this.idPedido = idPedido;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public Date setDataPedido(Date data_pedido) {
		return this.data_pedido = data_pedido;
	}

	public int setQuantidade(int quantidade) {
		return this.quantidade = quantidade;
	}

	public double setValor(double valor) {
		return this.valor = valor;
	}
}
