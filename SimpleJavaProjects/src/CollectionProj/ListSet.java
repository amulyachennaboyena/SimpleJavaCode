package CollectionProj;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> names = new LinkedList<String>();
names.add("A");
names.add("B");names.add("C");names.add("D");

names.add("E");

ListIterator<String> iterator = names.listIterator();

iterator.next();
iterator.next();
iterator.next();iterator.next();
System.out.println(iterator.previous());
	}

}
