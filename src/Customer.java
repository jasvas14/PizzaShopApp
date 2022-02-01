import java.util.ArrayList;

public class Customer {

	private ArrayList<Order> orderDatabase; // orderDatabase = new ArrayList<Order>();

	private int customerID;
	private static int count = 100;
	private String customerName;
	private long phoneNumber; // long
	private String emailAddress;
	private String paymentType;
	private String hasRewards;
	private int rewardPoints;
	private String rewardAvailability;
	final int rewardPointsPerOrder = 10;

	public Customer() {
		orderDatabase = new ArrayList<Order>();
		customerID = count;
		customerName = "TBD";
		phoneNumber = -10000000;
		emailAddress = "TBD";
		paymentType = "TBD";
		hasRewards = "TBD";
		rewardPoints = -1;
		rewardAvailability = "TBD";
		count++;
	}

	public ArrayList<Order> getOrderDatabase() {
		return orderDatabase;
	}

	public Customer(String n, long p, String e, String pt, String hr, int rp, String ra) {
		orderDatabase = new ArrayList<Order>();
		customerID = count;
		customerName = n;
		phoneNumber = p;
		emailAddress = e;
		paymentType = pt;
		hasRewards = hr;
		rewardPoints = rp;
		rewardAvailability = ra;
		count++;
	}

	public void print() {
		System.out.println("Customer ID: " + customerID);
		System.out.println("Name: " + customerName);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email Address: " + emailAddress);
		System.out.println("Payment Type: " + paymentType);
		System.out.println("Are you a member of our rewards program?: " + hasRewards);
		System.out.println("Reward Points: " + rewardPoints);
		System.out.println("Reward Availability: " + rewardAvailability);

	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getHasRewards() {
		return hasRewards;
	}

	public void setHasRewards(String hasRewards) {
		this.hasRewards = hasRewards;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Customer c) {

		this.rewardPoints = c.getNumberOfOrders(c) * rewardPointsPerOrder;

	}

	public int getNumberOfOrders(Customer c) {
		return c.getOrderDatabase().size();
	}

	public String getRewardAvailability() {
		return rewardAvailability;
	}

	public void setRewardAvailability(String rewardAvailability) {
		this.rewardAvailability = rewardAvailability;
	}

	public void addOrder(Order s, Customer c, Inventory i) {//

		System.out.println(s.getTimeOrdered());
		System.out.println(c.getPaymentType());
		orderDatabase.add(s);

		// Rewards End to End
		if (c.getHasRewards().equals("Has Rewards")) {
			this.rewardPoints += 10; // automatically updates customer's reward points

			// Rewards for 10th and 100th order
			if (c.getNumberOfOrders(c) == 10) {
				this.rewardPoints = this.rewardPoints + 20;
			} else if (c.getNumberOfOrders(c) == 100) {
				this.rewardPoints = this.rewardPoints + 120;
			}
			// Reward Availability Logic
			if (c.getRewardPoints() > 40) {
				System.out.println("Congratulations! You can spend your 40 reward points on a free pizza!");
			} else {
				System.out.println("Your current reward points balance: " + c.getRewardPoints());
				System.out.println("Points away from free pizza: " + (40 - c.getRewardPoints()));
			}
		} else {
			c.notifyToMakeAccount(c);
		}

		// Checking Item Availability
		String orderType = s.getPizzaType();

		if (!i.returnItemAvailability(orderType)) {
			System.out.println("--------------");
			System.out.println("Pizza type not available. Make a cheese pizza instead");
		}

	}

	public void notifyToMakeAccount(Customer c) {
		System.out.println("Email customer to make a Rewards Account at: " + c.getEmailAddress());
	}

	public void notifyOfRewardsAvailability(Customer c) {
		System.out.println("Email customer of new reward available at: " + c.getEmailAddress());

	}
}
