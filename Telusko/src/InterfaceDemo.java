import java.io.Serializable;

interface Demo
{
	public abstract void show();
	void method(); // this will be by default public abstract because body is not given in this
}

//Single/functional interface
@FunctionalInterface
interface Implementable
{
	final int a =10;
	public abstract void time();
	// we can't have more than 1 method inside functional interface
	// but we can make n num of default type of methods
	
	default void show()
	{
		System.out.println("We can use default keyword to define methods inside the interface in 1.8 this can be override aswell");
	}
	static void demo()
	{
		System.out.println("We can use this method without creating obj of interface just with interface name");
	}
}

class ClassImp implements Implementable
{
	public void time()
	{
		
	}
	
	public void show()
	{
		
	}
}
public class InterfaceDemo implements Serializable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*
		 * Use of interface is to archive multiple inheritance in java
		 * all methods define in interface are by default public abstract
		 * we can't initialize method inside interface class
		 * Type of interfaces
		 * 1. Normal interface ( in which we have multiple defined abstract methods)
		 * 2. Single abstract interface (In this we have only single defined abstract method)
		 * 3. 	Marker interface (in this we don't have any method inside it (example Serializable interface)
		 * 
		 * Single abstract interface - Also know as Functional interface - by using this we can use LAMDA expressions
		 * this feature derived from Scala language, we can use annotation with this
		 * 
		 * In 1.8 version we can define n number of default methods in a interface like we can in abstract class but if
		 * interface is functional then we can have only one abstract method and n num of default methods
		 * 
		 * 
		 * we can now have default methods and final variables and static methods as well
		 */
		
		Implementable  obj = new ClassImp();
		obj.show();
		obj.time();
		int a =Implementable.a;
		System.out.println("a= "+a);
		Implementable.demo();
	}
}
