class StudentEncapsulation
{
	/* Encapsulation means-> binding data with methods simple
	 * we must use variable only with the methods, and variable must be private
	 * method must be public
	 * use get before method name to get values
	 * use set before name to set values
	 */
	
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentEncapsulation s= new StudentEncapsulation();
		s.setName("Prateek");
		s.setRollNo(1);
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		
	}

}
