
public class OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9, j =9;
		
		try
		{
			i=i/j;
			if(i ==1)
				throw new UserException("This is a user defind exception");	
		}
		catch(UserException e)
		{
			System.out.println("Exception "+ e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Finally always execute ");
		}
		
		
	}

}
