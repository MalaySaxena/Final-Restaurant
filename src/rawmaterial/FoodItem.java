package rawmaterial;

/*
 * This is Food Item class.
 * Which contain whereas fooditem link with raw materials. 
 * */
import java.util.Hashtable;
import java.util.Set;

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

	RawMaterial rawIngredient = new RawMaterial();

	public FoodItem(String name, int price, int preparationTime) {
		this.name = name;
		this.price = price;
		this.setPreparationTime(preparationTime);
	}

	// This function add Raw Material in a Particular foodItem.
	public void addRawMaterial(String name, int quantity) {
		ingredients.put(name, quantity);
	}

	// this check status whether the foodItem will be available or not, by checking
	// quantity
	public static boolean checkStatus(String foodItem) {
		status = true;
		/*
		 * ingredients.forEach((a, b) -> { int checkQuantity = ingredients.get(a); int
		 * checkWithQuantity = RawMaterial.ingredients.get(foodItem); if (checkQuantity
		 * > checkWithQuantity) { status = false; }
		 * 
		 * });
		 */

		Set<String> keys = ingredients.keySet();
		for (String key : keys) {
			int checkQuantity = ingredients.get(key);
			int checkWithQuantity = RawMaterial.ingredients.get(foodItem);
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
