package br.cinema.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente{
	
	//extends Pessoa
//		public Cliente(String cpf, String nome, String endereco, String fone, Date dtNascimento, String email, String cnpj, String cep) {
//		super(cpf, nome, endereco, fone, dtNascimento, email, cnpj, cep);
//		// TODO Auto-generated constructor stub
//	}
		//---------------------------------------------------
		@Id
		private int idClientes;
		@Column(name="tipoClienteNVPO")
		private String tipoCliente; //Normal; VIP; Platinum; Ouro
		private boolean estudante;
		private LocalDate validade;
		
		
		//----------------------------------------------------
		public String getTipoCliente() {
			return tipoCliente;
		}
		
		//----------------------------------------------------
		public void setTipoCliente(String tipoCliente) {
			this.tipoCliente = tipoCliente;
		}
		
		//----------------------------------------------------
		public boolean isEstudante() {
			return estudante;
		}
		
		//----------------------------------------------------
		public void setEstudante(boolean estudante) {
			this.estudante = estudante;
		}
		
		//----------------------------------------------------
		public LocalDate getValidade() {
			return validade;
		}
		
		//----------------------------------------------------
		public void setValidade(LocalDate validade) {
			this.validade = validade;
		}
			
		
}
