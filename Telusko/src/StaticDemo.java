
class Second{
	
	int empid;
	static String ceo;
	static int i =1;
	
	static{
	ceo="Prateek";	
	System.out.println("Executed once per execution not dependent on obj, because class load only once in heap memory");
	}
	
	Second()
	{
		empid=1000;
		System.out.println("i= "+i);
		i++;
	}
	Second(int empid)
	{
		//* This is a parameterized constructor this will run when we create object
		this.empid= empid; 
		//* this keyword is used for point the global variable empid is local and other is global
		System.out.println("i= "+i);
		i++;
		
	}
	
}


public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second obj=new Second();
		Second obj1=new Second(0001);
		Second obj2=new Second();
		
	}

}
