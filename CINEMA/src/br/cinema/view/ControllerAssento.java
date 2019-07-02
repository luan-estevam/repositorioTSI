package br.cinema.view;

import br.cinema.dao.AssentoDAO;
import br.cinema.dao.ClientesDAO;
import br.cinema.model.Assento;
import br.cinema.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private void salvar() {
    	Assento novoAssento = new Assento();
    	
    	novoAssento.setTipo(txtAssento.getText());
    	novoAssento.setPoltrona(txtPoltrona.getText()); 
    	
    	
    	AssentoDAO daoAss = new AssentoDAO();
    	daoAss.save(novoAssento);
    	
    	
    	
    	
    }

}
