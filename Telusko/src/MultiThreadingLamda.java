
public class MultiThreadingLamda {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * If we want to call a thread only once and don't want to use code again then we can use Lamda expression also
		 * to make a thread to make same size and also reduce number line of code
		 */
		Runnable one = () ->
		{	
			for(int i=0; i<5; i++) {
			System.out.println("Thread 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		
		Thread T1 = new Thread(one);
		T1.start();
		// we can use lamda expression inside thread also now we don't nee to make and pass that object
			Thread T2 = new Thread(()->
			{
				for(int i=0; i<5; i++)
				System.out.println("Thread 2");
			});
		
		T2.start();		
		
		//Main is also a thread so if we want to main thread till when our above created thread will not completed 
		// their work we can use join() to pause the thread to join that thread again for further process
		// this can throw exception so we must to handle that also @InterupttedException
		
		T1.join();
		T2.join();
		
		//Also we can use a particular check by using isAlive() to check the status of thread
		System.out.println(T1.isAlive());
		
		System.out.println("BYE");
	}

}
