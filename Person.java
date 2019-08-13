package Assignment_2;

public class Person {
	
	private int age;
	
	public Person(int age){
		this.age = age;
	}
	public Person(){
		this.age = 10;
	}
	
	public void inputAge(int a) throws NegativeAgeException{
		if(a < 0)
			throw new NegativeAgeException();
		age = a;
		System.out.println("This Person is " + age + "yrs old.");
	}
}