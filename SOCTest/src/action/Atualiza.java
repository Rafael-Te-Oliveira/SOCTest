package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExameDAO;
import model.Exame;

public class Atualiza extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomePaciente, local, nomeMedico, data, diagnostico, nomePacienteHidden;
	String tipoRequisicao;
	Exame exame = null;
	ExameDAO exameDao = new ExameDAO();

	@Override
	public String execute() {
		try {
			if (tipoRequisicao.equals("atualiza")) {
				exame = exameDao.retornaExame(nomePaciente.trim());
				
				nomePaciente = exame.getNomePaciente();
				local = exame.getLocal();
				nomeMedico = exame.getNomeMedico();
				data = exame.getData();
				diagnostico = exame.getDiagnostico();

				return "atualiza";

			} else {
				exameDao.atualizaExame(nomePaciente, local, nomeMedico, data, diagnostico, nomePacienteHidden);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "atualizado";
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

	public String getNomePacienteHidden() {
		return nomePacienteHidden;
	}

	public void setNomePacienteHidden(String nomePacienteHidden) {
		this.nomePacienteHidden = nomePacienteHidden;
	}

	public ExameDAO getExameDao() {
		return exameDao;
	}

	public void setExameDao(ExameDAO exameDao) {
		this.exameDao = exameDao;
	}

	public String getTipoRequisicao() {
		return tipoRequisicao;
	}

	public void setTipoRequisicao(String tipoRequisicao) {
		this.tipoRequisicao = tipoRequisicao;
	}

}
