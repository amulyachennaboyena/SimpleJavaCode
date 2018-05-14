package References;

import java.lang.ref.WeakReference;

/*Weak Reference Objects are not the default type/class of Reference Object and they should be explicitly specified while using them.
This type of reference is used in WeakHashMap to reference the entry objects .
If JVM detects an object with only weak references (i.e. no strong or soft references linked to any object object), this object will be marked for garbage collection.*/
public class WeakRefer {
public void x() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WeakRefer g = new WeakRefer();
		WeakReference<WeakRefer> weak = new WeakReference<WeakRefer>(g);
	}

}
