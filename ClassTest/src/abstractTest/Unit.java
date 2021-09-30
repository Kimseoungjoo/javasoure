package abstractTest;

public abstract class Unit {
	/*
	 * private int x,y;
	 * 
	 * public Unit(int x, int y) { super(); this.x = x; this.y = y; }
	 * 
	 * void stop() { System.out.println("¸ØÃç!!" ); } 
	 * abstract void move();
	 */
	int x,y;
	abstract void move (int x, int y);
	void stop() {
		System.out.println("ÁöÁ¤µÈ À§Ä¡¿¡¼­ stop");
	}
}
