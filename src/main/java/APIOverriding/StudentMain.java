package APIOverriding;

import java.util.Map;

public class StudentMain {
	public static void main(String[] args) {
		Student stu = new Student(10);

		Student stu2 = new Student(10);
	
		
		System.out.println((stu).equals(stu2));
 
	}
}
