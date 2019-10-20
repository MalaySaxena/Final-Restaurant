package rawmaterial;

/*
 * This is a RawMaterial class.
 * It contains all the rawmaterial currently present in the inventory.
 * those are stored in an HashTable of type <String, Integer> 
 * where string = name and integer = quantity of rawmaterial 
 * */
import java.util.Hashtable;

public class RawMaterial {
	static Hashtable<String, Integer> ingredients = new Hashtable<String, Integer>(36);

	RawMaterial() {
		// vegetables
		ingredients.put("Palak", 50);
		ingredients.put("Cauliflower", 50);
		ingredients.put("Cabbage", 50);
		ingredients.put("Tomato", 50);
		ingredients.put("Methi", 50);
		ingredients.put("Dhaniya", 50);
		ingredients.put("Cucumber", 50);
		ingredients.put("Carrot", 50);
		ingredients.put("Potato", 50);
		ingredients.put("Onion", 50);
		ingredients.put("Green-Capsicum", 50);
		ingredients.put("Red-Capsicum", 50);
		ingredients.put("Yellow-Capsicum", 50);
		ingredients.put("Mushroom", 50);

		// type of flour
		ingredients.put("Whole-wheat", 50);
		ingredients.put("Normal atta", 50);
		ingredients.put("Besan", 50);

		// sauce
		ingredients.put("Ketchup", 50);
		ingredients.put("Vinegar", 50);
		ingredients.put("Soya Sauce", 50);
		ingredients.put("Mayonnese", 50);
		ingredients.put("Pizza Sauce", 50);
		ingredients.put("Red Chilli Sauce", 50);

		// spices
		ingredients.put("Salt", 50);
		ingredients.put("Garam Masala", 50);
		ingredients.put("Turmeric Powder", 50);
		ingredients.put("Red Chilli Powder", 50);
		ingredients.put("Jeera", 50);

		// bakery
		ingredients.put("Sandwich Bread", 50);
		ingredients.put("Cheese", 50);
		ingredients.put("Pizza bread", 50);
		ingredients.put("Butter", 50);

		// further ingredients
		ingredients.put("Dry Noodles", 50);
		ingredients.put("Machurian balls", 50);
		ingredients.put("Boiled Rice", 50);
		ingredients.put("Oil", 50);

	}

}
