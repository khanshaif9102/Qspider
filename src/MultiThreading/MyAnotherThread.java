package MultiThreading;
//creating Thread using Thread class
public class MyAnotherThread extends Thread{
	public void run() {
		//task for thread
		for(int i=10;i>=0;i--) {
			System.out.println("another thread ="+i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
