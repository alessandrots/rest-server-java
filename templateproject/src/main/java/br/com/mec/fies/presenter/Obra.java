package br.com.mec.fies.presenter;

import java.io.Serializable;

public class Obra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5730690360860015635L;
	
	/**
 {
                name: 'nome',
                type: 'string',
            },
            {
                name: 'endereco',
                type: 'string',
            },
            {
                name: 'custoEstimado',
                type: 'float',
            },
            {
                name: 'custoAtual',
                type: 'float',
            },
            {
                name: 'previsaoEntrega',
                type: 'date',
            },
            {
                name: 'progresso',
                type: 'float',
            },
            {
                name: 'status',
                type: 'string',
            },
            {
                name: 'latitude',
                type: 'float',
//                mapping: 'coordenadas.lat'
            },
            {
                name: 'longitude',
                type: 'float',
//                mapping: 'coordenadas.long'
            },
            {
                name: 'uf',
                type: 'string'
            },
            {
                name: 'bairro',
                type: 'string'
            },
            {
                name: 'empresaContratada',
                type: 'string'
            }
	 */
	
	private Integer codigo;
	private Integer ano;
    private String nome;
    private String status; 
    private Double latitude ; 
    private Double longitude ; 
    private String uf ;
    private String municipio; 
    private Integer numCep  ; 
    private String endereco; 
    private String bairro; 
    private String desComplemento; 
    private String numEndereco; 
    private String esferaAdministrativa;
    private String tipoEnsino;
    private String tipoLogiaObra;
    private String tipoObra;
    private String custoEstimado;
    private String custoAtual;
    private String dataAcompanhamento;
    private String previsaoEntrega;
    private String situacao2;
    private Double progresso ;
    private String motivoParalisada;
    private String imagensSmall;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeObra) {
		this.nome = nomeObra;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String situacao) {
		this.status = situacao;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String desEndereco) {
		this.endereco = desEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String nomeBairro) {
		this.bairro = nomeBairro;
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
	public String getCustoEstimado() {
		return custoEstimado;
	}
	public void setCustoEstimado(String valorPrevisto) {
		this.custoEstimado = valorPrevisto;
	}
	public String getCustoAtual() {
		return custoAtual;
	}
	public void setCustoAtual(String valorPago) {
		this.custoAtual = valorPago;
	}
	public String getDataAcompanhamento() {
		return dataAcompanhamento;
	}
	public void setDataAcompanhamento(String dataAcompanhamento) {
		this.dataAcompanhamento = dataAcompanhamento;
	}
	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}
	public void setPrevisaoEntrega(String dataPrevisaoConclusao) {
		this.previsaoEntrega = dataPrevisaoConclusao;
	}
	public String getSituacao2() {
		return situacao2;
	}
	public void setSituacao2(String situacao2) {
		this.situacao2 = situacao2;
	}
	public Double getProgresso() {
		return progresso;
	}
	public void setProgresso(Double percentual) {
		this.progresso = percentual;
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
