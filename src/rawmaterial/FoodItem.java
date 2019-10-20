package rawmaterial;

import java.util.Hashtable;
import java.util.Map;

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

	static Hashtable<String, Integer> ingredients = new Hashtable<String, Integer>();

	// Iterator iterateName = rawMaterialName.iterator();
	// Iterator iterateQuantity = rawMaterialQuantity.iterator();
	RawMaterial rawIngredient = new RawMaterial();

	public FoodItem(String name, int price, int preparationTime) {
		this.name = name;
		this.price = price;
		this.setPreparationTime(preparationTime);
	}

	public void addRawMaterial(String name, int quantity) {
		ingredients.put(name, quantity);
	}

	public static boolean checkStatus(String foodItem) {
		status = true;
		/*
		 * ingredients.forEach((a, b) -> { int checkQuantity = ingredients.get(a); int
		 * checkWithQuantity = RawMaterial.ingredients.get(foodItem); if (checkQuantity
		 * > checkWithQuantity) { status = false; }
		 * 
		 * });
		 */
		for (Map.Entry<String, Integer> entry : RawMaterial.ingredients.entrySet()) {

		}
		return status;

	}

	@Override
	public String toString() {
		return name;
	}

}
