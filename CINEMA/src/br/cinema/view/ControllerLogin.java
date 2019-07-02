package br.cinema.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.dao.AutenticarDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerLogin {

	@FXML
	private TextField txtLogin;

	@FXML
	private TextField txtSenha;

	@FXML
	void Logar(ActionEvent event) throws CinemaDAOException, IOException {
		String user = txtLogin.getText().trim();
		String pwd = txtSenha.getText().trim();

		if (user.equals("") && (pwd.equals(""))) {
			Alert msg = new Alert(AlertType.ERROR);
			msg.setContentText("Preencha os campos corretamente");
			msg.setHeaderText("Ops.. Algo deu errado!");
			msg.showAndWait();

			return;
		}

		AutenticarDAO aulog = new AutenticarDAO();

		if (aulog.getLogin(user, pwd)) {
			System.out.println("Direcionar para proxima pagina");
			try {
				Pane root = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
				Scene scene = new Scene(root);
				Stage primaryStage = new Stage();
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (IOException e) {
				System.out.println(e);
			}

		} else {
			Alert msg = new Alert(AlertType.ERROR);
			msg.setContentText("Usuario ou Senha Incorretos");
			msg.setHeaderText("Ops.. Algo deu errado!");
			msg.showAndWait();
		}
	}

	@FXML
	void close(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void criarConta(ActionEvent event) {

		final Stage primaryStage = new Stage();

		System.out.println("criarConta");

		try {
			Pane root = FXMLLoader.load(getClass().getResource("../view/cliente.fxml"));
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
