package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class PassDataPOITestNG {

	@DataProvider(name = "supplier")
	public Object[][] datasupplier() {
		
		String excelFilePath = "C:\\Users\\v-gujjavani\\OneDrive - Microsoft\\Documents\\Course P\\basic\\files\\tutorialsninja.xlsx";
		
		File excelfile = new File(excelFilePath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount-1][colcount];
		
		
		for(int r=0;r<rowcount-1;r++) {
          XSSFRow row = sheet.getRow(r+1);
			for(int c=0;c<colcount;c++) {
				XSSFCell cell = row.getCell(c);
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
					data[r][c] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[r][c] = (int)cell.getNumericCellValue();
					break;
				case BOOLEAN:
					data[r][c] = cell.getBooleanCellValue();
					break;
				}
			}
			
		}
	return data;
	}
}
