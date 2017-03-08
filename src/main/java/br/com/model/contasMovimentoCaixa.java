package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contasMovimentoCaixa")
public class contasMovimentoCaixa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String numero;
	private String Nome;
	private String situacaoCadastro;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@NotNull
	@Column(length = 7)
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@NotNull
	@Column(length = 40)
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	@Column(length = 8)
	public String getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(String situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		contasMovimentoCaixa other = (contasMovimentoCaixa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
