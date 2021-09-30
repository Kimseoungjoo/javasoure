import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/*고도 비만 : 35 이상
중(重)도 비만 (2단계 비만) : 30 - 34.9
경도 비만 (1단계 비만) : 25 - 29.9
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만*/
public class BMIMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("당신의 이름은 ? ");
		String name = k.next();
		System.out.print("당신의 키는 ? ");
		double height = k.nextDouble();
		System.out.print("당신의 몸무게는 ? ");
		double weight = k.nextDouble();
		k.close();
		if (height >= 3) {
			height /= 100;
		}
		double bmi = weight / (height * height);
		// System.out.println(bmi);
		System.out.println("----------------------------------");
		System.out.printf("%s님의 BMI 수치는 %.1f 입니다\n", name, bmi);
		if (bmi >= 35) {
			System.out.println("당신은 고도 비만입니다.");
		} else if (bmi >= 30) {
			System.out.println("당신은 중도 비만입니다.");
		} else if (bmi >= 25) {
			System.out.println("당신은 경도 비만입니다.");
		} else if (bmi >= 23) {
			System.out.println("당신은 과체중입니다.");
		} else if (bmi >= 18.5) {
			System.out.println("당신은 정상입니다.");
		} else
			System.out.println("당신은 저체중입니다.");
		/*
		 * 선생님이 하신 프로그램 String result = "저체중"; if (bmi >= 35) { result = "고도비만"; } else
		 * if (bmi >= 30) { result = "중도비만"; } else if (bmi >= 25) { result = "경도비만"; }
		 * else if (bmi >= 23) { result = "과체중"; } else if (bmi >= 18.5) { result =
		 * "정상"; } System.out.printf("%s 씨는 %s 입니다",name,result);
		 */

	}
}
