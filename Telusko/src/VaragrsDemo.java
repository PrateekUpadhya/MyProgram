class Outer1
{
	public void add(int i, int j)
	{
		System.out.println("This is a simple method which takes a limited 2 argument");
		int  sum = i+j;
		System.out.println("sum :"+sum );
	}
	
	//instead of using this we can use a variable length arguments 	
	// now we can use n number of arguments in the method
	public int add(int ... n)
	{
		int sum=0;
		for(int k: n) 
		{
			sum = sum + k;
		}
		return sum;
	}
}

public class VaragrsDemo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1 obj= new Outer1();
		obj.add(5,6);
		int sum=obj.add(1,2,3,1,1,2,31,21,2);
		System.out.println("sum: "+sum);
	}
}


