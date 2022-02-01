import java.util.HashMap;
import java.util.HashSet;

public class PizzaShop {

	// CUSTOMER
	private HashMap<Integer, Customer> customerDatabase;

	public PizzaShop() {
		customerDatabase = new HashMap<Integer, Customer>();
		employeeDatabase = new HashMap<Integer, Employee>();
	}

	public void addCustomer(Customer c) {
		customerDatabase.put(c.getCustomerID(), c);
	}

	public HashMap<Integer, Customer> getCustomerDatabase() {
		return customerDatabase;
	}

	// EMPLOYEE
	private HashMap<Integer, Employee> employeeDatabase;

	public void addEmployee(Employee e) {
		employeeDatabase.put(e.getEmployeeID(), e);
	}

	public HashMap<Integer, Employee> getEmployeeDatabase() {
		return employeeDatabase;
	}

	// PRINT DATABASES
	public void print() {
		System.out.println(employeeDatabase.keySet());
		System.out.println(customerDatabase.keySet());
	}

}
