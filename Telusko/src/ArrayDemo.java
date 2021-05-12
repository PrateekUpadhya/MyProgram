import java.util.Scanner;

class Student{
	static int i=1;
	public Student()
	{
		System.out.println("Student class called "+i+"time");
		i++;
	}
}



public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* we have 3 type of array
		*	1D array 
		*	2D array
		*	3D array
		*	Jagged array (in which all array size is not same)
		*/
		
		
		int i,j=1;
	//jagged array: // in this we are handeling 2 arrays of diffrent size 
		int arr4[][]= new int[5][]; // we dont have to declare 2nd leght of array 
		arr4[0]=new int[2];
		arr4[1]=new int[3];
		arr4[2]=new int[3];
		arr4[3]=new int[1];
		arr4[4]=new int[3];
		 /*
		for(i=0;i<5;i++)
		{
			arr4[i]= new int[j];
			j++;
		} */
		int count=1;
		for(i=0; i< arr4.length;i++)
		{
			for(j=0;j <arr4[i].length;j++)
			{

				arr4[i][j]= count;
			}
		}
		System.out.println("Values inside jagged array:");
		for(i=0; i< arr4.length;i++)
		{
			for(j=0;j <arr4[i].length;j++)
			{
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		int arr[] = new int[4]; // defind 1d array of size 4
		char arr1[]= {'a','s','d','v'}; // we also can declare a array like this if we already know values
		char arr2[] = new char[4]; // by default value will be blank
		arr[1]= 23;
		arr[2]= 55;
		// if we will not specify the array elements by default they will be zero in int type array
		for ( i= 0; i < 4; i++)
		{
			System.out.println("At "+i+"th position value is = "+arr[i]);
			System.out.println(" char type of arr "+ arr1[i]);
			System.out.println(" char type of arr "+ arr2[i]);
			
		}
		
		// we can make arr of objects also
		Student obj[] = new Student [4];
		obj[1]= new Student();
		obj[1]=new Student();
		
		for (i= 0; i < 4; i++)
		{
					obj[i]= new Student();
		}
		
		String Arr[][]= new String[4][3];
		Scanner sc=new Scanner(System.in);
		
		for (i=0; i<4; i++)
		{
			for(j=0;j<3;j++)
			{
				if (j==0)
				{
					System.out.println("Please Enter your name: ");
					Arr[i][j]=sc.next();
				}
				if (j==1)
				{
					System.out.println("Please enter your age: ");
					Arr[i][j]=sc.next();
				}
				if (j==2)
				{
					System.out.println("Please enter your Contact number: ");
					Arr[i][j]=sc.next();
				}
				
			}
		}
		
		for (i=0; i<4; i++)
		{
			for(j=0;j<3;j++)
			{
				if (j==0)
				{
					System.out.println("Name of "+i+" student  is "+Arr[i][j]);
				}
				if (j==1)
				{
					System.out.println("Age of "+i+" student  is "+Arr[i][j]);
				}
				if (j==2)
				{
					System.out.println("Contact num of "+i+" student  is "+Arr[i][j]);
				}
				
			}
			
		}
		
		for (i=0; i<4; i++)
		{
			for(j=0;j<3;j++)
			{	
				// how the above value was stored in array
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
		
}
