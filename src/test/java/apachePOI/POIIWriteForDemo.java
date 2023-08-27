package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIIWriteForDemo {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheetOne=workbook.createSheet("sheetOne");
		Object[][] data={{"Fruit","Color","Count"},
				         {"Apple","Red",10},       
				         {"Banana","Yellow",12},
				         {"Orange","Orange",12}};
		int rows=data.length;
		int cells=data[0].length;
		System.out.println(rows);
		System.out.println(cells);
		for(int r=0;r<rows;r++) {
			XSSFRow row=sheetOne.createRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell cell = row.createCell(c);
			    Object celldata=data[r][c];
			    if(celldata instanceof String) {
			    	cell.setCellValue((String)celldata);
			    }
			    else if(celldata instanceof Integer) {
			    	cell.setCellValue((Integer)celldata);
			    }
			    
			    else if(celldata instanceof Boolean) {
			    	cell.setCellValue((Boolean)celldata);
			    }
			}
			
		}
		File file= new File("C:\\Users\\v-gujjavani\\OneDrive - Microsoft\\Documents\\Course P\\basic\\files\\employees.xlsx"
);
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		
	}
}
