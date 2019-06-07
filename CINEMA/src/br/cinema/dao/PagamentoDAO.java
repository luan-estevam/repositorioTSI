package br.cinema.dao;

import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.model.Pagamento;

public interface PagamentoDAO {
	
public void savePagamento(Pagamento pagamento) throws CinemaDAOException;
	
	public boolean deletePagamento(int id);
	
	public List<Pagamento> getPagamento();
	
	public void updatePagamento(Pagamento pagamento);

}
