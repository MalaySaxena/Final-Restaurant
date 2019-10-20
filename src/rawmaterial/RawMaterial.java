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
		ingredients.put("Palak", 15);
		ingredients.put("Cauliflower", 15);
		ingredients.put("Cabbage", 15);
		ingredients.put("Tomato", 15);
		ingredients.put("Methi", 15);
		ingredients.put("Dhaniya", 15);
		ingredients.put("Cucumber", 15);
		ingredients.put("Carrot", 15);
		ingredients.put("Potato", 15);
		ingredients.put("Onion", 15);
		ingredients.put("Green-Capsicum", 15);
		ingredients.put("Red-Capsicum", 15);
		ingredients.put("Yellow-Capsicum", 15);
		ingredients.put("Mushroom", 15);

		// type of flour
		ingredients.put("Whole-wheat", 15);
		ingredients.put("Normal atta", 15);
		ingredients.put("Besan", 15);

		// sauce
		ingredients.put("Ketchup", 15);
		ingredients.put("Vinegar", 15);
		ingredients.put("Soya Sauce", 15);
		ingredients.put("Mayonnese", 15);
		ingredients.put("Pizza Sauce", 15);
		ingredients.put("Red Chilli Sauce", 15);

		// spices
		ingredients.put("Salt", 15);
		ingredients.put("Garam Masala", 15);
		ingredients.put("Turmeric Powder", 15);
		ingredients.put("Red Chilli Powder", 15);
		ingredients.put("Jeera", 15);

		// bakery
		ingredients.put("Sandwich Bread", 15);
		ingredients.put("Cheese", 15);
		ingredients.put("Pizza bread", 15);
		ingredients.put("Butter", 15);

		// further ingredients
		ingredients.put("Dry Noodles", 15);
		ingredients.put("Machurian balls", 15);
		ingredients.put("Boiled Rice", 15);
		ingredients.put("Oil", 15);

	}

}
