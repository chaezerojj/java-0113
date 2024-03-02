package section16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EX16_12 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
		// asList: 삽입 삭제 불가, 배열의 주소값만을 참조
		
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.println("list 데이터 [" + (count++) + "] : " + val);
//			count++;
		}
		
	}

}
