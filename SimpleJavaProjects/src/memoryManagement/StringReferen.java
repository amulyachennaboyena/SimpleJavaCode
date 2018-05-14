package memoryManagement;

public class StringReferen {
String referen;
StringReferen(String Referen){
	this.referen = Referen;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
StringReferen str = new StringReferen("Hello World");

StringReferen str1 = new StringReferen("Hello World");

System.out.println(str == str1);
System.out.println(str.referen.equals(str1.referen));
System.out.println(str1);
	
	String s1 = new String("Hello World");
	String s2 = new String("Hello World");
	System.out.println(s1 == s2);
	
	
	}

}
