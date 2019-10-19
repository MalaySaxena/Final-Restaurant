package rawmaterial;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;


public class FoodItem {
	
	private String name;
	private int price;
    private boolean status;
	
    static Hashtable<Integer,String> ingredients = new Hashtable<Integer,String>();
	
	//Iterator iterateName = rawMaterialName.iterator();
	//Iterator iterateQuantity = rawMaterialQuantity.iterator();
	RawMaterial ingredient = new RawMaterial();
	
	FoodItem(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	
	void addRawMaterial(String name, int quantity)
	{
		ingredients.put(quantity,name);
	}
	
	boolean checkStatus()
	{
		
	}
	
	
}
