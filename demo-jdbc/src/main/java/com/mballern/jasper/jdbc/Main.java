package com.mballern.jasper.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

import com.mballern.jasper.jdbc.service.JasperService;
import com.mballern.jasper.jdbc.util.JdbcConnection;

public class Main {
	public static void main(String[] args) throws SQLException {

		// abrirJrxml("18");

		// exportarPDF("18", "RelatoriosExportados\\" + "jasper-" + UUID.randomUUID() +
		// ".pdf");
		// abrirPontoJasper("09");
		// abrirPontoJasperComSubRelatorio("10");
		abrirJrxmlComSubRelatorios("10");
	}

	private static void abrirJrxmlComSubRelatorios(String numero) throws SQLException {
		Connection connection = JdbcConnection.connection();
		JasperService service = new JasperService();
		String pathMaster = "relatorios/jrxml/funcionarios-" + numero + ".jrxml";
		String pathSub = "relatorios/jrxml/funcionarios-" + numero + "-subfones.jrxml";
		service.abrirJrxmlComSubReport(pathMaster, pathSub, connection);
		connection.close();
	}

	private static void abrirPontoJasper(String numero) throws SQLException {
		Connection connection = JdbcConnection.connection();
		JasperService service = new JasperService();
		String path = "relatorios/jasper/funcionarios-" + numero + ".jasper";
		service.addParams("UF", "RJ");
		service.abrirPontoJasper(path, connection);
		connection.close();

	}

	private static void abrirPontoJasperComSubRelatorio(String numero) throws SQLException {
		Connection connection = JdbcConnection.connection();
		JasperService service = new JasperService();
		String path = "relatorios/jasper/funcionarios-" + numero + ".jasper";
		service.addParams("SUB_REPORT_DIR", "relatorios/jasper/");
		service.abrirPontoJasper(path, connection);
		connection.close();

	}

	private static void exportarPDF(String numero, String saida) throws SQLException {
		Connection connection = JdbcConnection.connection();

		JasperService service = new JasperService();
		String path = "relatorios/jrxml/funcionarios-" + numero + ".jrxml";
		service.exportarPDF(path, connection, saida);
		connection.close();
	}

	private static void abrirJrxml(String numero) throws SQLException {
		Connection connection = JdbcConnection.connection();
		JasperService service = new JasperService();
		String path = "relatorios/jrxml/funcionarios-" + numero + ".jrxml";
		service.abrirJasperViewr(path, connection);
		connection.close();
	}
}
