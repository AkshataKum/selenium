package pageobjectmodel;

import java.util.Properties;

public class Flib {

	public static void main(String[] args) {
		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount)
		
		FileInputStream fis = new FileInputStrim(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheeName);
		Row row = sh.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
		
		//the rowcount
		public int getRowCount(String excelPath,String sheetName) 
		
		
		FileInputStream fis = new FileInputStrim(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheeName);
		int rc  = sh.getLastRowNum();
		return rc;
		
		//the data in excel file
		
		public void writeExcelData(Sting excelPath,String sheetName,int rowCount,int cellCount,String data)
		
		FileInputStream fis = new FileInputStrim(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheeName);
		Row row = sh.getrow(rowCount);
		cell cell = row.createCell(cellCount);
		
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(exclPath);
		wb.write(fos);
		
		
		//generic reusable method to read the property file
		
		public String readPropertyFile(String propPath,String key)
		
		
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
