package rawmaterial;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class FoodItem {
	
	private String name;
	private int price;
    private boolean status;
	
    Hashtable<String,Integer> ingredients = new Hashtable<String,Integer>();
	
	//Iterator iterateName = rawMaterialName.iterator();
	//Iterator iterateQuantity = rawMaterialQuantity.iterator();
	RawMaterial rawIngredient = new RawMaterial();
	
	public FoodItem(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	
	public void addRawMaterial(String name, int quantity)
	{
		ingredients.put(name,quantity);
	}
	
	boolean checkStatus()
	{
		status = true;
		ingredients.forEach((a,b)->{
			int checkQuantity=ingredients.get(a);
			int checkWithQuantity=rawIngredient.ingredients.get(a);
			if(checkQuantity>checkWithQuantity)
			{
				status = false;
			}
			
		});
		
		return status;
		
	}
	
	
}
