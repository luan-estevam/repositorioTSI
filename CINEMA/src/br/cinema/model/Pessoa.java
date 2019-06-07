package br.cinema.model;

import java.util.Date;

/**
 * @author Luan Estevam
 *
 */
public class Pessoa {
	
	
	private String cpf;
	private String nome;
	private String endereco;
	private String fone;
	private Date dtNascimento;
	private String email;
	private String cnpj;
	private String cep;
	
	
	
	//nenhuma classe pai pode ser instanciada, nuncaaa pode ser instanciada
	
	public Pessoa(String cpf, String nome, String endereco, String fone, Date dtNascimento, String email, String cnpj, String cep) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
		this.dtNascimento = dtNascimento;
		this.email = email;
		this.cnpj = cnpj;
		this.cep = cep;
	}
	
	
	
	//-------------------------------------------------------------------------
	public String getCpf() {
		//retornar cpf com mask
		
		Formatar fmt = new FormatarString();
		String maskCpf = "###.###.###-##";
		return fmt.cpf(cpf, maskCpf);
	}
	

	//-------------------------------------------------------------------------
	
	public void setCpf(String cpf) {
		//validar cpf
		this.cpf = cpf;
	}
	
	//-------------------------------------------------------------------------
	public String getNome() {
		return nome;
	}
	
	//-------------------------------------------------------------------------
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//-------------------------------------------------------------------------
	public String getEndereco() {
		return endereco;
	}
	
	//-------------------------------------------------------------------------
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//-------------------------------------------------------------------------
	public String getFone() {
		//retornar fone com mask
		
		String fone = "5567996907542";
		String maskCnpj = "+##(##)#####-####";
		return fone;
	}
	
	//-------------------------------------------------------------------------
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	//-------------------------------------------------------------------------
	public Date getDtNascimento() {
		return dtNascimento;
	}
	
	//-------------------------------------------------------------------------
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	//-------------------------------------------------------------------------
	public String getEmail() {
		return email;
	}
	
	//-------------------------------------------------------------------------
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getCnpj() {
		Formatar fmt = new FormatarString();
		String maskCnpj = "##.###.###/####-##";
		return cnpj;
	}
	
	//-------------------------------------------------------------------------
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCep() {
		
		String cep = "79645406";
		String maskCep = "#####-###";
		return cep;
	}
	
	//-------------------------------------------------------------------------
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
