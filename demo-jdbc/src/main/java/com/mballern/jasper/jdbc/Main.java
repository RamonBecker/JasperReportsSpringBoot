package com.mballern.jasper.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mballern.jasper.jdbc.service.JasperService;
import com.mballern.jasper.jdbc.util.JdbcConnection;

public class Main {
	public static void main(String[] args) {
		try {
			abrirJrxml("18");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void abrirJrxml(String numero) throws SQLException {
	
		Connection connection = JdbcConnection.connection();
		
		JasperService service = new JasperService();
		String path = "relatorios/jrxml/funcionarios-"+numero+".jrxml";
		//service.addParams("NIVEL_DESC", "JUNIOR");
		//service.addParams("UF", "PR");
		service.abrirJasperViewr(path, connection);
		connection.close();
	}
}
