package siva.springdao.model;

public class Employee {

	private int employeeNo;
	private String employeeName;
	private int employeeSalary;
	private int employeeDeptno;

	public Employee(int employeeNo, String employeeName, int employeeSalary, int employeeDeptno) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDeptno = employeeDeptno;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeDeptno() {
		return employeeDeptno;
	}

	public void setEmployeeDeptno(int employeeDeptno) {
		this.employeeDeptno = employeeDeptno;
	}

	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDeptno=" + employeeDeptno + "]";
	}

}
