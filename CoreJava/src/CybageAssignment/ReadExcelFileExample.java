package CybageAssignment;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileExample {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\MyData\\MyWorkspace\\CoreJava\\src\\CybageAssignment\\ReadExcel.xlsx"); 
			FileInputStream fis = new FileInputStream(file); 
			Hashtable<Integer,  List<HashMap<String,String>>> ht1 = new Hashtable<>();
			
			ArrayList<String> columnNames = new ArrayList<String>();
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); 
			Iterator<Row> itr = sheet.iterator();
			int index = 0;
			
			while (itr.hasNext()) {
				List<HashMap<String,String>> myMap = new ArrayList<HashMap<String,String>>();
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int cell_index = 0;
				HashMap<String,String> column_value_map = new HashMap<String, String>();
				while (cellIterator.hasNext()) {
					
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						
						if (index == 0)
						{
							columnNames.add(cell.getStringCellValue());
						}
						else {
							column_value_map.put(columnNames.get(cell_index), cell.getStringCellValue());
						}
					//	System.out.print(cell.getStringCellValue() + "\t\t\t");
						break;
					default:
					}
					
					cell_index = cell_index + 1;
					
				}
				if (index > 0)
				{
					myMap.add(column_value_map);
					
					ht1.put(index -1, myMap);
				}
				index = index + 1;
				
			}
			System.out.println(ht1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}