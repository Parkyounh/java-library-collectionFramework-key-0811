package KeyValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();  //Map 컬랙션 생성
		
		map.put("박윤호",02);  //객체 저장
		map.put("홍길동",12);  
		System.out.println("총 수: "+map.size() );
		
		System.out.println("\t박윤호: "+map.get("박윤호")); //Key값으로 객체 값 찾기
		System.out.println();
		
		//값 하나씩 가져오기
		Set<String> KeySet = map.keySet(); 
		Iterator<String> keyIterator = KeySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key +" : "+value);
		}
		System.out.println();
		
		map.remove("박윤호"); //객체 삭제
		map.clear(); //객체 전체 삭제

	}

}
