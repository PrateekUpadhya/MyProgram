interface Demo123
{
	public abstract void show();
}

class Anonymous
{
	public void printnext()
	{
		System.out.println("We can't do method nesting");
	}
	public void print()
	{
		System.out.println("we can make multiple methods");
	}
}

public class AnnonimousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Anonymous class can be used to overwrite a base class method or to initiate a interface
 * Anonymous class scope will be only inside that function and it can be use only for single time use 
 * As we can't initiate method in interface we can't create object of it also but we can create obj of interface
 * by using anonymous class
 */
		
		Demo123 obj = new Demo123()
				{
					public void show()
					{
						System.out.println("This is a method inside anonymous class which created for interface A");
					}
					
				};
	
				obj.show();

				
		Anonymous obje = new Anonymous()
				{
					public void print()
					{  
						// if we want to overwrite a method only for that we can use anonymous class instead of 
						// inherit a class then overwrite it
						System.out.println("Overrided base class method by using anonymous class ");
					}
				};
	
		obje.printnext();
		obje.print();
	}
	
	
}
