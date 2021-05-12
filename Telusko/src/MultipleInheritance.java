interface Firstable
{
	default void one()
	{
		System.out.println("inside the First");
	}
}

interface Secondable
{
	default void one()
	{
		System.out.println("Inside Secondable");
	}
}

class Implementation implements Firstable, Secondable
{
	// we can override a method by a new defination of can use super keyword with the interface name to inherite that
	// defined statements in it(we can change Firstable with Secondable to use Secondable functionality.
	@Override
	public void one() {
		// TODO Auto-generated method stub
		 Firstable.super.one();
		// Secondable.super.one();
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * From java 1.8 we can define method inside interfaces and we can implement multiple interfaces as well
		 * After multiple implementation it may be possible to face ambiguity problem again like in multiple inheritance
		 * we have.
		 * To solve this we have a solution to override interface method with new/old implementation
		 * 
		 */
		Implementation imp_obj = new Implementation();
		imp_obj.one();
		
	}

}
