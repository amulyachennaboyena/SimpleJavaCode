package References;

import java.lang.ref.SoftReference;

public class SoftRefer {
	/*In Soft reference, even if the object is free for garbage collection then also its not garbage collected,
	 *  until JVM is in need of memory badly.The objects gets cleared from the memory when JVM runs out of memory.
	 *  To create such references java.lang.ref.SoftReference class is used.*/
	public static void main(String[] args) {
	
	SoftRefer g = new SoftRefer();
	SoftReference<SoftRefer> soft = new SoftReference<SoftRefer>(g);
}
}
