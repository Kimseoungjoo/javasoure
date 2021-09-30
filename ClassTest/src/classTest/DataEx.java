package classTest;

public class DataEx {
	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data"+data);
		//x의 값 10으로 지정
		data.x = 10;
		change(data.x);
		System.out.println("change() x = "+data.x);
		change(data);
		System.out.println("change() x = "+data.x);
		
	}
	static void change(int x) {
		x = 10000;
		System.out.println("change() x = "+x);
	}
	static void change(Data data) {
		data.x = 10000;
		System.out.println("change() x = "+data.x);
	}
}
