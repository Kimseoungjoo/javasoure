package exception;

public class CatchByException {

	public static void main(String[] args) {

		try { // 예외가 발생할 수 있는 구문
			// ArrayIndexOutOfBoundsException:
			String data1 = args[0];
			String data2 = args[1];
			// NumberFormatException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) { // catch 문 오류순서가 정해져있다. 
			System.out.println("입력값을 확인해주세요 ");
		}
		catch (NumberFormatException e) { // 예외 시 나올 구문
			System.out.println("숫자로 변환할 수 없습니다");
		} finally { // exception 여부와 상관없이 ******무조건 실행********
			System.out.println("다시 실행하세요 ");
		}
		// NumberFormatException

	}

}
