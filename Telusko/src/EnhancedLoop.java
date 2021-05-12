
public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* in the enhaced loop we can do increment one by one automatically
	 * in which we can deal with 1d 2d array same with the values	
	 */
		int count[]= {1,2,4,5,6,1};
		
		for (int i : count)
		{
			System.out.println(" "+i);
		}
		
		int arr2 [][]= {
				{1,1,3,4},
				{12,4,2},
				{12,31,21,3444,421,121}
		};
			
		//hence arr2 is 2d (jagged) array so 1st we have to store array's 1st row
		// in a local varible and then use the values:
		for(int i[]: arr2)
		{	
			for(int j : i)
				System.out.print(" "+ j);
		System.out.println("");
		}
			
	}

}
