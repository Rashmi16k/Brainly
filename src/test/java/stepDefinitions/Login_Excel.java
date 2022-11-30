package stepDefinitions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login_Excel {
	


		  public Workbook workbook;
		  public static File filePath=new File("./TestData/Book1.xlsx");
		  
		  public  String getData(String sheet, int row, int column) throws EncryptedDocumentException, IOException {
			  FileInputStream fis=new FileInputStream(filePath);
			  workbook=WorkbookFactory.create(fis);
			  Cell cell=workbook.getSheet(sheet).getRow(row).getCell(column);
			  return cell.getStringCellValue();
		  }
					
			

			public static Object[][] getMultipleData(String sheetName) throws IOException {
				// TODO Auto-generated method stub

                             
				FileInputStream fis=new FileInputStream(filePath);		
			    Workbook book=new XSSFWorkbook(fis);			     
				Sheet sheet=book.getSheet(sheetName);
				
				int row_count=sheet.getPhysicalNumberOfRows();
				int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
				Object data[][]=new Object[row_count][col_count];
				for(int r=0; r<row_count; r++) {
					Row row=sheet.getRow(r);
					for(int c=0; c<col_count; c++) {
						data[r][c]=row.getCell(c).getStringCellValue();
					}
				}
				/*for(int i=0; i<row_count; i++) {
					for(int j=0; j<col_count; j++) {
						System.out.println(data[i][j]);
					}
				}*/
				book.close();
				return data;
				
			}



			
	}


