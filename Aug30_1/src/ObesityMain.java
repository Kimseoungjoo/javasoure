import java.util.Scanner;

/*비만도 검사------
    이름 : 
	키 :
	몸무게 : 
-------------------
표준체중 :  kg
비만도 :    %
소수점 2자리까지만
표준체중 = (키-100)*0.9
비만도 = (몸무게/표준체중) * 100
비만도 120 초과하면 비만, 아니면 정상*/

public class ObesityMain {
	public static void main(String[] args) throws InterruptedException{
		Scanner k = new Scanner(System.in);
		System.out.println("--------비만도----------");
		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("키 : ");
		double height = k.nextDouble();
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		k.close();
		System.out.println("----------------------");
		double avweight = (height - 100) * 0.9;
		double obesity = (weight / avweight) * 100;
		System.out.printf("표준체중 : %.2f kg\n", avweight);
		System.out.printf("비만도 : %.2f %%\n",obesity);
		String obesity2 = (obesity > 120) ? "비만" : "정상";
		
		System.out.printf("%s 씨는 %s입니다!", name, obesity2);
		Thread.sleep(4000);
	}
}
