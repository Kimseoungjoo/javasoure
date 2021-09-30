import java.util.Scanner;

// 논리연산자(>,   >=,   ==,  <,  <=,   !=) 
//          (초과,이상,같다,미만,이하,다르다)
// 논리결합연산자
//        &&   ||   ! 
//        and  or   not반대
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("키는 : ");
		double height = k.nextDouble();
		System.out.print("나이 : ");
		int age = k.nextInt();
		k.close();
		System.out.println("----------------------");
		System.out.printf("키 : %.1fcm, 나이 : %d세\n", height, age);

		// 키가 150 이상인지
		boolean playing = (height >= 140);
		System.out.println(playing);

		// 나이가 14살 이상
		boolean playing2 = (age <= 14);
		System.out.println(playing2);

		// 나이가 5살이상이고, 키가 190cm이상인가
		boolean playing3 = (age >= 5) && (height >= 190);
		System.out.println(playing3);
		// 나이가 5살이상이거나, 키가 190이상

		boolean playing4 = (age >= 5) || (height >= 190);
		System.out.println(playing4);
		
		// playing4가 true면 5는 false
		// playing4rk false면 5는 true
		boolean playing5 = !playing4;
		System.out.println(playing5);

	}
}
