package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine fire;
		Ambulance ambul;
		// fire= ambul; 상속관계가 아닌 클래스 간의 형변환 불가

		fire = new FireEngine();
		Car car = fire; // 상속 관계가 있는 상황에서는 형변환가능(upcasting,업캐스팅(자식을 부모한테) > 형변환 생략가능)
		
		FireEngine f2;
		f2 = (FireEngine) car; //downcasting 다운 캐스팅 > 형변환 생략 불가
		
		f2.water();
	}
}
