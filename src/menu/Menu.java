package menu;
// 1unit of time = 5 min in real world
import java.util.ArrayList;

import rawmaterial.FoodItem;

public class Menu {
	static ArrayList<FoodItem> menu = new ArrayList<FoodItem>(18);

	public Menu() {
		FoodItem food = null;

		// 1 Sandwich
		// i)
		food = new FoodItem("Cheese Sandwich", 25, 4);
		food.addRawMaterial("Cheese", 2);
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
		food.addRawMaterial("Cheese", 2);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Pizza Sauce", 1);
		food.addRawMaterial("Pizza Bread", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Margheritta", 50, 4);
		food.addRawMaterial("Cheese", 2);
		food.addRawMaterial("Pizza Sauce", 1);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Pizza Bread", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Farm Fresh Pizza", 80, 6);
		food.addRawMaterial("Cheese", 2);
		food.addRawMaterial("Pizza Sauce", 1);
		food.addRawMaterial("Black pepper", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Green-Capsicum", 1);
		food.addRawMaterial("Yellow-Capsicum", 1);
		food.addRawMaterial("Red-Capsicum", 1);
		food.addRawMaterial("Pizza Bread", 1);
		menu.add(food);

		// 3 Chinese
		// i)
		food = new FoodItem("Noodles", 60, 4);
		food.addRawMaterial("Dry Noodles", 2);
		food.addRawMaterial("Green Capsicum", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Vinegar", 1);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Oil", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Manchurian", 60, 5);
		food.addRawMaterial("Manchrian balls", 2);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Green Capsicum", 1);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Vinegar", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Fried Rice", 50, 4);
		food.addRawMaterial("Boiled Rice", 2);
		food.addRawMaterial("Red Chilli Sauce", 1);
		food.addRawMaterial("Green Capsicum", 1);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Vinegar", 1);
		menu.add(food);

		// 4 Main Course
		// i)
		food = new FoodItem("Palak Paneer", 60, 7);
		food.addRawMaterial("Paneer", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Palak", 1);
		food.addRawMaterial("Onion", 1);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// ii)
		food = new FoodItem("Paneer Butter Masala", 80, 7);
		food.addRawMaterial("Paneer", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Tomato", 2);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// iii)
		food = new FoodItem("Cauliflower Masala", 40, 6);
		food.addRawMaterial("Cauliflower", 2);
		food.addRawMaterial("Tomato", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Onion", 2);
		food.addRawMaterial("Salt", 1);
		food.addRawMaterial("Red Chilli Powder", 1);
		food.addRawMaterial("Turmeric Powder", 1);
		food.addRawMaterial("Garam Masala Powder", 1);
		menu.add(food);

		// iv)
		food = new FoodItem("Aloo Masala", 45, 5);
		food.addRawMaterial("Potato", 2);
		food.addRawMaterial("Tomato", 2);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Oil", 1);
		food.addRawMaterial("Onion", 2);
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
		food.addRawMaterial("Whole Atta", 2);
		food.addRawMaterial("Salt", 1);
		menu.add(food);

		// iv)
		food = new FoodItem("Tandoori Roti", 10, 2);
		food.addRawMaterial("Butter", 2);
		food.addRawMaterial("Whole Atta", 2);
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

	public String getDishName(int foodItemNumber) {
		String foodItem = menu.get(foodItemNumber).getName();
		return foodItem;
	}

	public Integer getDishPrice(int foodItemNumber) {
		int foodItem = menu.get(foodItemNumber).getPrice();
		return foodItem;
	}
}
