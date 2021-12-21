package com.mballern.jasper.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

import com.mballern.jasper.jdbc.service.JasperService;
import com.mballern.jasper.jdbc.util.JdbcConnection;

public class Main {
	public static void main(String[] args) throws SQLException {

		// abrirJrxml("18");

		exportarPDF("18", "C:\\Users\\ramon\\Documents\\GitHub\\JasperReportsSpringBoot\\demo-jdbc\\RelatoriosExportados\\" + "jasper-" + UUID.randomUUID() + ".pdf");
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
		// service.addParams("NIVEL_DESC", "JUNIOR");
		// service.addParams("UF", "PR");
		service.abrirJasperViewr(path, connection);
		connection.close();
	}
}
