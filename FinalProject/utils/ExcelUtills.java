package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtills {
	private static HSSFWorkbook excel;
	private static HSSFSheet sheet;
	private static HSSFCell cell;
	private static DataFormatter formatter;

	// Method for setting excel file
	public static void setExcelFile(String path, String str) throws IOException {
		try {
			FileInputStream file = new FileInputStream(path);
			excel = new HSSFWorkbook(file);
			sheet = excel.getSheet(str);
			formatter = new DataFormatter();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Method for getting cell data from specific cell (by entering row number and
	// column number)
	public static String getCell(int row, int col) {
		cell = sheet.getRow(row).getCell(col);
		String CellData = formatter.formatCellValue(cell);

		return CellData;
	}

	// Method for getting work sheet
	public static HSSFSheet getWSheet() {
		return sheet;
	}

}
