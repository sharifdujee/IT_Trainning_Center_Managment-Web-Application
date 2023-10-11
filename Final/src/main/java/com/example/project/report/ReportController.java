//package com.example.project.report;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.management.JMRuntimeException;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//
//
//@Controller
//public class ReportController {
//    ReportDA rd = new ReportDA();
//
//    @GetMapping(value = "/paymentall", produces = MediaType.APPLICATION_PDF_VALUE)
//    public ResponseEntity<byte[]> allPayment() {
//        try {
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rd.PaymentReport(), false);
//            Map<String, Object> param = new HashMap<>();
//            JasperReport compileReport = JasperCompileManager
//                    .compileReport(new FileInputStream("src/main/resources/templates/Simple_Blue.jrxml"));
//            jasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, param, dataSource);
//            byte[] data = JasperExportManager.exportReportToPdf(jasperPrint);
//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");
//            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
//        } catch (FileNotFoundException | JMRuntimeException e) {
//            e.printStackTrace(); // Print the exception for debugging
//        }
//        return null;
//    }
//}
