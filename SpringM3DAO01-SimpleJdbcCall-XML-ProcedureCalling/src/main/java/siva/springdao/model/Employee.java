package siva.springdao.model;

public class Employee {
	// Employee fields
	private int employeeId;
	private String employeeName;
	private String email;
	private double salary;
	private String gender;

	// non-parameterized constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int employeeId, String employeeName, String email, double salary, String gender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
		this.gender = gender;
	}

	// getter and setter methods
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + ", gender=" + gender + "]";
	}

}
