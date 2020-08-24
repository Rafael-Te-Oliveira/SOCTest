package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Exame;

public class ExameDAO {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/soctest?useTimezone=true&serverTimezone=UTC", "root", "Navio.333");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Exame> listaExames() {
		ResultSet rs = null;
		Exame exame = null;
		List<Exame> exames = new ArrayList<Exame>();
		try {
			String sql = "SELECT NOMEPACIENTE,LOCAL,NOMEMEDICO,DATA,DIAGNOSTICO FROM EXAMES";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					exame = new Exame();
					exame.setNomePaciente(rs.getString("NOMEPACIENTE"));
					exame.setLocal(rs.getString("LOCAL"));
					exame.setNomeMedico(rs.getString("NOMEMEDICO"));
					exame.setData(rs.getString("DATA"));
					exame.setDiagnostico(rs.getString("DIAGNOSTICO"));
					exames.add(exame);
				}
				return exames;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void adicionaExame(String nomePaciente, String local, String nomeMedico, String data, String diagnostico) {
		try {
			String sql = "INSERT INTO EXAMES VALUES (?,?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, nomePaciente);
			ps.setString(2, local);
			ps.setString(3, nomeMedico);
			ps.setString(4, data);
			ps.setString(5, diagnostico);
			ps.executeUpdate();
			getConnection().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Exame retornaExame(String nomePaciente) {
		ResultSet rs = null;
		Exame exame = null;
		try {
			String sql = "SELECT NOMEPACIENTE,LOCAL,NOMEMEDICO,DATA,DIAGNOSTICO FROM EXAMES WHERE NOMEPACIENTE=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, nomePaciente);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					exame = new Exame();
					exame.setNomePaciente(rs.getString("NOMEPACIENTE"));
					exame.setLocal(rs.getString("LOCAL"));
					exame.setNomeMedico(rs.getString("NOMEMEDICO"));
					exame.setData(rs.getString("DATA"));
					exame.setDiagnostico(rs.getString("DIAGNOSTICO"));
					return exame;
				}
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ResultSet encontraExame(String nomePaciente) {
		ResultSet rs = null;
		try {
			String sql = "SELECT NOMEPACIENTE,LOCAL,NOMEMEDICO,DATA,DIAGNOSTICO FROM EXAMES WHERE NOMEPACIENTE=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, nomePaciente);
			rs = ps.executeQuery();
			getConnection().close();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void atualizaExame(String nomePaciente, String local, String nomeMedico, String data, String diagnostico,
			String nomePacienteHidden) throws SQLException {
		try {
			String sql = "UPDATE EXAMES SET NOMEPACIENTE =?, LOCAL=?,NOMEMEDICO=?,DATA=?,DIAGNOSTICO=? WHERE NOMEPACIENTE=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, nomePaciente);
			ps.setString(2, local);
			ps.setString(3, nomeMedico);
			ps.setString(4, data);
			ps.setString(5, diagnostico);
			ps.setString(6, nomePacienteHidden);
			ps.executeUpdate();
			getConnection().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletaExame(String nomePaciente) {
		try {
			String sql = "DELETE FROM EXAMES WHERE NOMEPACIENTE=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, nomePaciente);
			ps.executeUpdate();
			getConnection().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}