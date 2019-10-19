package rawmaterial;

import java.util.ArrayList;
import java.util.Iterator;


public class FoodItem {
	
	private String name;
	private int price;
    private boolean status;
	
	ArrayList<String> rawMaterialName = new ArrayList<String>();
	ArrayList<Integer> rawMaterialQuantity = new ArrayList<Integer>();
	
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
		rawMaterialName.add(name);
		rawMaterialQuantity.add(quantity);
	}
	
	boolean checkStatus()
	{
		
	}
	
	
}
