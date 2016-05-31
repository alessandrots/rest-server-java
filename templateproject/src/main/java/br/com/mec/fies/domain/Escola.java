package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="escola")
public class Escola implements Domain {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1828174287486558780L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="identidade", nullable=false) 
	private Integer identidade;
	
	@NotNull
	@Column(name="numano", nullable=false)
	private Integer numAno; 
	
	@NotNull
	@Column(name="codinep", nullable=false)
	private Integer codInep;
	
	@NotNull
	@Column(name="nomerazaosocial", nullable=false, length=100)
	private String nomeRazaoSocial;
	
	@Column(name="coddependadm", length=11)
	private String codDependAdm;  
	
	@Column(name="destipoentidade", nullable=true)
	private String desTipoEntidade; 
	
	@Column(name="numlatitude", nullable=true)
	private Double numLatitude; 
	
	@Column(name="numlongitude", nullable=true)
	private Double numLongitude;  
	
	@Column(name="codmunicipio", nullable=true)
	private String codMunicipio;  
	
	@Column(name="nomemunicipio", nullable=true)
	private String nomeMunicipio;  
	
	@Column(name="coduf", nullable=true)
	private String codUf; 
	
	@Column(name="nomeregiao", nullable=true)
	private String nomeRegiao; 
	
	@Column(name="codmesoregiao", nullable=true)
	private String codMesoRegiao; 
	
	@Column(name="nomemesoregiao", nullable=true)
	private String nomeMesoRegiao; 
	
	@Column(name="codmicroregiao", nullable=true)
	private String codMicroregiao;  
	
	@Column(name="nomeMicroregiao", nullable=true)
	private String nomeMicroregiao;  
	
	@Column(name="codfuncionamento", nullable=true)
	private String codFuncionamento;  
	
	@Column(name="desendereco", nullable=true)
	private String desEndereco; 
	
	@Column(name="nombairro", nullable=true)
	private String nomeBairro; 
	
	@Column(name="descomplemento", nullable=true)
	private String desComplemento;  
	
	@Column(name="numendereco", nullable=true)
	private String numEndereco; 
	
	@Column(name="numcep", nullable=true)
	private Integer numCep;  
	
	@Column(name="numddd", nullable=true)
	private Integer numDdd;  
	
	@Column(name="numtelefone", nullable=true)
	private Integer numTelefone;
	
	@Column(name="destipolocalizacao", nullable=true)
	private String desTipoLocalizacao;

	public Integer getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Integer identidade) {
		this.identidade = identidade;
	}

	public Integer getNumAno() {
		return numAno;
	}

	public void setNumAno(Integer numAno) {
		this.numAno = numAno;
	}

	public Integer getCodInep() {
		return codInep;
	}

	public void setCodInep(Integer codInep) {
		this.codInep = codInep;
	}

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	public String getCodDependAdm() {
		return codDependAdm;
	}

	public void setCodDependAdm(String codDependAdm) {
		this.codDependAdm = codDependAdm;
	}

	public String getDesTipoEntidade() {
		return desTipoEntidade;
	}

	public void setDesTipoEntidade(String desTipoEntidade) {
		this.desTipoEntidade = desTipoEntidade;
	}

	public Double getNumLatitude() {
		return numLatitude;
	}

	public void setNumLatitude(Double numLatitude) {
		this.numLatitude = numLatitude;
	}

	public Double getNumLongitude() {
		return numLongitude;
	}

	public void setNumLongitude(Double numLongitude) {
		this.numLongitude = numLongitude;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getCodUf() {
		return codUf;
	}

	public void setCodUf(String codUf) {
		this.codUf = codUf;
	}

	public String getNomeRegiao() {
		return nomeRegiao;
	}

	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}

	public String getCodMesoRegiao() {
		return codMesoRegiao;
	}

	public void setCodMesoRegiao(String codMesoRegiao) {
		this.codMesoRegiao = codMesoRegiao;
	}

	public String getNomeMesoRegiao() {
		return nomeMesoRegiao;
	}

	public void setNomeMesoRegiao(String nomeMesoRegiao) {
		this.nomeMesoRegiao = nomeMesoRegiao;
	}

	public String getCodMicroregiao() {
		return codMicroregiao;
	}

	public void setCodMicroregiao(String codMicroregiao) {
		this.codMicroregiao = codMicroregiao;
	}

	public String getNomeMicroregiao() {
		return nomeMicroregiao;
	}

	public void setNomeMicroregiao(String nomeMicroregiao) {
		this.nomeMicroregiao = nomeMicroregiao;
	}

	public String getCodFuncionamento() {
		return codFuncionamento;
	}

	public void setCodFuncionamento(String codFuncionamento) {
		this.codFuncionamento = codFuncionamento;
	}

	public String getDesEndereco() {
		return desEndereco;
	}

	public void setDesEndereco(String desEndereco) {
		this.desEndereco = desEndereco;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getDesComplemento() {
		return desComplemento;
	}

	public void setDesComplemento(String desComplemento) {
		this.desComplemento = desComplemento;
	}

	public String getNumEndereco() {
		return numEndereco;
	}

	public void setNumEndereco(String numEndereco) {
		this.numEndereco = numEndereco;
	}

	public Integer getNumCep() {
		return numCep;
	}

	public void setNumCep(Integer numCep) {
		this.numCep = numCep;
	}

	public Integer getNumDdd() {
		return numDdd;
	}

	public void setNumDdd(Integer numDdd) {
		this.numDdd = numDdd;
	}

	public Integer getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(Integer numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getDesTipoLocalizacao() {
		return desTipoLocalizacao;
	}

	public void setDesTipoLocalizacao(String desTipoLocalizacao) {
		this.desTipoLocalizacao = desTipoLocalizacao;
	}
	
}
