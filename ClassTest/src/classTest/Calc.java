package classTest;

public class Calc {
	//????
	
	int plus(int x, int y) {
		return x+y;
	}

	
	//????
	double avg(int x, int y) {
		//return(x+y/2;
		//return plus(x,y)/2;
		int sum = plus(x,y);
		return sum/2;
	}
	void excute()	{
		//???? ?޼ҵ? ȣ??
		double result = avg(7,10);
		//????Ʈ ?޼ҵ? ȣ??
		println("????????"+result);
		
	}
	void println(String msg) {
		System.out.println(msg);
	}
}
