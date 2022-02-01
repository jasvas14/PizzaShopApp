public class Inventory {

	private String itemType;
	private String itemAvailability;
	final int numIngredients = 6;

	String[][] inventoryArray = { { "Cheese", "Onions", "Pepperoni", "Jalepenos", "Sausage", "Peppers" },
			{ "Available", "Available", "Available", "Not Available", "Not Available", "Not Available" } };

	public void print() {
		for (int i = 0; i < numIngredients; i++) {
			System.out.println(inventoryArray[0][i] + " " + inventoryArray[1][i]);

		}
	}

	public String getItemType() {
		return itemType;
	}

	public void getItemAvailability(String s) {
		for (int i = 0; i < numIngredients; i++) {
			if ((inventoryArray[0][i]).equals(s)) {
				System.out.println(inventoryArray[1][i]);
				break;
			}
		}
	}

	public boolean returnItemAvailability(String s) {
		for (int i = 0; i < numIngredients; i++) {
			if ((inventoryArray[0][i]).equals(s)) {
				if (inventoryArray[1][i].equals("Available")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public void setItemAvailability(String item, String availability) {
		for (int i = 0; i < numIngredients; i++) {
			if ((inventoryArray[0][i]).equals(item)) {
				inventoryArray[1][i] = availability;
				break;
			}
		}
	}

}
