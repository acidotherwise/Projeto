package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contasBoletos")
public class contasBoletos implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private long id;
	private bancos bancos;
	private String agencia;
	private String digitoAgencia;
	private String codigoBeneficiario;
	private String codigoBeneficiarioDigito;
	private String numeroConta;
	private String numeroContaDigito;
	private String carteira;
	private String proximoBoleto;
	private String codigoEmpresa;
	private String tipoConta;
	private String nomeConta;
	private String cpfCnpj;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "bancos_id")
	public bancos getBancos() {
		return bancos;
	}
	public void setBancos(bancos bancos) {
		this.bancos = bancos;
	}
	@Column(length = 20, nullable=false)
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	@Column(length = 2, nullable=false )
	public String getDigitoAgencia() {
		return digitoAgencia;
	}
	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}
	@Column(length = 20, nullable=false)
	public String getCodigoBeneficiario() {
		return codigoBeneficiario;
	}
	public void setCodigoBeneficiario(String codigoBeneficiario) {
		this.codigoBeneficiario = codigoBeneficiario;
	}
	@Column(length = 2, nullable=false)
	public String getCodigoBeneficiarioDigito() {
		return codigoBeneficiarioDigito;
	}
	public void setCodigoBeneficiarioDigito(String codigoBeneficiarioDigito) {
		this.codigoBeneficiarioDigito = codigoBeneficiarioDigito;
	}
	@Column(length = 20, nullable=false)
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	@Column(length = 2, nullable=false)
	public String getNumeroContaDigito() {
		return numeroContaDigito;
	}
	public void setNumeroContaDigito(String numeroContaDigito) {
		this.numeroContaDigito = numeroContaDigito;
	}
	@Column(length = 20, nullable=false)
	public String getCarteira() {
		return carteira;
	}
	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}
	@Column(length = 20, nullable=false)
	public String getProximoBoleto() {
		return proximoBoleto;
	}
	public void setProximoBoleto(String proximoBoleto) {
		this.proximoBoleto = proximoBoleto;
	}
	@Column(length = 20, nullable=false)
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	@Column(length = 8, nullable=false)
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	@Column(length = 40, nullable=false)
	public String getNomeConta() {
		return nomeConta;
	}
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	@Column(length = 15, nullable=false)
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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
		contasBoletos other = (contasBoletos) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
