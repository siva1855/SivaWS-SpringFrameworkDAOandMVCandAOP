package siva.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import siva.springmvc.dao.EmployeeDao;
import siva.springmvc.model.Employee;

@Controller
public class ReportController {
	@Autowired
	private EmployeeDao employeeDao;
	@GetMapping("/reports")
	public   String  getReportPage() {
		return  "reports";
	}
	
	
	@GetMapping("/pdfReport")
	public  String  pdfHandler(Model  model) {
		List<Employee>  empList=employeeDao.getAllEmployees();
		model.addAttribute("employees", empList);
		return  "pdf";
	}
	
	
	@GetMapping("/excelReport")
	public  String  excelHandler(Model  model) {
		List<Employee>  empList=employeeDao.getAllEmployees();
		model.addAttribute("employees", empList);
		return  "excel";
	}
	
}
