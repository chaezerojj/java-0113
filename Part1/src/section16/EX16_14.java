package section16;

import java.util.HashMap;
import java.util.Map;

public class EX16_14 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
		
		map.remove("winter");
		
		System.out.println(map);
		map.put("spring", "봄봄");
		
		System.out.println(map);
		System.out.println("Is Exist Key: " + map.containsKey("winter"));
		System.out.println("get Data: " + map.get("spring"));
		
	}

}
