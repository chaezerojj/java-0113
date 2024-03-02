package section16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PRACTICE_16_05 {

	public static void main(String[] args) {
		String[] balls = {"빨간색", "빨간색", "빨간색", "빨간색", "파란색", "파란색", "파란색", "검은색", "검은색", "검은색" };
		
		Map<String, Integer> map = new HashMap<>();
		for (String ball: balls) {
			if (map.containsKey(ball)) {
				map.put(ball, map.get(ball) + 1);
			} else {
				map.put(ball, 1);
			} 
			
		}
		
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + " : " + map.get(key) + "개");
//			System.out.println("빨간색" + " : " + map.get("빨간색") + "개");
//			System.out.println("파란색" + " : " + map.get("파란색") + "개");
//			System.out.println("검은색" + " : " + map.get("검은색") + "개");
//		
		}
//		System.out.println(map);
	}

}
