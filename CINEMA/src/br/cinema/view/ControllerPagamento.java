package br.cinema.view;


import br.cinema.dao.PagamentoDAO;
import br.cinema.model.Pagamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
	    private void salvar(ActionEvent mouseEvent) {
	    	Pagamento novoPagamento = new Pagamento();
	    	
	    	String pagamento = txtFormaPagamento.getText().trim();
		
			
			if (pagamento.equals(""))  {
				
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
			
	    	
	    	novoPagamento.setForma(txtFormaPagamento.getText());
	    	
	    	
	    	
	    	PagamentoDAO daoPag = new PagamentoDAO();
	    	daoPag.save(novoPagamento);
	    	
	    	
	    	
	    	
	    }
		
//		public void LimparCampos(){
//		    
//			txtFormaPagamento.setText("");
//		
//		    
//		}
}
