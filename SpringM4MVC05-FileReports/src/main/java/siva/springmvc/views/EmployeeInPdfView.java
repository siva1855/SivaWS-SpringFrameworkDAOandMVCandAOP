package siva.springmvc.views;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import siva.springmvc.model.Employee;

@Component("pdf")
public class EmployeeInPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Employee> empList = (List<Employee>) model.get("employees");
		Paragraph paragraph = new Paragraph();
		paragraph.add("The below are the details of employees in Database");
		paragraph.setAlignment("center");
		Table table = new Table(4);
		table.addCell("EMPNO");
		table.addCell("ENAME");
		table.addCell("SAL");
		table.addCell("DEPTNO");
		for (Employee e : empList) {
			table.addCell(e.getEmpno() + "");
			table.addCell(e.getEname());
			table.addCell(e.getSal() + "");
			table.addCell(e.getDeptno() + "");
		}
		table.setAlignment("center");
		document.add(paragraph);
		document.add(table);
	}
}
