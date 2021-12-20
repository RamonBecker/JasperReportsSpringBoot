package com.mballern.jasper.jdbc.service;

import java.io.InputStream;
import java.sql.Connection;
import java.util.LinkedHashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class JasperService {

	private Map<String, Object> params = new LinkedHashMap<>();

	public void addParams(String key, Object value) {
		this.params.put(key, value);
	}
	
	public void abrirJasperViewr(String jrxml, Connection connection) {
		JasperReport report = compilarJrxml(jrxml);
		try {
			JasperPrint print = JasperFillManager.fillReport(report, this.params, connection);
			JasperViewer viewer = new JasperViewer(print);
			viewer.setVisible(true);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private JasperReport compilarJrxml(String arquivo) {

		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(arquivo);
			return JasperCompileManager.compileReport(is);
		} catch (JRException e) {
			e.printStackTrace();
		}
		return null;

	}

}
