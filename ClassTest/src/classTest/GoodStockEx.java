package classTest;

public class GoodStockEx {
	// 속성 : 상품코드(p12345), 재고수량(100),
	public static void main(String[] args) {
		
		//첫번째 상품 재고관리
		GoodStock product1 = new GoodStock();
		
		product1.code = "p12345";
		product1.stockNum = 30;
		
		//상품판매 => 재고 감소
		//호출 => 리턴값이 있다면 리턴값ㅇ르 받기(syso, 변수)
		//System.out.println("현재 재고수량"+product1.disStock(15));
		
		
		int stockNum = product1.subtrackStock(15);
		System.out.println("현재 재고수량 "+stockNum);
		
		//반품 => 재고 증가
		// 메소드 호출 >> 리턴 타입이 없으면 호출만 하면 됨
		product1.addStock(5);
	}
		
}





























