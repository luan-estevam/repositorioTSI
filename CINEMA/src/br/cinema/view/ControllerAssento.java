package br.cinema.view;

import br.cinema.dao.AssentoDAO;
import br.cinema.dao.ClientesDAO;
import br.cinema.model.Assento;
import br.cinema.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerAssento {
	
	@FXML
	private TextField txtAssento;

	@FXML
	private TextField txtPoltrona;
	
	@FXML
	private Button btnGravar;
	
	@FXML
	private Button btnFechar;
	
	
	@FXML
	void close(ActionEvent event) {
		System.exit(0);
	}
	
	@FXML
    private void salvar(ActionEvent mouseEvent) {
    	Assento novoAssento = new Assento();
    	
    	String poltrona = txtPoltrona.getText().trim();
    	
    	if (poltrona.equals("") )  {
			
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
    	
    	novoAssento.setTipo(txtAssento.getText());
    	novoAssento.setPoltrona(txtPoltrona.getText()); 
    	
    	
    	AssentoDAO daoAss = new AssentoDAO();
    	daoAss.save(novoAssento);
    	
    	
    	
    	
    }
	
//	public void LimparCampos(){
//	    
//		txtAssento.setText("");
//		
//	    
//	}

}
