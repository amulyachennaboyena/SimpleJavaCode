package ThreadProj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread thread = Thread.currentThread();
System.out.println(thread.getName());
try {
	thread.sleep(40000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("end of main");

	}

}
