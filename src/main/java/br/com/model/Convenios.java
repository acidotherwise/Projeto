package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Convenios")
public class Convenios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String situacaoCadastro;
	private String responsavel;
	private String telefone;
	private String fax;
	private String emaail;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(length = 40, nullable = true)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(length = 8, nullable = true)
	public String getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(String situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	@Column(length = 40, nullable = true)
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	@Column(length = 15, nullable = true)
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Column(length = 15, nullable = true)
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	@Column(length = 40, nullable = true)
	public String getEmaail() {
		return emaail;
	}
	public void setEmaail(String emaail) {
		this.emaail = emaail;
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
		Convenios other = (Convenios) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
