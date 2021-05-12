
abstract class Human  // a class only have abstract method if it is abstract type
{
	void eat() 
	{
		
	}
	abstract void sleep(); // if method is abstrat type then class must be abstracta nd we don't need to define that
	abstract void walk();
}

class Man extends Human
{
	// if a class extends abstract class it must define the abstract methods in it. like in this sleep and walk are
	void sleep()
	{
		
	}
	void walk()
	{
		
	}
}

abstract class Example
{
	void show()
	{
		System.out.println("we can make a abstract class without abstract method in it  but can't make its object");
	}
}

class ExtendsExample extends Example
{
	
}

public class AbstratDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we can't make abstract class obj
		 * if methods are abstract in a class it must be declare in extended class
		 *  we can use reference variable of abstract class while making obj of extended class
		 *  we can have a abstract class without abstract methods in it.
		 *  why we use abstract ( we don't want to make object of any class)
		 *  example Integer Double Float all extends a class Number which is pre-defind.
		 *  but we never make object of number class (it is abstract)
		 *  we want to define some specific rules for a thing but we don't want to finalize that only so we use abstract class
		 */
		
	//	Human obj = new Human();
		Human obj1 = new Man();
		ExtendsExample obj2 = new ExtendsExample();
		obj2.show();
		obj1.eat();
	}

}
