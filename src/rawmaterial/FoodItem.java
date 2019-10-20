package rawmaterial;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * This is Food Item class.
 * Which contain whereas fooditem link with raw materials. 
 * */
import java.util.Hashtable;
import java.util.Set;

import menu.Menu;

public class FoodItem {

	private String name;
	private int price;
	private static boolean status;
	private int preparationTime;

	// getters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}
	static ArrayList<String> ingredientName = new ArrayList<String>();
	static ArrayList<Integer> ingredientQuantity = new ArrayList<Integer>();
		
	RawMaterial rawIngredient = new RawMaterial();
	static int left=0;
	static int right=0;
	static ArrayList<Integer> Left = new ArrayList<Integer>();
	static ArrayList<Integer> Right = new ArrayList<Integer>();
	public FoodItem(String name, int price, int preparationTime) {
		this.name = name;
		this.price = price;
		this.setPreparationTime(preparationTime);
		Left.add(left);
		Right.add(right);
		left=right;
	}

	// This function add Raw Material in a Particular foodItem.
	public void addRawMaterial(String name, int quantity) {
		ingredientName.add(name);
		ingredientQuantity.add(quantity);
		right++;
	}

	// this check status whether the foodItem will be available or not, by checking
	// quantity
	public static boolean checkStatus(int foodItemNumber) {
		status = true;
		Menu menu = new Menu();
		for (int i =Left.get(foodItemNumber); i<Right.get(foodItemNumber); i++) {
			int checkQuantity = ingredientQuantity.get(i);
			int checkWithQuantity = RawMaterial.ingredients.get(menu.getDishName(foodItemNumber));
			if (checkQuantity > checkWithQuantity) {
				status = false;
				return status;
			}

		}
		
		return status;

	}

	@Override
	public String toString() {
		return name;
	}

}
