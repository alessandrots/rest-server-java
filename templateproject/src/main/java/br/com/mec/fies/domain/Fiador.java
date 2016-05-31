package br.com.mec.fies.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="fiador")
public class Fiador implements Domain {

	private static final long serialVersionUID = 8100466822905209118L;

	@Id @Generated(GenerationTime.INSERT) 
	@Column(name="codigo", nullable=false) 
	private Integer codigo;
	
	@NotNull
	@Column(name="noFiador", nullable=false, length=100)
	private String noFiador;
	
	@NotNull
	@Column(name="nuCpf", nullable=false, length=11)
    private String nuCpf;
	
	@NotNull
	@Column(name="vlRenda", nullable=false)
    private Double vlRenda;
	
	@NotNull
	@Column(name="nuCpfEstudante", nullable=false, length=11)
	private String nuCpfEstudante;
	
	@NotNull
	@Column(name="coAditamento", nullable=false)
	private Integer coAditamento;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNoFiador() {
		return noFiador;
	}

	public void setNoFiador(String noFiador) {
		this.noFiador = noFiador;
	}

	public String getNuCpf() {
		return nuCpf;
	}

	public void setNuCpf(String nuCpf) {
		this.nuCpf = nuCpf;
	}

	public Double getVlRenda() {
		return vlRenda;
	}

	public void setVlRenda(Double vlRenda) {
		this.vlRenda = vlRenda;
	}

	public String getNuCpfEstudante() {
		return nuCpfEstudante;
	}

	public void setNuCpfEstudante(String nuCpfEstudante) {
		this.nuCpfEstudante = nuCpfEstudante;
	}

	public Integer getCoAditamento() {
		return coAditamento;
	}

	public void setCoAditamento(Integer coAditamento) {
		this.coAditamento = coAditamento;
	}
	
	
}
