package br.cinema.view;

import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    

	public void checkDados() {
		
	    Formatar fmt = new FormatarString();
		
		String cpf = txtCpfCliente.getText();
		String maskCpf = "###.###.###-##";
		
	}

}



