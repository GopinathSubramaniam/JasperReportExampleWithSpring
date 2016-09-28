package com.jasper.util;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jasper.model.City;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Component
public class PDFService {

	
	public void generateReport(List<City> cities){
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		
		try {
			jasperReport = JasperCompileManager.compileReport("src/main/resources/static/jasper/report.jrxml");
			PDFGenerator<City> dataSource = new PDFGenerator<City>().initBy(cities);
			jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), dataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint, "src/main/resources/static/jasper/report.pdf");
		} catch (JRException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
