package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExameDAO;

public class Deleta extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String nomePaciente;
	ExameDAO exameDao = new ExameDAO();

	@Override
	public String execute() {
		try {
			exameDao.deletaExame(nomePaciente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "deleta";
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public ExameDAO getExameDao() {
		return exameDao;
	}

	public void setExameDao(ExameDAO exameDao) {
		this.exameDao = exameDao;
	}

}
