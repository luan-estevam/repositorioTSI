package br.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tab_assento")

public class Assento {
	
//	@GeneratedValue
	@GeneratedValue
	@Id
	private int id; //tem que ter o id em todas as classes
//	@Column(name="tipoAssentoNVPO")
	private String tipo;
	private String poltrona;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}

}
