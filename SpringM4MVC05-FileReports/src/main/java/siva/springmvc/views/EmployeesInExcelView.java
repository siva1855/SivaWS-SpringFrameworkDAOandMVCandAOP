package siva.springmvc.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import siva.springmvc.model.Employee;


@Component("excel")
public class EmployeesInExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Employee>  empList=(List<Employee>)model.get("employees");
		
		Sheet  sheet=workbook.createSheet("employees sheet");
		
		Row  row1=sheet.createRow(0);
		Cell  cell1=row1.createCell(0);
		cell1.setCellValue("EMPNO");
		
		Cell  cell2=row1.createCell(1);
		cell2.setCellValue("ENAME");
		
		Cell  cell3=row1.createCell(2);
		cell3.setCellValue("SAL");
		
		Cell  cell4=row1.createCell(3);
		cell4.setCellValue("DEPTNO");
		
		int rowIndex=1;
		for(Employee  e : empList) {
			Row  row = sheet.createRow(rowIndex);
			Cell  c1 = row.createCell(0);
			c1.setCellValue(e.getEmpno()+"");
			Cell  c2 = row.createCell(1);
			c2.setCellValue(e.getEname());
			Cell  c3 = row.createCell(2);
			c3.setCellValue(e.getSal()+"");
			Cell  c4 = row.createCell(3);
			c4.setCellValue(e.getDeptno()+"");
			rowIndex++;
		}
	}

}
