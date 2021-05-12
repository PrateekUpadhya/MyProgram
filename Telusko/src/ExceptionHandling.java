import java.io.IOException;
import java.lang.invoke.StringConcatException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// When ever we do some calculation we need to do exception handling
		int a =10, b=0;
		int arr[]= {1,12,1};
		String s;
		try
		{
			System.out.println("arr[3] "+ arr[3]);	
			a= a/b;
			s="Prateek";
		}
		catch(ArithmeticException e) // we can handle exception specifically 
		{
			System.out.println("Error occured "+ e);
			// we can use ERR instead of out to print error in red colors
			System.err.println("Error occured");
		}
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) 
		{
			// we can catch multiple exception in one catch by using pipe | symbol also introduced in 1.7
			System.out.println("Error occurd in  "+ e);
		}
		catch(Exception e) // to catch any general runtime exception
		{
			System.out.println("This block will generate only when we get an uncatched exception"+ e);
		}
		finally
		{
			System.out.println("This block is used to print statement or processing what we need to do after every run");
		}
		
	}

}
