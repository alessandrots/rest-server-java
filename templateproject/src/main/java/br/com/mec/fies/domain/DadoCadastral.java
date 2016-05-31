package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="dadocadastral")
public class DadoCadastral implements Domain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4699840746053553995L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="codigo", nullable=false) 
	private Integer codigo;
	
	@NotNull
	@Column(name="nuCpf", nullable=false)
	private String nuCpf;
    
	@NotNull
	@Column(name="dsEmail", nullable=false, length=100)
	private String dsEmail;
    
	@NotNull
	@Column(name="coOcupacao", nullable=false)
	private Integer coOcupacao;
    
	@NotNull
	@Column(name="nuCep", nullable=false)
	private String nuCep;
    
	@NotNull
	@Column(name="dsEndereco", nullable=false, length=100)
	private String dsEndereco;
    
	@NotNull
	@Column(name="dsComplemento", nullable=false, length=100)
	private String dsComplemento;
    
	@NotNull
	@Column(name="nuEndereco", nullable=false)
	private Integer nuEndereco;
    
	@NotNull
	@Column(name="nuTelefone", nullable=false, length=11)
	private String nuTelefone;
    
	@NotNull
	@Column(name="nuCelular", nullable=false, length=11)
	private String nuCelular;
    
	@NotNull
	@Column(name="noEstudate", nullable=false, length=100)
	private String noEstudate;
    
	@NotNull
	@Column(name="dtNascimento", nullable=false, length=10)
	private String dtNascimento;
    
	@NotNull
	@Column(name="nuRg", nullable=false, length=10)
	private String nuRg;
    
	@NotNull
	@Column(name="dtEmissao", nullable=false, length=10)
	private String dtEmissao;
    
	@NotNull
	@Column(name="dsOrgaoEmissor", nullable=false, length=40)
	private String dsOrgaoEmissor;
    
	@NotNull
	@Column(name="sgUfOrgaoEmissor", nullable=false, length=10)
	private String sgUfOrgaoEmissor;
    
	@NotNull
	@Column(name="nuRic", nullable=false, length=20)
	private String nuRic;
    
	@NotNull
	@Column(name="stEstadoCivil", nullable=false, length=20)
	private String stEstadoCivil;
    
	@NotNull
	@Column(name="dsOcupacao", nullable=false, length=100)
	private String dsOcupacao;
    
	@NotNull
	@Column(name="dsMunicipio", nullable=false, length=30)
	private String dsMunicipio;
    
	@NotNull
	@Column(name="sgUf", nullable=false, length=2)
	private String sgUf;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public Integer getCoOcupacao() {
		return coOcupacao;
	}

	public void setCoOcupacao(Integer coOcupacao) {
		this.coOcupacao = coOcupacao;
	}

	public String getNuCep() {
		return nuCep;
	}

	public void setNuCep(String nuCep) {
		this.nuCep = nuCep;
	}

	public String getDsEndereco() {
		return dsEndereco;
	}

	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public Integer getNuEndereco() {
		return nuEndereco;
	}

	public void setNuEndereco(Integer nuEndereco) {
		this.nuEndereco = nuEndereco;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

	public String getNuCelular() {
		return nuCelular;
	}

	public void setNuCelular(String nuCelular) {
		this.nuCelular = nuCelular;
	}

	public String getNoEstudate() {
		return noEstudate;
	}

	public void setNoEstudate(String noEstudate) {
		this.noEstudate = noEstudate;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getNuRg() {
		return nuRg;
	}

	public void setNuRg(String nuRg) {
		this.nuRg = nuRg;
	}

	public String getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public String getDsOrgaoEmissor() {
		return dsOrgaoEmissor;
	}

	public void setDsOrgaoEmissor(String dsOrgaoEmissor) {
		this.dsOrgaoEmissor = dsOrgaoEmissor;
	}

	public String getSgUfOrgaoEmissor() {
		return sgUfOrgaoEmissor;
	}

	public void setSgUfOrgaoEmissor(String sgUfOrgaoEmissor) {
		this.sgUfOrgaoEmissor = sgUfOrgaoEmissor;
	}

	public String getNuRic() {
		return nuRic;
	}

	public void setNuRic(String nuRic) {
		this.nuRic = nuRic;
	}

	public String getStEstadoCivil() {
		return stEstadoCivil;
	}

	public void setStEstadoCivil(String stEstadoCivil) {
		this.stEstadoCivil = stEstadoCivil;
	}

	public String getDsOcupacao() {
		return dsOcupacao;
	}

	public void setDsOcupacao(String dsOcupacao) {
		this.dsOcupacao = dsOcupacao;
	}

	public String getDsMunicipio() {
		return dsMunicipio;
	}

	public void setDsMunicipio(String dsMunicipio) {
		this.dsMunicipio = dsMunicipio;
	}

	public String getSgUf() {
		return sgUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}
	
}
