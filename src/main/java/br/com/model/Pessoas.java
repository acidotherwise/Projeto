package br.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Pessoas")
public class Pessoas implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Date dtCadastro;
	private String situacaoCadastro;
	private Date dtNascimento;
	private String naturalidade;
	private String estadoCivil;
	private String filhos;
	private String sexo;
	private String cnpjCPF;
	private String RG;
	private String profissao;
	private String telefone;
	private String telefoneComercial;
	private String celular;
	private String pais;
	private String uf;
	private String cidade;
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String convenio;
	private String numeroConvenio;
	private String indicacao;
	private String midia;
	private String email;
	private String conjuje;
	private String rendaFamiliar;
	private String totalFamilia;
	private String nomePai;
	private String ocupacaoPai;
	private String telefonePai;
	private String nomeMae;
	private String ocupacaoMae;
	private String telefoneMae;
	private String nomeResponsavel;
	private String cpfResponsavel;
	private String rgResponsavel;
	private String telefoneResponsavel;
	private String estadoCivelResponsavel;
	private Date dataNascimentoResponsavel;
	private String naturalidadeResponsavel;
	private String profissaoResponsavel;
	private String emailResponsavel;
	private String cepResponsavel;
	private String enderecoResponsavel;
	private String numeroResponsavel;
	private String bairroResponsavel;
	private String obs;
	private String especialidade;
	private int CRO;
	private String comissao;
	private String tipoComissao;
	private String percentual;
	private int descTaxaCartao;
	private String tipoPessoa;
	private String razaoSocial;
	private int inscEstadual;
	private String contato;
	private String site;
	private String nacionalidade;
	private String escolaridade;
	private String grupoSanguineo;
	private int pis;
	private int titulo;
	private String carteiradeTrabalho;
	private int CNH;
	private String tereira;
	private String registroProfissional;
	private String cargo;
	private Date admissao;
	private Date demissao;
	private String motivoDemissao;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(length = 80, nullable = true)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_cadastro", nullable = true)
	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	@Column(length = 7, nullable = true)
	public String getSituacaoCadastro() {
		return situacaoCadastro;
	}

	public void setSituacaoCadastro(String situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", nullable = true)
	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(length = 60, nullable = true)
	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	@Column(length = 15, nullable = true)
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(length = 3, nullable = true)
	public String getFilhos() {
		return filhos;
	}

	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}

	@Column(length = 9, nullable = true)
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(length = 18, nullable = true)
	public String getCnpjCPF() {
		return cnpjCPF;
	}

	public void setCnpjCPF(String cnpjCPF) {
		this.cnpjCPF = cnpjCPF;
	}

	@Column(length = 10, nullable = true)
	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	@Column(length = 80, nullable = true)
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Column(length = 15, nullable = true)
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(length = 15, nullable = true)
	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	@Column(length = 15, nullable = true)
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(length = 40, nullable = true)
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(length = 2, nullable = true)
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Column(length = 60, nullable = true)
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Column(length = 9, nullable = true)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(length = 80, nullable = true)
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(length = 10, nullable = true)
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(length = 40, nullable = true)
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(length = 40, nullable = true)
	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	@Column(length = 10, nullable = true)
	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}

	@Column(length = 40, nullable = true)
	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	@Column(length = 60, nullable = true)
	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	@Column(length = 40, nullable = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 40, nullable = true)
	public String getConjuje() {
		return conjuje;
	}

	public void setConjuje(String conjuje) {
		this.conjuje = conjuje;
	}

	@Column(length = 20, nullable = true)
	public String getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(String rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	@Column(length = 20, nullable = true)
	public String getTotalFamilia() {
		return totalFamilia;
	}

	public void setTotalFamilia(String totalFamilia) {
		this.totalFamilia = totalFamilia;
	}

	@Column(length = 80, nullable = true)
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Column(length = 40, nullable = true)
	public String getOcupacaoPai() {
		return ocupacaoPai;
	}

	public void setOcupacaoPai(String ocupacaoPai) {
		this.ocupacaoPai = ocupacaoPai;
	}

	@Column(length = 15, nullable = true)
	public String getTelefonePai() {
		return telefonePai;
	}

	public void setTelefonePai(String telefonePai) {
		this.telefonePai = telefonePai;
	}

	@Column(length = 80, nullable = true)
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(length = 60, nullable = true)
	public String getOcupacaoMae() {
		return ocupacaoMae;
	}

	public void setOcupacaoMae(String ocupacaoMae) {
		this.ocupacaoMae = ocupacaoMae;
	}

	@Column(length = 15, nullable = true)
	public String getTelefoneMae() {
		return telefoneMae;
	}

	public void setTelefoneMae(String telefoneMae) {
		this.telefoneMae = telefoneMae;
	}

	@Column(length = 80, nullable = true)
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	@Column(length = 14, nullable = true)
	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	@Column(length = 10, nullable = true)

	public String getRgResponsavel() {
		return rgResponsavel;
	}

	public void setRgResponsavel(String rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
	}
	
	@Column(length = 15, nullable = true)
	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}

	@Column(length = 15, nullable = true)
	public String getEstadoCivelResponsavel() {
		return estadoCivelResponsavel;
	}

	public void setEstadoCivelResponsavel(String estadoCivelResponsavel) {
		this.estadoCivelResponsavel = estadoCivelResponsavel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento_responsavel", nullable = true)
	public Date getDataNascimentoResponsavel() {
		return dataNascimentoResponsavel;
	}

	public void setDataNascimentoResponsavel(Date dataNascimentoResponsavel) {
		this.dataNascimentoResponsavel = dataNascimentoResponsavel;
	}

	@Column(length = 60, nullable = true)
	public String getNaturalidadeResponsavel() {
		return naturalidadeResponsavel;
	}

	public void setNaturalidadeResponsavel(String naturalidadeResponsavel) {
		this.naturalidadeResponsavel = naturalidadeResponsavel;
	}

	@Column(length = 40, nullable = true)
	public String getProfissaoResponsavel() {
		return profissaoResponsavel;
	}

	public void setProfissaoResponsavel(String profissaoResponsavel) {
		this.profissaoResponsavel = profissaoResponsavel;
	}

	@Column(length = 40, nullable = true)
	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	@Column(length = 9, nullable = true)
	public String getCepResponsavel() {
		return cepResponsavel;
	}

	public void setCepResponsavel(String cepResponsavel) {
		this.cepResponsavel = cepResponsavel;
	}

	@Column(length = 80, nullable = true)
	public String getEnderecoResponsavel() {
		return enderecoResponsavel;
	}

	public void setEnderecoResponsavel(String enderecoResponsavel) {
		this.enderecoResponsavel = enderecoResponsavel;
	}

	@Column(length = 20, nullable = true)
	public String getNumeroResponsavel() {
		return numeroResponsavel;
	}

	public void setNumeroResponsavel(String numeroResponsavel) {
		this.numeroResponsavel = numeroResponsavel;
	}

	@Column(length = 40, nullable = true)
	public String getBairroResponsavel() {
		return bairroResponsavel;
	}

	public void setBairroResponsavel(String bairroResponsavel) {
		this.bairroResponsavel = bairroResponsavel;
	}

	@Column(length = 250, nullable = true)
	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Column(length = 40, nullable = true)
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Column(nullable = true)
	public int getCRO() {
		return CRO;
	}
	

	public void setCRO(int cRO) {
		CRO = cRO;
	}

	@Column(length = 10, nullable = true)
	public String getComissao() {
		return comissao;
	}

	public void setComissao(String comissao) {
		this.comissao = comissao;
	}

	@Column(length = 20, nullable = true)
	public String getTipoComissao() {
		return tipoComissao;
	}

	public void setTipoComissao(String tipoComissao) {
		this.tipoComissao = tipoComissao;
	}

	@Column(length = 20, nullable = true)
	public String getPercentual() {
		return percentual;
	}

	public void setPercentual(String percentual) {
		this.percentual = percentual;
	}

	@Column(nullable = true)
	public int getDescTaxaCartao() {
		return descTaxaCartao;
	}

	public void setDescTaxaCartao(int descTaxaCartao) {
		this.descTaxaCartao = descTaxaCartao;
	}

	@Column(length = 40, nullable = true)
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Column(length = 60, nullable = true)
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Column(nullable = true)
	public int getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(int inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	@Column(length = 40, nullable = true)
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	@Column(length = 60, nullable = true)
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Column(length = 60, nullable = true)
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Column(length = 60, nullable = true)
	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	@Column(length = 15, nullable = true)
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	@Column(nullable = true)
	public int getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	@Column(nullable = true)
	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	@Column(length = 20, nullable = true)
	public String getCarteiradeTrabalho() {
		return carteiradeTrabalho;
	}

	public void setCarteiradeTrabalho(String carteiradeTrabalho) {
		this.carteiradeTrabalho = carteiradeTrabalho;
	}

	@Column(nullable = true)
	public int getCNH() {
		return CNH;
	}

	public void setCNH(int cNH) {
		CNH = cNH;
	}

	@Column(length = 20, nullable = true)
	public String getTereira() {
		return tereira;
	}

	public void setTereira(String tereira) {
		this.tereira = tereira;
	}

	@Column(length = 20, nullable = true)
	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	@Column(length = 40, nullable = true)
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_admissao", nullable = true)
	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_demissao", nullable = true)
	public Date getDemissao() {
		return demissao;
	}

	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}

	@Column(length = 80, nullable = true)
	public String getMotivoDemissao() {
		return motivoDemissao;
	}

	public void setMotivoDemissao(String motivoDemissao) {
		this.motivoDemissao = motivoDemissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pessoas other = (Pessoas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
