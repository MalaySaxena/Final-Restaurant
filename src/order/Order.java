package order;

import java.util.Scanner;

import menu.Menu;
import rawmaterial.FoodItem;
import menu.Menu;
public class Order extends FoodItem{

	

	public Order(String name, int price, int preparationTime) {
		super(name, price, preparationTime);
		// TODO Auto-generated constructor stub
	}

	public static boolean collectOrder(int foodItemNumber) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		if(!checkStatus(menu.getDishName(foodItemNumber)))
			return false;
		else {
			checkPreparationTime(); // max prep time to be added
			}
		return true;
			
	}

	private static void checkPreparationTime() {
		// TODO Auto-generated method stub
		
	}
	
	
}
