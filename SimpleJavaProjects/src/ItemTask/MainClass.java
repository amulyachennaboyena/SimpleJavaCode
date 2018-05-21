package ItemTask;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Item> items = new ArrayList<Item>();

items.add(new Item(103,"iPhone",200));
items.add(new Item(101,"Vivo",200));
items.add(new Item(102,"Samsung",200));
	Collections.sort(items, new ItemPriceComparator());
	
	}

}
