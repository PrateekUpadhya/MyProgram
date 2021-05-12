final class Final
{
	void show()
	{
		System.out.println("Final class will not extend by any other class");
	}
}

class Final2
{
	final void show()
	{
		System.out.println("no one can override this final method");
	}
}

class Final3 extends Final2
{
//	public void show() {}
	final double PI= 3.14; // constant should have all capital letters
}




public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We casn use Final keyword with :
		 * Variables to make their value constant
		 * With methods to not override that method in inherited class
		 * with class to make class non inheritable
		 */
		
		

	}

}
