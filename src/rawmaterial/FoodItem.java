package rawmaterial;

import java.util.ArrayList;
/*
 * This is Food Item class.
 * Which contain whereas fooditem link with raw materials. 
 * */

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
	public void addlastFoodItem() {
		Left.add(left);
		Right.add(right);
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
		for (int i =Left.get(foodItemNumber+1); i<Right.get(foodItemNumber+1); i++) {
			int checkQuantity = ingredientQuantity.get(i);
			int checkWithQuantity = 0;
			try{checkWithQuantity = RawMaterial.ingredients.get(ingredientName.get(i));}
			catch(Exception e) { System.out.print("Null pointer Exception");}
			if (checkQuantity > checkWithQuantity) {
				status = false;
				return status;
			}
			else
				RawMaterial.ingredients.replace(Menu.getDishName(foodItemNumber), checkWithQuantity-checkQuantity);
		}
		
		return status;

	}

	@Override
	public String toString() {
		return name;
	}

}
