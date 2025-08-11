package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		for(int i=0;i<3;i++) {
			System.out.print("학번 입력>");
			String sno = sc.nextLine();
			System.out.print("이름 입력>");
			String name = sc.nextLine();
			list.add(new Student(sno, name));
		}
		
		for(Student stu : list) {
			System.out.println(stu);
		}
		 
	}
}
