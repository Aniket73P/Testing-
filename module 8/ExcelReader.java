package Assignment.Junit_2;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String filepath;
	String sheetname;
	
	public ExcelReader (String filepath,String sheetname) {
		super();
		this.filepath=filepath;
		this.sheetname=sheetname;
	}
	public int rowCount() {
		int i=0;
		try {
			XSSFWorkbook workbook =new XSSFWorkbook(filepath);
			XSSFSheet worSheet=workbook.getSheet(sheetname);
			i=worSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  i;
	}
	
	public int colCount() {
		int i=0;
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			XSSFSheet worksSheet=workbook.getSheet(sheetname);
			i=worksSheet.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
		
	}
	public String getData(int row, int col) {
		String  data=null;
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			XSSFSheet worksSheet=workbook.getSheet(sheetname);
			data=worksSheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
