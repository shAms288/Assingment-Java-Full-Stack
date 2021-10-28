public class TypeCasting {
	public static void main(String args[]) {
	byte age = 14;
	int new_age = age;
	System.out.println("Age is" + new_age);
	
	int salary= 14000;
	short new_salary = (short) salary;
	System.out.println("Salary is"+new_salary);
	
	float percentage = 66.45f;
	int new_percentage = (int) percentage;
	System.out.println("percentage is" + "\t"+ new_percentage);
	
	}

}