package com.infosys.insert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class InsertService {
	
	 
	public int insertDataToExcel(InsertBean insBean)
	
	{
	System.out.println("inside service");
		
	
    
	Path path = Paths.get("D://logger//CaseLogger.xls");

	if (Files.exists(path)) {
	  System.out.println("file exist");
	  
	  
	  try {
		  FileInputStream file = new FileInputStream(new File("D://logger//CaseLogger.xls"));
		  
		  XSSFWorkbook workbookRead = new XSSFWorkbook(file);
		  XSSFSheet sheet = workbookRead.getSheetAt(0);
		  
		  int lastRow=sheet.getPhysicalNumberOfRows();
		  
		  
		  System.out.println("after count"+lastRow);
		  
		  
		  
		  System.out.println(lastRow);
		  
		  
		  
		  
		  Row row = sheet.createRow(lastRow);
		  row.createCell(0).setCellValue(insBean.getIncidentNumber());
		  row.createCell(1).setCellValue(insBean.getUserName());
		  row.createCell(2).setCellValue(insBean.getLoggedDate());
		  row.createCell(3).setCellValue(insBean.getUrgency());
		  row.createCell(4).setCellValue(insBean.getCategory());
		  row.createCell(5).setCellValue(insBean.getAssignedGroup());
		  row.createCell(6).setCellValue(insBean.getIssueDesc());
		  row.createCell(7).setCellValue(insBean.getActionTaken());
		  row.createCell(8).setCellValue(insBean.getRoutedTo());
		  row.createCell(9).setCellValue(insBean.getRouteReason());
		  
		  FileOutputStream fileOut;
			try {
				fileOut = new FileOutputStream("D://logger//CaseLogger.xls");
				workbookRead.write(fileOut);
				workbookRead.close();
			    fileOut.close();
			    workbookRead.close();
				  file.close();
				
				
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		
	  		
	  } 
	  
	  catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
	  
	}
	else
	{
		System.out.println("doesnt exist");
	
		XSSFWorkbook workbook = new XSSFWorkbook();
	
//	CreationHelper createHelper = workbook.getCreationHelper();
    Sheet sheet = workbook.createSheet("Case Data");
    //Create a blank sheet
//    XSSFSheet sheet = workbook.createSheet("Case Data");
      
//    Map<Integer, String> caseData= new TreeMap<Integer, String>();
    
    Row row = sheet.createRow((short)0);
    // Create a cell and put a value in it.
    row.createCell(0).setCellValue("Incident Number");
    row.createCell(1).setCellValue("Name");
    row.createCell(2).setCellValue("Date");
    row.createCell(3).setCellValue("Priority");
    row.createCell(4).setCellValue("Category");
    row.createCell(5).setCellValue("Assigned Work");
    row.createCell(6).setCellValue("Issue Description");
    row.createCell(7).setCellValue("Action Taken");
    row.createCell(8).setCellValue("Routed To");
    row.createCell(9).setCellValue("Reason");
    

    FileOutputStream fileOut;
	try {
		fileOut = new FileOutputStream("D://logger//CaseLogger.xls");
		workbook.write(fileOut);
		workbook.close();
	    fileOut.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}
    
	return 0;
    
    
	}
	
	    
	    


}


