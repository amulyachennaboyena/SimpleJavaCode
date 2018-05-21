package CollectionProj;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> names = new LinkedList<>();
names.add("A");
names.add("B");
names.add("C");
names.add("D");
names.add("E");
LinkedList<String> names1 = new LinkedList<>();
names1.add("A");
names1.add("B");
names1.add("C");
names1.add("D");
names1.add("E");
String[] namesArr = new String[names.size()];
names.toArray(namesArr);
//
//names.addAll(names1);
//for(String s : namesArr) {
//	System.out.println(s);
//}
//System.out.println(
//names.add("hi")+"  "+
//names.removeAll(names1));
//
//for(String s : namesArr) {
//	System.out.println(s);
//}

//System.out.println(names.size());
//System.out.println(names.contains("a"));
//System.out.println(names.size());
//System.out.println(names.get(0));
//System.out.println(names.contains("A"));
//Object[] objArr = names.toArray();
//System.out.println(names.remove("mmmmm"));
//System.out.println(names.equals(names1));

Iterator<String> iterator = names.iterator();
	
while(iterator.hasNext()) {
	String str = iterator.next();
	System.out.println(str);
}
//for(Object obj : names) {
//	System.out.println(obj);
//}
	}

}
