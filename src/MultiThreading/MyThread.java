package MultiThreading;

//creating our thread using Runnable Interface
public class MyThread implements Runnable {
	public void run() {
		//task for thread..
		for(int i=0;i<=10;i++) {
			System.out.println("value of i="+i);
			try{Thread.sleep(1000);}catch(Exception e){}
			
		}
	}
	public static void main(String[] args) {
		//Creating object of MyThread class
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		
		t.start();
		//object of MyAnotherThread class
		MyAnotherThread obj1=new MyAnotherThread();
		obj1.start();
	}
}
