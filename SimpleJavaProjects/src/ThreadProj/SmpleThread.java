package ThreadProj;

public class SmpleThread extends Thread{

@Override
public void run() {
	System.out.println(Thread.currentThread().getName()+" started execution");
	
	if(Thread.currentThread().getName().equals("Sample Thread ")) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+": "+i);
	}
}

}
