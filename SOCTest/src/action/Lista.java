package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExameDAO;
import model.Exame;

public class Lista extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<Exame> exames = null;
	ExameDAO exameDao = new ExameDAO();
	
	@Override
	public String execute() {
		
		exames = exameDao.listaExames();
		
		return "lista";
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	public ExameDAO getExameDao() {
		return exameDao;
	}

	public void setExameDao(ExameDAO exameDao) {
		this.exameDao = exameDao;
	}

}
