
public class Employee {

	protected int employeeID;
	protected String employeeName;
	protected String employeeEmail;
	protected double employeeSalary;
	protected static int employeeCount = 0;

	// DEFAULT CONSTRUCTOR
	public Employee() {
		employeeCount++;
		employeeID = employeeCount;
		employeeName = "TBD";
		employeeEmail = "NO EMAIL";
		employeeSalary = 0.0;
	}

	// CONSTRUCTOR NAME AND SALARY
	public Employee(String employeeName, double employeeSalary) {
		employeeCount++;
		employeeID = employeeCount;
		this.employeeName = employeeName;
		employeeEmail = "NO EMAIL";
		this.employeeSalary = employeeSalary;

	}

	// PRINT ALL EMPLOYEE ATTRIBUTES
	public void print() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Email: " + employeeEmail);
		System.out.println("Employee Salary: " + employeeSalary);
		System.out.println("Employee Count: " + employeeCount);
	}

	// ACCESSORS AND MUTATORS
	// EMPLOYEE ID
	public void setEmployeeID(int ID) {
		employeeID = ID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	// EMPLOYEE NAME
	public void setEmployeeName(String name) {
		employeeName = name;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	// EMPLOYEE EMAIL
	public void setEmployeeEmail(String email) {
		employeeEmail = email;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	// EMPLOYEE SALARY
	public void setEmployeeSalary(double salary) {
		employeeSalary = salary;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	// EMPLOYEE COUNT
	public int getEmployeeCount() {
		return employeeCount;
	}
}
