package exception;

public class UnCheckedException2 {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "200";
		try { // 예외가 발생할 수 있는 구문
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			System.out.println(value1+value2);
		} catch (NumberFormatException e) { // 예외 시 나올 구문
			System.out.println("숫자로 변환할 수 없습니다");
		}finally { //  exception 여부와 상관없이 무조건 실행 
			System.out.println("다시 실행하세요 ");
		}
		// NumberFormatException

	}

}
