import java.util.*;

public class ActualTester {

	public static void main(String[] args) {

		Inventory b = new Inventory();
		Order order1 = new Order(3, 2, "Cheese", "11:00, PM", 8.0, 5.0, false);
		Order order2 = new Order(4, 2, "Onions", "5:55, PM", 8.0, 5.0, false);

		// End to End #1: Customer Requests Pizza --> Order Receipt printed to Kitchen
		Customer c = new Customer("Harry Styles", 678876546, "hstyles@gmail.com", "Cash", "Has Rewards", 0, "Not Available");

		Order order3 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		
		// Demo of Bonus points from 10 || 100 orders
		Order order4 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order5 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order6 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order7 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order8 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order9 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);
		Order order10 = new Order(5, 2, "Jalepenos", "11:55, PM", 8.0, 5.0, true);

		c.addOrder(order3, c, b);

		// Processing Payment
		order3.printReceipt(order3);
		// Finished

		// End to End #2

		// Same Customer makes another order

		System.out.println("----------------------");
		c.addOrder(order2, c, b);

		System.out.println("----------------------");
		order2.printReceipt(order2);

		// Demo continued for Bonus points from # of Orders
		c.addOrder(order1, c, b);
		c.addOrder(order4, c, b);
		c.addOrder(order5, c, b);
		c.addOrder(order6, c, b);
		c.addOrder(order7, c, b);
		c.addOrder(order8, c, b);
		c.addOrder(order9, c, b);
		c.addOrder(order10, c, b);
		System.out.println(c.getRewardPoints());
		System.out.println(c.getNumberOfOrders(c));

		
		//Begin Testing of Non-End-to-End Scenarios
		System.out.println("----------------------");
		System.out.println("*** Beginning of Non-End-to-End Scenario Testing");
		System.out.println();
		
		//Testing Employee Class
		Employee empTest = new Employee("Java Joe", 100);

		empTest.print();

		System.out.println();

		//Testing Cashier Class
		Cashier cashTest = new Cashier("Bob Boolean", 500.0);

		cashTest.print();

		System.out.println();

		cashTest.setTips(50.0);
		cashTest.print();

		System.out.println();

		//Testing Chef Class
		Chef chefTest = new Chef();

		chefTest.setEmployeeName("Chef Pizza");
		chefTest.setEmployeeEmail("chefpizza@cheese.com");
		chefTest.setEmployeeSalary(25000);
		chefTest.print();

		System.out.println();

		chefTest.givePromotion();
		chefTest.print();

		System.out.println();

		chefTest.givePromotion();
		chefTest.print();

		//Testing Chef Class with different constructor
		Chef chefTest2 = new Chef("Jim", 500.0);

		System.out.println("-------------------------");
		chefTest2.setEmployeeEmail("jim@dundermifflin.com");
		chefTest2.print();
		System.out.println();

		// Testing Cashier Class with different constructor
		Cashier cashTest2 = new Cashier("Halpert", 500000.0);

		System.out.println("-------------------------");
		cashTest2.setTips(50.0);
		cashTest2.print();

		//Tests promotion to make sure skill level does not increase above 5
//		chefTest.givePromotion();
//		chefTest.print();
//		System.out.println();
//		
//		chefTest.givePromotion();
//		chefTest.print();
//		System.out.println();
//		
//		chefTest.givePromotion();
//		chefTest.print();
//		System.out.println();
//		
//		chefTest.givePromotion();
//		chefTest.print();
//		System.out.println();
//		
//		chefTest.givePromotion();
//		chefTest.print();
//		System.out.println();

		//Testing PizzaShop Class
		PizzaShop tester = new PizzaShop();

		System.out.println("----------------------");
		tester.addEmployee(cashTest);
		
		//Testing Print Employee Count
		Employee count = new Employee();

		System.out.println(count.getEmployeeCount());
		
	}

}
