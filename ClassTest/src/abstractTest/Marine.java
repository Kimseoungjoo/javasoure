package abstractTest;

public class Marine extends Unit{

	

	@Override
	void move(int x, int y) {
		System.out.println("("+x+","+y+")으로 이동");
	}
	void stimpack() {
		
	}
}
