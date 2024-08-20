package ExcelSelenium;

import java.io.IOException;

public class ExcelUtiliesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath=System.getProperty("user.dir");
ExcelUtilies excel=new ExcelUtilies(projectPath+"\\Excel\\Data.xlsx", "Sheet1");
excel.getRowCount();
excel.getCellData(0, 0);




	}

}
