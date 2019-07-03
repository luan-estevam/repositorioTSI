package br.cinema.view;


import br.cinema.dao.SessaoDAO;
import br.cinema.model.Sessao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
	    private void salvar(ActionEvent mouseEvent) {
	    	Sessao novaSessao = new Sessao();
	    	
	    	String data = txtData.getText().trim();
			String hora = txtHora.getText().trim();
			String valor = txtValor.getText().trim();
			String tipo = txtTipo.getText().trim();
			
			
			if (data.equals("") && (hora.equals("")) && (valor.equals("")) && (tipo.equals("") ))  {
				
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
	    	
	    	novaSessao.setData(txtData.getText());
	    	novaSessao.setHora(txtHora.getText()); 
	    	novaSessao.setValor(txtValor.getText());
	    	novaSessao.setTipo(txtTipo.getText()); 
	    	
	    	
	    	SessaoDAO daoSess = new SessaoDAO();
	    	daoSess.save(novaSessao);
	    	
	    	
	    }
		
//		public void LimparCampos(){
//		    
//			txtData.setText("");
//			txtHora.setText("");
//			txtValor.setText("");
//			txtTipo.setText("");
//			
//		    
//		}

}
