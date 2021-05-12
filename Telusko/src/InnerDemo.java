class Outer  // class file will be Outer.class
{
	int i;
	public void show()
	{
		System.out.println("inside show");
	}
	
	class Inner // class inside class    (Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inside Inner class");
		}
	}
	
	static class Inner2 // Outer.Inner2.class
	{
		void display()
		{
			System.out.println("We can have static and non static class in a class");
		}
	}
	
}

public class InnerDemo {

	void prateek() {
		System.out.println("inside prateek");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Outer obj =new Outer(); // simple object 
		// to make inner class obj we must have outer class obj to call construtor
		Outer.Inner obj2= obj.new Inner();
		obj2.display();
		// this is a static class obj:
		Outer.Inner2 obj3= new Outer.Inner2();
		obj3.display();
		InnerDemo obj4 = new InnerDemo();
		obj4.prateek();
	}

}
