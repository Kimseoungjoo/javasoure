package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	//합계>> 반환 타입 int 
	int getTotal() {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		
		}
		return sum;
	}
	
	
	//평균
	double getAverage() {
		
		return (double)getTotal()/num.length;
	}
	
}
