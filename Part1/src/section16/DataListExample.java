package section16;

import java.util.Arrays;

public class DataListExample {

	public static void main(String[] args) {
		DataList list = new DataList();
		
		list.add(10);
		list.add("10");
		list.add(10.22);
		list.add(true);
		
		System.out.println(Arrays.toString(list.getArr()));
	}

}
