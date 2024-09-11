package com.ShopperStack_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	         //File_Utility2
	
	 public String  readPropertyData(String key) throws IOException {
	    	FileInputStream fis = new FileInputStream(FrameWorkConstants.propertyFilePath);
	    	                                           
	    	Properties prop = new Properties();          
	    	prop.load(fis);
	    	String value = prop.getProperty(key);
	    	return value;
	    	
	    }
	    
	    public String readExcelData(String SheetName,int rownum , int cellNum) throws EncryptedDocumentException, IOException {
	    	FileInputStream fis = new FileInputStream(FrameWorkConstants.excelFilePath);
	    	Workbook wb = WorkbookFactory.create(fis);
	    	 String value=wb.getSheet(SheetName).getRow(rownum).getCell(cellNum).getStringCellValue();
	    	 return value;
	    	
	    }

}
