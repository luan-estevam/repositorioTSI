package br.cinema.view;


import br.cinema.dao.FilmeDAO;
import br.cinema.model.Filme;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
	    private void salvar() {
	    	Filme novoFilme = new Filme();
	    	
	    	novoFilme.setTitulo(txtTitulo.getText());
	    	novoFilme.setDuracao(txtDuracao.getText()); 
	    	novoFilme.setGenero(txtGenero.getText());
	    	novoFilme.setResumo(txtResumo.getText()); 
	    	novoFilme.setClassificacao(txtClassificacao.getText());
	    	 
	    	
	    	FilmeDAO daoFil = new FilmeDAO();
	    	daoFil.save(novoFilme);
	    	
	    	
	    	
	    	
	    }

}
