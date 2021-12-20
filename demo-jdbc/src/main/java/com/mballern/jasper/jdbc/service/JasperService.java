package com.mballern.jasper.jdbc.service;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

public class JasperService {

	private Map<String, Object> params = new LinkedHashMap<>();

	public void addParams(String key, Object value) {
		this.params.put(key, value);
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
