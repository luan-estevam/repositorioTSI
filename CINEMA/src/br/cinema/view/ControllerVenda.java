package br.cinema.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ControllerVenda {
	
    @FXML
    private ComboBox<?> cdFilme;

    @FXML
    private Button btnGravar;

    @FXML
    private Label lblData;
    
    @FXML
    private Label lblValor;

    @FXML
    private Label lblFilme;

    @FXML
    private Label lblPoltrona;

    @FXML
    private Button btnFechar;

    @FXML
    private ComboBox<?> cbData;

    @FXML
    private ComboBox<?> cbPoltrona;
    
    
    

    @FXML
    void Fechar(ActionEvent event) {
    	
    	System.exit(0);

    }

    @FXML
    void Salvar(ActionEvent event) {
    	
    	

    }

}
