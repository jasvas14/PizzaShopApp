import java.util.HashSet;

public class CustomOrder extends Order {

	private int customOrderID;
	private double totalCost;
	private HashSet<String> specialToppings;

	public CustomOrder(int n, String specialToppings, String timeOrdered) {
	}

	// Overloading method

	public void addToppings(String st1, String st2, String st3) {
		specialToppings.add(st1);
		specialToppings.add(st2);
		specialToppings.add(st3);
	}

	public void addToppings(String st1, String st2) {
		specialToppings.add(st1);
		specialToppings.add(st2);
	}

	public void addToppings(String st1) {
		specialToppings.add(st1);
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public void printCost() {
		System.out.println(specialToppings);

	}
}
