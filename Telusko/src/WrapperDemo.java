
public class WrapperDemo {

	public static void main(String args[])
	{
		/*
		 * there are 2 type of varible
		 * primitive - int, float, double, char etc
		 * non primitive -Integer, Double
		 */
		int i=5; // variable declaration primitive data type declaration
		Integer b = new Integer(i); // here Integer is wrapper class and when we put primitive data in wrapper class
									// it call as boxing as java is pure oops so we should use data also as an object
		Integer o = new Integer(i); // boxing/ wrapping in java
		int j = o.intValue(); // unboxing/ un-wrapping in java
		Integer value = i; // autoboxing java will read this as line num 14. / auto unwrapping
		int k = value; // this is auto unboxing java compiler read this as line 15/ auto wrapping
		System.out.println(" "+j	);
		
		String str= "123";
		int num= Integer.parseInt(str); // parsing or 
		System.out.println("str= "+num);
 			
	}
}
