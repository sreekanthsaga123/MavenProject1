package ExcelSelenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilies {

	public static 	String projectPath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public ExcelUtilies(String workBook,String sheetName) throws IOException {
		
		workbook=new XSSFWorkbook(workBook);
		sheet=workbook.getSheet(sheetName);
		
	}
	public static void main(String[] args) throws IOException {
		getRowCount();
		//getCellData(0,1);
		//getCellDataNumeric(1,1);
		getColCount();
	}

	public static int getRowCount() throws IOException {
		int rowcount=0;
		try {
			
			 rowcount=sheet.getPhysicalNumberOfRows();

			System.out.println("No of rows :"+rowcount);

		}catch(Exception e){
			e.getMessage();
		}
		return rowcount;
	}
	public static int getColCount() throws IOException {
		int colcount=0;
		try {
			
			colcount=sheet.getRow(0).getPhysicalNumberOfCells();

			System.out.println("No of cols :"+colcount);

		}catch(Exception e){
			e.getMessage();
		}
		return colcount;
	}
	public static String getCellData(int rowNum,int colNum) throws IOException {
		
		//String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		String cellData1=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		//System.out.println(cellData1);
		return cellData1;
	}

	public static void getCellDataNumeric(int rowNum,int colNum) throws IOException {
		
		double cellData1=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println(cellData1);
	}
	

}
