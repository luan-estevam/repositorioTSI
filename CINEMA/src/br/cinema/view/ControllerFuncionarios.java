package br.cinema.view;


import br.cinema.dao.FuncionarioDAO;
import br.cinema.model.Funcionarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerFuncionarios {
	
	 @FXML
	    private TextField txtSalario;

	    @FXML
	    private TextField txtFuncao;

	    @FXML
	    private TextField txtDataAdmissao;

	    @FXML
	    private TextField txtCpfFuncionario;
	    
	    @FXML
	    private TextField txtNomeFuncionario;
	    
	    @FXML
	    private TextField txtEnderecoFuncionario;
	    
	    @FXML
	    private TextField txtFoneFuncionario;
	    
	    @FXML
	    private TextField txtDataNascimentoFuncionario;
	    
	    @FXML
	    private TextField txtEmailFuncionario;
	    
	    @FXML
	    private TextField txtCnpjFuncionario;

	    @FXML
	    private TextField txtCepFuncionario;
	    
	    @FXML
	    private Button btnFechar;

	    @FXML
	    private Button btnGravar;

	    
		@FXML
		void close(ActionEvent event) {
			System.exit(0);
		}
		
		@FXML
	    private void salvar(ActionEvent mouseEvent) {
	    	Funcionarios novoFuncionario = new Funcionarios();
	    	
	    	String salario = txtSalario.getText().trim();
			String funcao = txtFuncao.getText().trim();
			String admissao = txtDataAdmissao.getText().trim();
			String cpf = txtCpfFuncionario.getText().trim();
			String nome = txtNomeFuncionario.getText().trim();
			String endereco = txtEnderecoFuncionario.getText().trim();
			String fone = txtFoneFuncionario.getText().trim();
			String dtNascimento = txtDataNascimentoFuncionario.getText().trim();
			String email = txtEmailFuncionario.getText().trim();
			String cnpj = txtCnpjFuncionario.getText().trim();
			String cep = txtCepFuncionario.getText().trim();
			
			
			if (salario.equals("") && (funcao.equals("")) && (admissao.equals("")) && (cpf.equals("") && (nome.equals("")
					&& (endereco.equals("") && (fone.equals("") && (dtNascimento.equals("") && (email.equals("") && (cnpj.equals("")
							&& (cep.equals("") )))))))))  {
				
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
			
	    	
	    	novoFuncionario.setNome(txtNomeFuncionario.getText());
	    	novoFuncionario.setSalario(txtSalario.getText());
	    	novoFuncionario.setFuncao(txtFuncao.getText());
	    	novoFuncionario.setDataAdmissao(txtDataAdmissao.getText());
	    	novoFuncionario.setCpf(txtCpfFuncionario.getText());
	    	novoFuncionario.setFone(txtFoneFuncionario.getText());
	    	novoFuncionario.setEndereco(txtEnderecoFuncionario.getText());
	    	novoFuncionario.setDtNascimento(txtDataNascimentoFuncionario.getText());
	    	novoFuncionario.setEmail(txtEmailFuncionario.getText());
	    	novoFuncionario.setCnpj(txtCnpjFuncionario.getText());
	    	novoFuncionario.setCep(txtCepFuncionario.getText());
	    	 
	    	
	    	
	    	FuncionarioDAO daoFun = new FuncionarioDAO();
	    	daoFun.save(novoFuncionario);
	    	
	    	
	    	
	    	
	    }
		
//		public void LimparCampos(){
//		    
//			txtSalario.setText("");
//			txtFuncao.setText("");
//			txtDataAdmissao.setText("");
//			txtCpfFuncionario.setText("");
//			txtEnderecoFuncionario.setText("");
//			txtFoneFuncionario.setText("");
//			txtDataNascimentoFuncionario.setText("");
//			txtEmailFuncionario.setText("");
//			txtCnpjFuncionario.setText("");
//			txtCepFuncionario.setText("");
//			
//		    
//		}

}
