package br.cinema.view;


import br.cinema.dao.SessaoDAO;
import br.cinema.model.Sessao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerSessao {
	

	 @FXML
	    private TextField txtData;

	    @FXML
	    private TextField txtHora;

	    @FXML
	    private TextField txtValor;

	    @FXML
	    private TextField txtTipo;
	    
	    
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
	    	Sessao novaSessao = new Sessao();
	    	
	    	novaSessao.setData(txtData.getText());
	    	novaSessao.setHora(txtHora.getText()); 
	    	novaSessao.setValor(txtValor.getText());
	    	novaSessao.setTipo(txtTipo.getText()); 
	    	
	    	
	    	SessaoDAO daoSess = new SessaoDAO();
	    	daoSess.save(novaSessao);
	    	
	    	
	    }

}
