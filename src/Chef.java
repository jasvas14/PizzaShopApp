
public class Chef extends Employee {

	private int skillLevel;
	private static String jobTitle = "Chef";

	// DEFAULT CONSTRUCTOR
	public Chef() {
		skillLevel = 0;
	}

	// CONSTRUCTOR NAME AND SALARY
	public Chef(String employeeName, double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		skillLevel = 0;
	}

	// PRINT CHEF INFO
	@Override
	public void print() {
		super.print();
		System.out.println("Skill Level: " + skillLevel);
		System.out.println("Job Title: " + jobTitle);
	}

	// ACCESSORS AND MUTATORS
	public void setSkillLevel(int skill) {
		skillLevel = skill;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void givePromotion() {
		if (skillLevel >= 5) {
			return;
		}
		this.skillLevel++;
		employeeSalary = employeeSalary + 125.0;
		System.out.println("PROMOTED!");
	}

	public String getJobTitle() {
		return jobTitle;
	}

}
