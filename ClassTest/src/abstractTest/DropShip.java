package abstractTest;

public class DropShip extends Unit{

	void load() {
		
	}
	@Override
	void move(int x, int y) {
		System.out.println("("+x+","+y+")으로 이동");
	}

}
