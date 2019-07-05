package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tab_venda")
public class Venda {
	
	@GeneratedValue
	@Id
	private int id; //tem que ter o id em todas as classes
//	@Column(name="tipoAssentoNVPO")
	@ManyToOne
	private Sessao data;
	@ManyToOne
	private Sessao valor;
	@ManyToOne
	private Assento poltrona;
	@ManyToOne
	private Filme nome;
	
	
	
	//--------------------------------------------------
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Sessao getData() {
		return data;
	}
	public void setData(Sessao data) {
		this.data = data;
	}
	public Sessao getValor() {
		return valor;
	}
	public void setValor(Sessao valor) {
		this.valor = valor;
	}
	public Assento getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(Assento poltrona) {
		this.poltrona = poltrona;
	}
	public Filme getNome() {
		return nome;
	}
	public void setNome(Filme nome) {
		this.nome = nome;
	}
	


	

}


