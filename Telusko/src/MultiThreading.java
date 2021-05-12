class ThreadA extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		System.out.println("Thread 1");
	}
}

class ThreadB implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		System.out.println("Thread 2");
	}
}


public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We can do multi threading by extends Thread class or by implement runnable interface
		 * Run is abstract method defined inside Runnable interface so to start a thread it must to 
		 * initialize run method inside the implemented class and to make a thread we have to call start method by default
		 * it will call run method
		 * Runnable is a functional/single interface
		 */
		
		ThreadA obj = new ThreadA();
		ThreadB obj2 = new ThreadB();
		obj.start();
		Thread T1 = new Thread(obj2);
		T1.start();

	}

}
