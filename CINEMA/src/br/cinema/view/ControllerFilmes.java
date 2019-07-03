package br.cinema.view;


import br.cinema.dao.FilmeDAO;
import br.cinema.model.Filme;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerFilmes {
	
	 @FXML
	    private TextField txtTitulo;

	    @FXML
	    private TextField txtDuracao;

	    @FXML
	    private TextField txtClassificacao;

	    @FXML
	    private TextField txtGenero;
	    
	    @FXML
	    private TextField txtResumo;

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
	    	Filme novoFilme = new Filme();
	    	
	    	String titulo = txtTitulo.getText().trim();
			String duracao = txtDuracao.getText().trim();
			String classificacao = txtClassificacao.getText().trim();
			String genero = txtGenero.getText().trim();
			String resumo = txtResumo.getText().trim();
			
			
			if (titulo.equals("") && (duracao.equals("")) && (classificacao.equals("")) && (genero.equals("") && (resumo.equals(""))))  {
				
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
			
	    	
	    	novoFilme.setTitulo(txtTitulo.getText());
	    	novoFilme.setDuracao(txtDuracao.getText()); 
	    	novoFilme.setGenero(txtGenero.getText());
	    	novoFilme.setResumo(txtResumo.getText()); 
	    	novoFilme.setClassificacao(txtClassificacao.getText());
	    	 
	    	
	    	FilmeDAO daoFil = new FilmeDAO();
	    	daoFil.save(novoFilme);
	    	
	    	
	    	
	    	
	    }

//		public void LimparCampos(){
//		    
//			txtTitulo.setText("");
//			txtDuracao.setText("");
//			txtClassificacao.setText("");
//			txtGenero.setText("");
//			txtResumo.setText("");
//			
//		    
//		}
		
}
