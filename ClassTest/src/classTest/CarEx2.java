package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		
//객체 생성시 생성자 자동호출
		Car2 car = new Car2();// 인스턴스화 (car:인스턴스)
		//기본 속성 값은 String >null,
						//int >0,boolean> false,
						//double > 0.0
		
		
		//두번째차
		Car2 car2 = new Car2("kona");
		
		//세번째 차
		Car2 car3 = new Car2("kona","black");
		
		//네번째 차
		Car2 car4 = new Car2("현대","kona","black", 250);
		
		
//		car.company = "현대";
//		car.model = "캐스퍼";
//		car.color = "red";
//		car.maxSpeed = 200;
		
		car.forward();
		
		
//객체 생성시 생성자 자동호출
//field Car2.company is not visible
//		car2.company = "현대";
//		car2.model = "산타페";
//		car2.color = "black";
//		car2.maxSpeed = 250;
		
		car.forward();
		
		
		
		
		
	}
}
