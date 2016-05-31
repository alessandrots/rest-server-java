package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="ies")
public class Ies {

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="coIes", nullable=false) 
	private Integer coIes;
	
	@NotNull
	@Column(name="noIes", nullable=false, length=40)
	private String noIes;
	
	@NotNull
	@Column(name="coLocalOferta", nullable=false)
	private Integer coLocalOferta;
	
	@NotNull
	@Column(name="noLocalOferta", nullable=false, length=40)
	private String noLocalOferta;
	
	@NotNull
	@Column(name="coCurso", nullable=false)
	private Integer coCurso;
	
	@NotNull
	@Column(name="noCurso", nullable=false, length=40)
	private String noCurso;
	
	@NotNull
	@Column(name="dsGrau", nullable=false, length=40)
	private String dsGrau;
	
	@NotNull
	@Column(name="dsTurno", nullable=false, length=40)
	private String dsTurno;
	
	@NotNull
	@Column(name="coAditamento", nullable=false)
	private Integer coAditamento;
	
	public Integer getCoIes() {
		return coIes;
	}
	public void setCoIes(Integer coIes) {
		this.coIes = coIes;
	}
	public String getNoIes() {
		return noIes;
	}
	public void setNoIes(String noIes) {
		this.noIes = noIes;
	}
	public Integer getCoLocalOferta() {
		return coLocalOferta;
	}
	public void setCoLocalOferta(Integer coLocalOferta) {
		this.coLocalOferta = coLocalOferta;
	}
	public String getNoLocalOferta() {
		return noLocalOferta;
	}
	public void setNoLocalOferta(String noLocalOferta) {
		this.noLocalOferta = noLocalOferta;
	}
	public Integer getCoCurso() {
		return coCurso;
	}
	public void setCoCurso(Integer coCurso) {
		this.coCurso = coCurso;
	}
	public String getNoCurso() {
		return noCurso;
	}
	public void setNoCurso(String noCurso) {
		this.noCurso = noCurso;
	}
	public String getDsGrau() {
		return dsGrau;
	}
	public void setDsGrau(String dsGrau) {
		this.dsGrau = dsGrau;
	}
	public String getDsTurno() {
		return dsTurno;
	}
	public void setDsTurno(String dsTurno) {
		this.dsTurno = dsTurno;
	}
	public Integer getCoAditamento() {
		return coAditamento;
	}
	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}
	
}
