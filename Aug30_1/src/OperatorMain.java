
import java.util.Scanner;

// ---------편의점 택배-------
//가로 , 세로 , 높이, 무게
//----------------------------
//부피 = 가로*세로*높이
//논리연산자
// && &, || |, ! 
//	xor  = ^
// ex) & 작업을 마지막까지 한다.(앞에 조건이 틀려도)
// 2개  : 중단되는 버전 - V
//	&& - 더 확률이 낮은거를 앞으로 배치
// 	|| - 더 확률이 높은거를 앞으로 배치
//	1개 : 끝까지 가는 버전
//	조건문, 반복문, 배열(컬렉션), 그 언어만의 특징 - 객체 라이브러리 잘 활용 
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("택배를 원하십니까?(true / false)");
		boolean doWant = k.nextBoolean();
		System.out.print("택배 가로 :");
		double horizontal = k.nextDouble();
		System.out.print("택배 세로 :");
		double vertical = k.nextDouble();
		System.out.print("택배 높이 :");
		double height = k.nextDouble();
		System.out.print("택배 무게 :");
		double weight = k.nextDouble();
		k.close();
		System.out.println("-----------------------");
		System.out.printf("택배하기를 원하십니까? : %b \n", doWant);
		System.out.printf("택배 가로 : %.1f cm\n", horizontal);
		System.out.printf("택배 세로 : %.1f cm\n", vertical);
		System.out.printf("택배 높이 : %.1f cm\n", height);
		System.out.printf("택배 무게 : %.1f kg\n", weight);
		double volume = horizontal * vertical * height;
		System.out.printf("택배 부피 : %.1f = %.1f*%.1f*%.1f \n", volume, horizontal, vertical, height);
		System.out.println("-----------------------");
//      부피가 10이상이고, 무게가 1000이상이면 true
		boolean a = (volume >= 10) && (weight >= 1000);
//		부피가 10미만이거나, 무게가 1000미만이면
//		boolean b = (volume < 10) || (weight < 1000);X
		boolean b = (weight < 1000) || (volume < 10);// O
//		무게가 20이상이고, 무게가 30이상이면
		// boolean c = (weight >= 20) || (weight >= 30); X
		boolean c = (weight >= 30); // O

		if (a == true || b == true || c == true) {
			System.out.println("서비스를 제공가능");
		} else
			System.out.println("서비스를 제공받으실 수 없습니다");
		boolean d = (volume < 10) ^ (weight < 1000);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
