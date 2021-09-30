package shop;

// 추상클래스  : 반추상적이다 
// 반추상 : 일반클래스와 동일한데, 추상메서드도 가지고 있는 상태 

public abstract class Product {
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void printDetail() {// 상품의 기본정보인 이름과 가격을 출력
		System.out.println("상품명 : "+this.pname);
		System.out.println("가격 : "+this.price);
		printExtra();
		
	}
	public abstract void printExtra();
	
	
}
