class A
{
	public A()
	{
		System.out.println("Inside a constructor");
	}
	
	public A(int i, int j)
	{
		System.out.println("inside a parameterized constructor");
	}
}

class B extends A
{
	public B()
	{
		super(5,6);
		System.out.println("Inside B constructor");
		
	}
	B(int i, int j)
	{
		System.out.println("inside B's parametrized constructor");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when we call a constructor there by default a method super is there
		// which call parent/base/derived class of that class's constructor
		B obj= new B();
		// by default it call normal contructor but if we want to call parametrized
		// contructor we should use super(); method
		// super means call of parent constructor
		
		
		
		
		
	}

}
