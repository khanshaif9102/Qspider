package MultiThreading;
class UserThread extends Thread{
	public void run() {
		//task for thread
		System.out.println("this is user define thread");
	}
}
public class ThreadOp {
	public static void main(String[] args) {
		System.out.println("Program Started");
		int x = 56 + 36;
		System.out.println("sum is :" + x);

		// Thread..
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current running Thread name:" + tname);

		// setName
		t.setName("MyMainThread");
		System.out.println(t.getName());

		// sleep method
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		// getId
		System.out.println(t.getId());
		
		System.out.println("Program ended");
		
		//going to start user thread
				UserThread th=new UserThread();
				th.start();
	}
}
