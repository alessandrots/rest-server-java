package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="obra")
public class Obra implements Domain {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1970422721749471672L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="icodigo", nullable=false) 
	private Integer codigo;
	
	@Column(name="ano", nullable=true) 
	private Integer ano;
	
	@Column(name="nomeobra", length=200)
    private String nomeObra;
    
	@Column(name="situacao", length=80)
    private String situacao; 
    
	@Column(name="latitude", nullable=true)
    private Double latitude ; 
    
	@Column(name="longitude", nullable=true)
    private Double longitude ; 
    
    @Column(name="uf", length=2)
    private String uf ;
    
    @Column(name="municipio", length=11)
    private String municipio; 
    
    @Column(name="numcep", nullable=true)
    private Integer numCep  ; 
    
    @Column(name="desendereco", length=80)
    private String desEndereco; 
    
    @Column(name="nombairro", length=80)
    private String nomeBairro; 
    
    @Column(name="descomplemento", length=80)
    private String desComplemento; 
    
    @Column(name="numendereco", length=80)
    private String numEndereco; 
    
    @Column(name="esferaadministrativa", length=1)
    private String esferaAdministrativa;
    
    @Column(name="tipoensino", length=80)
    private String tipoEnsino;
    
    @Column(name="tipologiaobra", length=80)
    private String tipoLogiaObra;
    
    @Column(name="tipoobra", length=80)
    private String tipoObra;
    
    @Column(name="valorprevisto", length=40)
    private String valorPrevisto;
    
    @Column(name="valorpago", length=40)
    private String valorPago;
    
    @Column(name="dataacompanhamento", length=10)
    private String dataAcompanhamento;
    
    @Column(name="dataprevisaoconclusao", length=10)
    private String dataPrevisaoConclusao;
    
    @Column(name="situacao2", length=80)
    private String situacao2;
    
    @Column(name="percentual", nullable=true)
    private Double percentual ;
    
    @Column(name="motivoparalisada", length=80)
    private String motivoParalisada;
    
    @Column(name="imagenssmall")
    private String imagensSmall;
    
    @Column(name="imagens")
    private String imagens;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNomeObra() {
		return nomeObra;
	}

	public void setNomeObra(String nomeObra) {
		this.nomeObra = nomeObra;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Integer getNumCep() {
		return numCep;
	}

	public void setNumCep(Integer numCep) {
		this.numCep = numCep;
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

	public String getEsferaAdministrativa() {
		return esferaAdministrativa;
	}

	public void setEsferaAdministrativa(String esferaAdministrativa) {
		this.esferaAdministrativa = esferaAdministrativa;
	}

	public String getTipoEnsino() {
		return tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public String getTipoLogiaObra() {
		return tipoLogiaObra;
	}

	public void setTipoLogiaObra(String tipoLogiaObra) {
		this.tipoLogiaObra = tipoLogiaObra;
	}

	public String getTipoObra() {
		return tipoObra;
	}

	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public String getValorPrevisto() {
		return valorPrevisto;
	}

	public void setValorPrevisto(String valorPrevisto) {
		this.valorPrevisto = valorPrevisto;
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}

	public String getDataAcompanhamento() {
		return dataAcompanhamento;
	}

	public void setDataAcompanhamento(String dataAcompanhamento) {
		this.dataAcompanhamento = dataAcompanhamento;
	}

	public String getDataPrevisaoConclusao() {
		return dataPrevisaoConclusao;
	}

	public void setDataPrevisaoConclusao(String dataPrevisaoConclusao) {
		this.dataPrevisaoConclusao = dataPrevisaoConclusao;
	}

	public String getSituacao2() {
		return situacao2;
	}

	public void setSituacao2(String situacao2) {
		this.situacao2 = situacao2;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public String getMotivoParalisada() {
		return motivoParalisada;
	}

	public void setMotivoParalisada(String motivoParalisada) {
		this.motivoParalisada = motivoParalisada;
	}

	public String getImagensSmall() {
		return imagensSmall;
	}

	public void setImagensSmall(String imagensSmall) {
		this.imagensSmall = imagensSmall;
	}

	public String getImagens() {
		return imagens;
	}

	public void setImagens(String imagens) {
		this.imagens = imagens;
	}
    
    
    

}
