package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIIteratorReadDemo2 {

	public static void main(String[] args) throws IOException {
		String excelFilePath="C:\\Users\\v-gujjavani\\OneDrive - Microsoft\\Documents\\Course P\\basic\\files\\employees.xlsx";


		File excel = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);	
		XSSFSheet sheet = workbook.getSheet("One");
        Iterator<Row> itrRow = sheet.iterator();
        while(itrRow.hasNext()) {
        	Row row=itrRow.next();
        	Iterator<Cell> itrCell = row.iterator();
        	while(itrCell.hasNext()) {
        		Cell cell=itrCell.next();
        		CellType cellType=cell.getCellType();
        		switch(cellType) {
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
		
	}
}
