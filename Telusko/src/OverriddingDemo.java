class C
{
	void show()
	{
		System.out.println("inside C's show");
	}
}

class D extends C
{
	@Override
	void show()
	{
		System.out.println("inside D's show");
	}
}

class E
{
	void show()
	{
		System.out.println("inside A's show");
	}
}

class F extends E
{
	@Override
	void show()
	{
		super.show();
		System.out.println("inside B's show");
	}
}

public class OverriddingDemo {

	public static void main(String args[])
	{
	/*
	 * We can make obbject of child class by using parent class reference variable 
	 * we can make child class obje and use parent class functions
	 * we can make use annotation @override just before overrided method to 
	 * remember that this is over rided method
	 * we can use super method to call parent class functionality before our method
	 */
		
		
		C obj = new D();
		obj.show();
		C obj1= new D();
		obj1.show();
		F obje = new F();
		obje.show();
		
	}
}
