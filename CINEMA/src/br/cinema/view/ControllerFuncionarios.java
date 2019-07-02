package br.cinema.view;


import br.cinema.dao.FuncionarioDAO;
import br.cinema.model.Funcionarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
	    private void salvar() {
	    	Funcionarios novoFuncionario = new Funcionarios();
	    	
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

}
