
package com.mballem.curso.jasper.spring.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class JasperService {

	private static final String JASPER_DIRETORIO = "classpath:jasper/";
	private static final String JASPER_PREFIXO = "funcionarios-";
	private static final String JASPER_SULFIXO = ".jasper";

	@Autowired
	private Connection connection;

	private Map<String, Object> params = new HashMap<String, Object>();

	public JasperService() {
		params.put("IMAGEM_DIRETORIO", JASPER_DIRETORIO);
	}

	public void addParams(String key, Object value) {
		params.put(key, value);
	}

	public byte[] exportarPDF(String code) {
		byte[] bytes = null;
		String arq = JASPER_DIRETORIO.concat(JASPER_PREFIXO).concat(code).concat(JASPER_SULFIXO);
		try {
			File file = ResourceUtils.getFile(arq);
			JasperPrint print = JasperFillManager.fillReport(file.getAbsolutePath(), params, connection);
			bytes = JasperExportManager.exportReportToPdf(print);
		} catch (FileNotFoundException | JRException e) {
			e.printStackTrace();
		}

		return bytes;
	}
}
