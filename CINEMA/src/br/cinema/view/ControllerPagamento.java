package br.cinema.view;


import br.cinema.dao.PagamentoDAO;
import br.cinema.model.Pagamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerPagamento {
	

	 @FXML
	    private TextField txtFormaPagamento;

	    
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
	    	Pagamento novoPagamento = new Pagamento();
	    	
	    	novoPagamento.setForma(txtFormaPagamento.getText());
	    	
	    	
	    	
	    	PagamentoDAO daoPag = new PagamentoDAO();
	    	daoPag.save(novoPagamento);
	    	
	    	
	    	
	    	
	    }
}
