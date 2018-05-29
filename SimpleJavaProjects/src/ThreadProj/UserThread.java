package ThreadProj;

public class UserThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmpleThread st = new SmpleThread();
st.setName("Sample Thread ");
st.start();

SmpleThread st2 = new SmpleThread();
st2.setName("Sample Thread2");
st2.start();
//st2.run();//run method will not start a thread

	}

}//2 threads are created main and smple thread
//sleep method is a static method