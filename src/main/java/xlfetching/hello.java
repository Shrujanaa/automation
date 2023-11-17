package xlfetching;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class hello {
	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\srujana\\eclipse-workspace\\Srujna_selenium\\Pathsave\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
