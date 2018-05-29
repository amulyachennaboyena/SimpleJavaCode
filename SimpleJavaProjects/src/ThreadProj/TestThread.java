package ThreadProj;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread thread = new Thread(new TestRunnable());
thread.setName("TestThread");
thread.start();
	}

}
//runnable is more good because we have to use it any other class