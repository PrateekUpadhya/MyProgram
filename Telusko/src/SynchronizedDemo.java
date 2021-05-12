class Sync
{
	static int count = 0;
	public synchronized void increment()
	{
		count++;
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * To lock particular method we use Synchronized keyword to make it thread safe
		 */
		Sync c = new Sync();
		Thread T1 = new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=0;i<1000;i++)
							c.increment();
					}
				});
		Thread T2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
					c.increment();
			}
		});
		
		T1.start();
		T2.start();
		T2.join();
		System.out.println(" "+ Sync.count);
	}

}
