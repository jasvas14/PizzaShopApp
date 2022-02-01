
public class Order {

	// protected
	protected int orderID;
	protected int numberOfPizzas;
	protected String pizzaType;
	protected String timeOrdered;
	protected double baseCost;
	protected double inventoryCost;
	protected boolean deliveryRequested;

	// Default Constructor
	public Order() {
		orderID = 00;
		numberOfPizzas = 1;
		pizzaType = "Cheese";
		timeOrdered = "HH:MM, AM/PM";
		baseCost = 8.0;
		inventoryCost = 5.0;
		deliveryRequested = false;
	}

	public Order(int orderID, int numPizzas, String type, String timeOrdered, double baseCost, double inventoryCost,
			boolean dr) {
		this.orderID = orderID;
		numberOfPizzas = numPizzas;
		pizzaType = type;
		this.timeOrdered = timeOrdered;
		this.baseCost = baseCost;
		this.inventoryCost = inventoryCost;
		this.deliveryRequested = dr;

	}

	public int getNumberOfPizzas() {
		return numberOfPizzas;
	}

	public void setNumberOfPizzas(int numberOfPizzas) {
		this.numberOfPizzas = numberOfPizzas;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getTimeOrdered() {
		return timeOrdered;
	}

	public void setTimeOrdered(String timeOrdered) {
		this.timeOrdered = timeOrdered;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public double getInventoryCost() {
		return inventoryCost;
	}

	public void setInventoryCost(double inventoryCost) {
		this.inventoryCost = inventoryCost;
	}

	public boolean getDeliveryRequested() {
		return deliveryRequested;
	}

	public void setDeliveryRequested(boolean dr) {
		this.deliveryRequested = dr;
	}

	public void printReceipt(Order b) {
		System.out.println("OrderID: " + b.getOrderID());
		System.out.println("Type: " + b.getPizzaType());
		System.out.println("Number of Pizzas: " + b.getNumberOfPizzas());
		System.out.println("Time Ordered: " + b.getTimeOrdered());
		System.out.println("Base Cost: $" + b.getBaseCost());
		System.out.println("Inventory Cost: $" + b.getInventoryCost());

		double dc;
		if (b.getDeliveryRequested()) {
			dc = 3.0;
		} else
			dc = 0.0;
		System.out.println("Delivery Cost: $" + dc);

	}

	public void checkOrderTime(Order b) {
		String partOfDay = b.getTimeOrdered().substring(7, 9);
		String hour = b.getTimeOrdered().substring(0, 2);
		System.out.println(partOfDay + "Hour: " + hour);

		if (partOfDay.equals("AM")) {
			System.out.println("The Pizza Shop does not open until Noon. Please order again then.");
		} else if (partOfDay.equals("PM") && (hour.compareTo("11") >= 0)) {
			System.out.println("The Pizza Shop closes at 11PM. Please stop by tomorrow from Noon - 11PM!");
		} else {
			System.out.println("Order Time is within operating hours.");
		}
	}

}
