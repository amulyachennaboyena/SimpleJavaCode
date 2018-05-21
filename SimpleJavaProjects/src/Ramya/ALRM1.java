package Ramya;

import java.util.ArrayList;
import java.util.ListIterator;

public class ALRM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> num = new ArrayList<Integer>();
num.add(1);
num.add(2);
num.add(3);
num.remove(0);
ListIterator<Integer> it = num.listIterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}

}
