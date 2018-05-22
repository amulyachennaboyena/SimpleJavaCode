package References;

public class StrongReference {
/* This is the default type/class of Reference Object. Any object which has an active strong reference are not eligible for garbage collection. The object is garbage collected only when the variable which was strongly referenced points to null.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StrongReference ref = new StrongReference();//strong reference
ref = null;//taken by garbage collector
	}

}
