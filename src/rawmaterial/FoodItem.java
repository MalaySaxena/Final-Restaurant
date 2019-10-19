package rawmaterial;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class FoodItem {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private String name;
	private int price;
	private static boolean status;
	private int preparationTime;

	static Hashtable<String, Integer> ingredients = new Hashtable<String, Integer>();

	// Iterator iterateName = rawMaterialName.iterator();
	// Iterator iterateQuantity = rawMaterialQuantity.iterator();
	RawMaterial rawIngredient = new RawMaterial();

	public FoodItem(String name, int price,int preparationTime) {
		this.name = name;
		this.price = price;
		this.setPreparationTime(preparationTime);
	}

	public void addRawMaterial(String name, int quantity) {
		ingredients.put(name, quantity);
	}

	public static boolean checkStatus(String foodItem) {
		status = true;
		ingredients.forEach((a, b) -> {
			int checkQuantity = ingredients.get(a);
			int checkWithQuantity = RawMaterial.ingredients.get(foodItem);
			if (checkQuantity > checkWithQuantity) {
				status = false;
			}

		});

		return status;

	}

	@Override
	public String toString() {
		return name;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}

}
