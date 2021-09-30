package classTest;

public class NumbersEx {

	public static void main(String[] args) {

		int num[] = {5,4,3,6,7};
	
		Numbers numbers = new Numbers(num);
		
		System.out.println(numbers.getTotal());
		System.out.println(numbers.getAverage());
	}

}
