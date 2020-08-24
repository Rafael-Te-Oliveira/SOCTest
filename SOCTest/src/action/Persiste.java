package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExameDAO;

public class Persiste extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomePaciente, local, nomeMedico, data, diagnostico;

	@Override
	public String execute() throws Exception {

		ExameDAO exameDao = new ExameDAO();

		exameDao.adicionaExame(nomePaciente, local, nomeMedico, data, diagnostico);

		return "sucess";
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}
