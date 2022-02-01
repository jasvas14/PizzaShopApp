
public class Cashier extends Employee {

	private double tips;
	private static String jobTitle = "Cashier";

	// DEFAULT CONSTRUCTOR
	public Cashier() {
		tips = 0.0;
	}

	public Cashier(String name, double salary) {
		this.employeeName = name;
		this.employeeSalary = salary;
	}

	// PRINT CASHIER INFO
	@Override
	public void print() {
		super.print();
		System.out.println("Tips: $" + tips);
		System.out.println("Job Title: " + jobTitle);
	}

	// ACCESSORS AND MUTATORS
	public void setTips(double t) {
		tips = t;
	}

	public double getTips() {
		return tips;
	}

	public String getJobTitle() {
		return jobTitle;
	}

}
