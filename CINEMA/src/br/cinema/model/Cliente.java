package br.cinema.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_cliente")//igual na tabela do banco
public class Cliente extends Pessoa {
	
	//extends Pessoa
//		public Cliente(String cpf, String nome, String endereco, String fone, Date dtNascimento, String email, String cnpj, String cep) {
//		super(cpf, nome, endereco, fone, dtNascimento, email, cnpj, cep);
//		// TODO Auto-generated constructor stub
//	}
		//---------------------------------------------------
		
		@Column(name="tipoClienteNVPO")
		private String tipoCliente; //Normal; VIP; Platinum; Ouro
		private String estudante;
		private String validade;
		
		
		

		
		public String getTipoCliente() {
			return tipoCliente;
		}
		
		//----------------------------------------------------
		public void setTipoCliente(String tipoCliente) {
			this.tipoCliente = tipoCliente;
		}
		
		//----------------------------------------------------
		public String Estudante() {
			return estudante;
		}
		
		//----------------------------------------------------
		public void setEstudante(String estudante) {
			this.estudante = estudante;
		}
		
		//----------------------------------------------------
		public String getValidade() {
			return validade;
		}
		
		//----------------------------------------------------
		public void setValidade(String validade) {
			this.validade = validade;
		}
		
	
			
		
}
