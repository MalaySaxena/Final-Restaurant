package menu;

/* This is Menu class, it contains various items present in Menu
 * The Menu constructor holds a list of various dishes.
 * Given in proper time, like FoodItem(Dish Name, Cost and Preparation time)
 * Here, 1unit of time = 5 min in real world
 * accordingly this dishes are stored in arraylist. 
 * Here in raw material, quantity is represented as 1 unit = 100gm
 * */

import java.util.ArrayList;
import rawmaterial.FoodItem;

public class Menu {
	public static ArrayList<FoodItem> menu = new ArrayList<FoodItem>(18);

	public Menu() {
		FoodItem food = null;

		// 1 Sandwich
		// i)
		food = new FoodItem("Cheese Sandwich", 25, 4);
		food.addRawMaterial("Cheese", 4);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Sandwhich Bread", 2);
		menu.add(food);
		// ii)
		food = new FoodItem("Veg Sandwich", 30, 3);
		food.addRawMaterial("Tomato", 2);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Cabbage", 1);
		food.addRawMaterial("Cucumber", 1);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Sandwhich Bread", 2);
		menu.add(food);

		// 2 Pizza
		// i)
		food = new FoodItem("Onion Pizza", 50, 5);
		food.addRawMaterial("Cheese", 5);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Pizza Sauce", 2);
		food.addRawMaterial("Pizza Bread", 2);
		menu.add(food);

		// ii)
		food = new FoodItem("Margheritta", 50, 4);
		food.addRawMaterial("Cheese", 7);
		food.addRawMaterial("Pizza Sauce", 2);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Pizza Bread", 2);
		menu.add(food);

		// iii)
		food = new FoodItem("Farm Fresh Pizza", 80, 6);
		food.addRawMaterial("Cheese", 6);
		food.addRawMaterial("Pizza Sauce", 2);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Green-Capsicum", 2);
		food.addRawMaterial("Yellow-Capsicum", 1);
		food.addRawMaterial("Red-Capsicum", 1);
		food.addRawMaterial("Pizza Bread", 2);
		menu.add(food);

		// 3 Chinese
		// i)
		food = new FoodItem("Noodles", 60, 4);
		food.addRawMaterial("Dry Noodles", 4);
		food.addRawMaterial("Green Capsicum", 2);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Vinegar", 1);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Oil", 2);
		menu.add(food);

		// ii)
		food = new FoodItem("Manchurian", 60, 5);
		food.addRawMaterial("Manchrian balls", 4);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Green Capsicum", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Vinegar", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Fried Rice", 50, 4);
		food.addRawMaterial("Boiled Rice", 4);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Green Capsicum", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Vinegar", 1);
		menu.add(food);

		// 4 Main Course
		// i)
		food = new FoodItem("Palak Paneer", 60, 7);
		food.addRawMaterial("Paneer", 4);
		food.addRawMaterial("Oil", 2);
		food.addRawMaterial("Palak", 5);
		food.addRawMaterial("Onion", 3);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Paneer Butter Masala", 80, 7);
		food.addRawMaterial("Paneer", 5);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Tomato", 3);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Onion", 4);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Cauliflower Masala", 40, 6);
		food.addRawMaterial("Cauliflower", 5);
		food.addRawMaterial("Tomato", 4);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Onion", 4);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// iv)
		food = new FoodItem("Aloo Masala", 45, 5);
		food.addRawMaterial("Potato", 5);
		food.addRawMaterial("Tomato", 3);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 3);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// Roti
		// i)
		food = new FoodItem("Plain Roti", 5, 1);
		food.addRawMaterial("Normal Atta", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Butter Roti", 7, 1);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Normal Atta", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Butter Naan", 15, 2);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Whole Wheat", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// iv)
		food = new FoodItem("Tandoori Roti", 10, 2);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Whole Wheat", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// Rice
		// i)
		food = new FoodItem("Plain Rice", 30, 2);
		food.addRawMaterial("Boiled Rice", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Jeera Rice", 50, 3);
		food.addRawMaterial("Boiled Rice", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Jeera", 1);
		menu.add(food);

	}

	// This function is used to display Menu in a proper tabular format.
	public void displayMenu() {
		String leftAlignFormat = "| %-4d | %-25s | %-4d |%n";
		int i = 0;
		System.out.format("+-----------------------------------------+%n");
		System.out.format("+--------------------MENU-----------------+%n");
		System.out.format("+------+---------------------------+------+%n");
		System.out.format("|S.No. | Food Item                 |Price |%n");
		System.out.format("+------+---------------------------+------+%n");
		for (FoodItem foodItem : menu) {
			i++;
			System.out.format(leftAlignFormat, i, foodItem.getName(), foodItem.getPrice());
		}
		System.out.format("+------+---------------------------+------+%n");
	}

	// This function is used to get Dish Name from it's id number.
	public String getDishName(int foodItemNumber) {
		String foodItem = menu.get(foodItemNumber).getName();
		return foodItem;
	}

	// This function is used to get Dish Price from it's id number.
	public Integer getDishPrice(int foodItemNumber) {
		int foodItem = menu.get(foodItemNumber).getPrice();
		return foodItem;
	}

	// This function is used to get Dish PreparationTime from it's id number.
	public Integer getDishPreparationTime(int foodItemNumber) {
		int foodItem = menu.get(foodItemNumber).getPreparationTime();
		return foodItem;
	}
}
