package br.cinema.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Button btnFilme;

	@FXML
	private Button btnSessao;

	@FXML
	private Button btnCliente;

	@FXML
	private Button btnPagamentos;

	@FXML
	private Button btnAssento;

	@FXML
	private Button btnFuncionarios;

	@FXML
	private Button btnLogin;

//    @FXML
//    public void openWindow(ActionEvent mouseEvent) {
//    	
//    }
//    
//    @FXML
//    public boolean checkLogin(ActionEvent Login) {
//    	
//    	return true;
//    	
//    }

	public void openWindow(ActionEvent mouseEvent) {

		if (mouseEvent.getSource() == btnCliente) {

			LoadFXML("cliente.fxml");

		} else if (mouseEvent.getSource() == btnFilme) {

			LoadFXML("filmes.fxml");

		} else if (mouseEvent.getSource() == btnSessao) {

			LoadFXML("sessao.fxml");

		} else if (mouseEvent.getSource() == btnPagamentos) {

			LoadFXML("pagamento.fxml");

		} else if (mouseEvent.getSource() == btnAssento) {

			LoadFXML("assento.fxml");

		} else if (mouseEvent.getSource() == btnFuncionarios) {

			LoadFXML("funcionarios.fxml");

		}
		if (mouseEvent.getSource() == btnLogin) {

			LoadFXML("login.fxml");

		}

	}

	public void LoadFXML(String fxml) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource(fxml));

			Scene s1 = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(s1);
			stage.show();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
