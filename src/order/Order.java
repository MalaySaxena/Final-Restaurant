package order;

/*This is Order Package, where Customer order is collected in an arraylist. 
 * It is extend of FoodItem class.
 * */
import java.util.ArrayList;
import java.util.Random;

import menu.Menu;
import rawmaterial.FoodItem;

public class Order extends FoodItem {
	static ArrayList<Integer> order = new ArrayList<Integer>();

	// constructor of Order
	public Order(String name, int price, int preparationTime) {
		super(name, price, preparationTime);
	}

	// This function takes the food item number and check whether the item is
	// available in inventory or not.
	public static boolean collectOrder(int foodItemNumber) {
		Menu menu = new Menu();
		if (!checkStatus(menu.getDishName(foodItemNumber))) {
			Random r = new Random();
			System.out.println("Sorry this" + menu.getDishName(foodItemNumber)
					+ "is unavailable, Check our top other dishes " + menu.getDishName(r.nextInt(18) + 1));
			return false;
		} else {
			order.add(foodItemNumber); // if there is availability we add the foodItemNumber in Order ArrayList.
		}
		return true;

	}

	// This function calculate the overall preparation time of Order.
	public static int checkPreparationTime() {
		int time = 0;

		Menu menu = new Menu();
		for (Integer i : order) {
			int currentOrderTime = Menu.menu.getDishPreparationTime(i);

			time = time + currentOrderTime;
		}
		return time;
	}

	// This function place and display the bill according to the order provided by
	// user, and returns the total amount.
	public static int placeBill(String customerName, String customerMobileNumber, int tableNumber) {

		String leftAlignFormat = "| %-4d | %-25s | %-4d |%n";
		int i = 0, bill = 0;
		Menu menu = new Menu();
		System.out.format("+-----------------------------------------+%n");
		System.out.format("+--------------------BILL-----------------+%n");
		System.out.format("+-----------------------------------------+%n");
		System.out.println("Customer Name=> " + customerName);
		System.out.println("Customer Mobile Number=> " + customerMobileNumber);
		System.out.println("Customer Table Number=> " + tableNumber);
		System.out.format("+-----------------------------------------+%n");
		System.out.format("+------+---------------------------+------+%n");
		System.out.format("|S.No. | Food Item                 |Price |%n");
		System.out.format("+------+---------------------------+------+%n");
		for (Integer foodItem : order) {
			i++;
			System.out.format(leftAlignFormat, i, menu.getDishName(foodItem), menu.getDishPrice(foodItem));
			bill += menu.getDishPrice(foodItem);

		}
		System.out.format("+------+---------------------------+------+%n");
		System.out.println("Total Amount=> " + bill + "/-");
		System.out.println("Thank you for shopping");
		System.out.format("+------+---------------------------+------+%n");
		return bill;
	}

}
