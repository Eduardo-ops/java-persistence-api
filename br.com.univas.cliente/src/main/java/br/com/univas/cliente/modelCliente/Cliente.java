package br.com.univas.cliente.modelCliente;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
public class Cliente {

	// Variaveis da classe de acordo com tabela em bando de dados.
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name = "nome")
		private String nome;

		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "data_cadastro")
		private Date dataCadastro;

		// Getters
		public int getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public Date getDataCadastro() {
			return dataCadastro;
		}

		// Setters
		public int setId(int id) {
			return this.id = id;
		}

		public String setNome(String nome) {
			return this.nome = nome;
		}

		public Date setDataCadastro(Date dataCadastro) {
			return this.dataCadastro = dataCadastro;
		}
}
