package br.cinema.view;

import br.cinema.dao.ClientesDAO;
import br.cinema.model.Cliente;
import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerCliente {

    @FXML
    private TextField txtValidade;

    @FXML
    private TextField txtEmailCliente;

    @FXML
    private TextField txtCnpjCliente;

    @FXML
    private TextField txtFoneCliente;

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnGravar;

    @FXML
    private TextField txtEnderecoCliente;

    @FXML
    private TextField txtEstudante;

    @FXML
    private TextField txtCepCliente;

    @FXML
    private TextField txtCpfCliente;

    @FXML
    private TextField txtTipoCliente;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtDataNascimentoCliente;
    
    @FXML
    private TextField txtSenhaCliente;
    
	public void checkDados() {
		
	    Formatar fmt = new FormatarString();
		
		String cpf = txtCpfCliente.getText();
		String maskCpf = "###.###.###-##";
		
	}
	
	@FXML
	void close(ActionEvent event) {
		System.exit(0);
	}
	
	@FXML
    private void salvar(ActionEvent mouseEvent) {
    	Cliente novoCliente = new Cliente();
    	
    	String nome = txtNomeCliente.getText().trim();
		String cpf = txtCpfCliente.getText().trim();
		String fone = txtFoneCliente.getText().trim();
		String endereco = txtEnderecoCliente.getText().trim();
		String dtNascimento = txtDataNascimentoCliente.getText().trim();
		String email = txtEmailCliente.getText().trim();
		String cnpj = txtCnpjCliente.getText().trim();
		String cep = txtCpfCliente.getText().trim();
		String tipoCliente = txtTipoCliente.getText().trim();
		String estudante = txtEstudante.getText().trim();
		String validade = txtValidade.getText().trim();
		String senha = txtSenhaCliente.getText().trim();
		
		if (nome.equals("") && (cpf.equals("")) && (fone.equals("")) && (endereco.equals("") && (dtNascimento.equals("")
				&& (email.equals("") && (cnpj.equals("") && (cep.equals("") && (tipoCliente.equals("") && (estudante.equals("")
						&& (validade.equals("") && (senha.equals("")))))))))))  {
			
			Alert msg = new Alert(AlertType.ERROR);
			msg.setContentText("Preencha os campos corretamente");
			msg.setHeaderText("Ops.. Algo deu errado!");
			msg.showAndWait();

			return;
			
		}else {
			
			
			Alert msg = new Alert(AlertType.CONFIRMATION);
			msg.setContentText("Obrigado!");
			msg.setHeaderText("Salvo com sucesso!");
			msg.showAndWait();
			
		}
		
    	
    	novoCliente.setNome(txtNomeCliente.getText());
    	novoCliente.setCpf(txtCpfCliente.getText());
    	novoCliente.setFone(txtFoneCliente.getText());
    	novoCliente.setEndereco(txtEnderecoCliente.getText());
    	novoCliente.setDtNascimento(txtDataNascimentoCliente.getText());
    	novoCliente.setEmail(txtEmailCliente.getText());
    	novoCliente.setCnpj(txtCnpjCliente.getText());
    	novoCliente.setCep(txtCepCliente.getText());
    	novoCliente.setTipoCliente(txtTipoCliente.getText());
    	novoCliente.setEstudante(txtEstudante.getText());
    	novoCliente.setValidade(txtValidade.getText());
    	novoCliente.setSenha(txtSenhaCliente.getText());
    	
    	
    	 
    	
    	
    	ClientesDAO daoCli = new ClientesDAO();
    	daoCli.save(novoCliente);
    	
    	
    
    	
    }
	

	
//	public void LimparCampos(){
//	    
//		txtNomeCliente.setText("");
//		txtCpfCliente.setText("");
//		txtFoneCliente.setText("");
//		txtEnderecoCliente.setText("");
//		txtDataNascimentoCliente.setText("");
//		txtEmailCliente.setText("");
//		txtCnpjCliente.setText("");
//		txtCepCliente.setText("");
//		txtTipoCliente.setText("");
//		txtEstudante.setText("");
//		txtValidade.setText("");
//		txtSenhaCliente.setText("");
//	    
//	}
		
		

}



