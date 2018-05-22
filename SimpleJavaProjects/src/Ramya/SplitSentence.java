package Ramya;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "Java split example using string function.";

String[] newsent = sentence.split(" ");

for(String str:newsent) {
	System.out.println(str);
}
	}

}
