/*
 * we archive inheritance by using extends keyword in java
 */

class Father
{
	void property()
	{
		System.out.println("father have some property");
	}
}

class Children extends Father
{
	void childProperty()
	{
		System.out.println("Child can use its property and father's property as well");
	}
}


public class Inheritited_class {

	public Inheritited_class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we can make object by using father class reference varible and child class object
		 * or we can make it by child class reference var and object
		 * in both case we can use father's class properties
		 */
		Children obj=new Children(); // called default construtor
		obj.childProperty();
		Father obj1= new Father();
		obj1.property();
		obj.property();
		
	}

}
