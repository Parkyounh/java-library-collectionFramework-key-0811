package exit;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);
		
		System.out.println(map.get(new Student(1,"홍길동")));
	}

}
 