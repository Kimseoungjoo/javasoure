import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) throws InterruptedException{
		Scanner a = new Scanner(System.in);
		System.out.print("제품명 : ");
		String name = a.next();
		System.out.print("가격 : ");
		int price = a.nextInt();
		System.out.print("무게 : ");
		double weight = a.nextDouble();
		a.close();
		System.out.println("-----------------------------------");
		System.out.print("제품명 : "); System.out.println(name);
		System.out.print("가격 : "); System.out.println(price);
		System.out.print("무게 : "); System.out.println(weight);
		// 형식지정이 가능한 함수(%s <string들어올 자리)
		// %d < 정수 들어올 자리 ex)자릿수 지정 >%0?d ?원하는 자릿수
		// %f < 실수 들어올자리 ex)소숫점 자릿수지정 > %0.?f 원하는 자릿수
		// %b < boolean
		System.out.println("-----------------------------------");
		System.out.printf("제품명 : %s\n",name); 
		System.out.printf("제품명 : %d\n",price); 
		System.out.printf("가격 : %d\n",price); 
		System.out.printf("무게 : %f\n",weight);  
		System.out.printf("무게 : %.1f\n",weight);
		System.out.println("-----------------------------------");
		System.out.printf("--%s [ %d원] 무게 : %.2f kg----\n",name, price, weight);
		System.out.println("-----------------------------------");
		double pct = 88.12;
		System.out.printf("%.2f%%",pct);// % / \ 글자로 적기위해서는 2개 \\ %% 적어야 출력이 가능하다
		Thread.sleep(10000);
	}
}
