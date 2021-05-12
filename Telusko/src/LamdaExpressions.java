@FunctionalInterface
interface Singleable
{
	public void LamdaExpressions();
}


public class LamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Lamda Expression always used with FunctionalInterface to define the method like anonymous class
		 *  we use define method body without any name that is why it works only with single/functional interface
		 */
		
		// to make obj of interface we can use anonymous class as in below example
		Singleable obj = new Singleable()
				{
					public void LamdaExpressions()
					{
						System.out.println("This is by using Anoymous class in this we write multiple line of code"
								+ "for just a single method declaration");
						
					}
				};
		//Now by using Lamda Expression we can define full body as well by using {}
		Singleable single_obj = () -> System.out.println("By using Lamda expression");
		Singleable single_obj1 = () ->
		{
			System.out.println("We can do N number of work in this type of function as a normal function");
		};
		single_obj.LamdaExpressions();
		obj.LamdaExpressions();
		single_obj1.LamdaExpressions();
	}

}
