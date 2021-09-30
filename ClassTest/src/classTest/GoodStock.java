package classTest;


public class GoodStock {

	// 속성 : 상품코드(p12345), 재고수량(100),
	String code;
	int stockNum;

	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음)
	// 재고수량 감소(입력값 수량, 출력값은 현재 재고수량)
	
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

}
