package Assignment_2;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		Person p2 = new Person();
		
		try {
			p1.inputAge(25);
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p2.inputAge(-2);
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
