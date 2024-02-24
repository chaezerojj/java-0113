package section16;

public class DataList<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize]; // 배열 길이가 10
		
	}
	
	public DataList(int size) { // 매개변수 1개
		data = new Object[size]; 
	}
	
	public void add(T value) {
		data[size++] = value;
	}
	
	public T get(int index) {
		return (T)data[index]; // index값만큼 반환
	}
	
	public int size() {
		return size;
	}
	
	public Object[] getArr() {
		return data;
	}
}
