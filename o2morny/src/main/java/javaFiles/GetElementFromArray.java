package javaFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetElementFromArray {

	String[] s1 = new String[28];
	Paths path = new Paths();

	public String[] Read_excel () throws IOException {
		
		int temp=0 ;
		
	FileInputStream inputStream = new FileInputStream(new File(path.ExcelFilePath));
	Workbook workbook = new XSSFWorkbook(inputStream);
    Sheet firstSheet = workbook.getSheetAt(0);
    Iterator<Row> iterator = firstSheet.iterator();
     
    while (iterator.hasNext()) {
        Row nextRow = iterator.next();
        Iterator<Cell> cellIterator = nextRow.cellIterator();
        
       for ( int j = temp ; j<28; j++) {
       	if (cellIterator.hasNext()) {
          Cell cell = cellIterator.next();
          temp = j;
          s1[temp] = cell.getStringCellValue();
    		temp++;
       	}
       }
    inputStream.close();
	}
    
    
    return s1 ; 

	}

	
	public String Get(String[] s2, String[] s3, String Text) {
		String z="" ;
	    for (int k=0; k<s2.length; k++) {
	        if (s2[k].equals(Text)) {
	        	z = s3[k] ;
	        	}
	        }
		
	return z ;
	}
	

    
}
