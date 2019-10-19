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
	private boolean status;
	private int preparationTime;

	Hashtable<String, Integer> ingredients = new Hashtable<String, Integer>();

	// Iterator iterateName = rawMaterialName.iterator();
	// Iterator iterateQuantity = rawMaterialQuantity.iterator();
	RawMaterial rawIngredient = new RawMaterial();

	public FoodItem(String name, int price,int preparationTime) {
		this.name = name;
		this.price = price;
		this.preparationTime=preparationTime;
	}

	public void addRawMaterial(String name, int quantity) {
		ingredients.put(name, quantity);
	}

	boolean checkStatus() {
		status = true;
		ingredients.forEach((a, b) -> {
			int checkQuantity = ingredients.get(a);
			int checkWithQuantity = RawMaterial.ingredients.get(a);
			if (checkQuantity > checkWithQuantity) {
				status = false;
			}

		});

		return status;

	}

	@Override
	public String toString() {
		return name + price;
	}

}
