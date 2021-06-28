package br.com.univas.cliente.modelDetalheCliente;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalhescliente")
public class DetalheCliente {

	// Variaveis da classe de acordo com tabela em bando de dados.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalhe;

	@Column(name = "nome")
	private String nome;

	@Column(name = "idade")
	private int idade;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "data_cadastro")
	private Date data_cadastro;

	// Getters
	public int getIdDetalhe() {
		return idDetalhe;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public Date getDataCadastro() {
		return data_cadastro;
	}

	// Setters
	public int setIdDetalhe(int id) {
		return this.idDetalhe = id;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}

	public String setCidade(String cidade) {
		return this.cidade = cidade;
	}

	public String setEndereco(String endereco) {
		return this.endereco = endereco;
	}

	public Date setDataCadastro(Date data_cadastro) {
		return this.data_cadastro = data_cadastro;
	}
}
