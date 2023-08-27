package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIForReadDemo1 {
	public static void main(String[] args) throws IOException {
		String excelFilePath = 
				"C:\\Users\\v-gujjavani\\OneDrive - Microsoft\\Documents\\Course P\\basic\\files\\employees.xlsx";

		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		XSSFSheet sheet=workbook.getSheet("sheetOne");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rows;i++) {
          XSSFRow row = sheet.getRow(i);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+" ");
					break;
				}
			}
			System.out.println();
		}
		workbook.close();
	}
}
