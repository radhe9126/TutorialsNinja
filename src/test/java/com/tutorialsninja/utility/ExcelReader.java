package com.tutorialsninja.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private static Workbook workbook;
	private static final String EXCEL_PATH = "./TestData/testData.xlsx";

	public static String getCellData(String sheetName, int rowNum, int columnNum) {
		String cellValue = "";
		try {
			FileInputStream fis = new FileInputStream(EXCEL_PATH);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.createSheet(sheetName);
			if (sheet != null) {
				Row row = sheet.createRow(rowNum);
				if (row != null) {
					Cell cell = row.createCell(columnNum);
					if (cell != null) {
						cellValue = formattedCellValue(cell);
					}
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return cellValue;

	}

	public static String formattedCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();

		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BLANK:
			return "";
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		default:
			return "unknown cell type";
		}
	}
}
