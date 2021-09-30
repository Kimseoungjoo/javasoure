package shop;

public class ShopEx {
	public static void main(String[] args) {
		Myshop shop = new Myshop();
		// 상점 이름 지정
		shop.setTitle("넘나머리아픈숍");
		// 고객 생성 
		shop.genUser();
		
		// 제품 생성 
		shop.genProduct();
		shop.start();
	}
}
