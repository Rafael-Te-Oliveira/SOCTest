package webService;

import javax.jws.WebService;

import dao.ExameDAO;
import model.Exame;

@WebService
public class ConsultaExameWS {

	ExameDAO exameDao = new ExameDAO();

	public Exame consultaExame(String nomePaciente){
		return exameDao.retornaExame(nomePaciente);
	}
}
