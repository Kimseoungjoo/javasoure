import java.util.Scanner;

//   콘솔 입력받는 프로그램 만드시오




public class ConsoleInputMain {
	public static void main(String[] args) {
	// 키보드 입력받을 준비해서 k에 저장함
		Scanner k = new Scanner(System.in);
		System.out.print("식당 이름 : ");     //식당 이름 입력받기
		
		String rastourant = k.next();
		System.out.println(rastourant);
		
		System.out.print("식당의 크기 : ");
		double size = k.nextDouble();
		
		System.out.print("식당 테이블 개수 : ");
		int table = k.nextInt();
		
		System.out.print("영업 중입니까?(true/false) : ");
		boolean isOpening = k.nextBoolean();
		k.close();
		System.out.println(size);
		System.out.println(rastourant);
		System.out.println(table);
		System.out.println(isOpening);
	}
}
