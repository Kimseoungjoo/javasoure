package classTest;

public class GoodStock2 {
	// 속성 : 상품코드(p12345), 재고수량(100),
	private String code;
	private int stockNum;

	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음)
	// 재고수량 감소(입력값 수량, 출력값은 현재 재고수량)
	
	//디폴트 생성자
	GoodStock2(){
		
	}
	//생성자 오버로딩
	// 멤버변수 초기화 목적
	GoodStock2(String code, int stockNum){
		this.code = code;
		this.stockNum = stockNum;
		
	}
	void addStock(int stockNum) {
		this.stockNum += stockNum;
		System.out.println(this.stockNum);
	}

	int subtrackStock(int stockNum) {
		if (this.stockNum > stockNum) {
			this.stockNum -= stockNum;
		}
		return this.stockNum;
	}
	// 현재 재고수량을 리턴한 기능
	int getStockNum() {
		return  stockNum;
	}
}
