package order;

import java.util.ArrayList;
import menu.Menu;
import rawmaterial.FoodItem;

public class Order extends FoodItem {
	static ArrayList<Integer> order = new ArrayList< Integer>();

	public Order(String name, int price, int preparationTime) {
		super(name, price, preparationTime);
		// TODO Auto-generated constructor stub
	}

	public static boolean collectOrder(int foodItemNumber) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		if (!checkStatus(menu.getDishName(foodItemNumber)))
			return false;
		else {
			order.add(foodItemNumber);
		}
		return true;

	}

	// max prep time to be added
	public static int checkPreparationTime(ArrayList<Integer> order, ArrayList<FoodItem> menu) {
		// TODO Auto-generated method stub
		int time = 0;
		for(Integer i : order)
		{
			int currentOrderTime = menu.get(i).getPreparationTime();
			time = time + currentOrderTime;
		}
		return time;
	}

	public static int placeBill(String customerName, String customerMobileNumber, int tableNumber) {
		// TODO Auto-generated method stub
		String leftAlignFormat = "| %-4d | %-25s | %-4d |%n";
		int i = 0,bill=0;
		Menu menu = new Menu();
		System.out.format("+-----------------------------------------+%n");
		System.out.format("+--------------------BILL-----------------+%n");
		System.out.format("+-----------------------------------------+%n");
		System.out.println("Customer Name=> " + customerName );
		System.out.println("Customer Mobile Number=> " + customerMobileNumber);
		System.out.println("Customer Table Number=> " + tableNumber);
		System.out.format("+-----------------------------------------+%n");
		System.out.format("+------+---------------------------+------+%n");
		System.out.format("|S.No. | Food Item                 |Price |%n");
		System.out.format("+------+---------------------------+------+%n");
		for (Integer foodItem : order) {
			i++;
			System.out.format(leftAlignFormat, i, menu.getDishName(foodItem), menu.getDishPrice(foodItem));
			bill +=  menu.getDishPrice(foodItem);
			
		}
		System.out.format("+------+---------------------------+------+%n");
		System.out.println("Total Amount=> " + bill + "/-");
		System.out.println("Thank you for shopping");
		System.out.format("+------+---------------------------+------+%n");
		return bill;
	}

	

}
