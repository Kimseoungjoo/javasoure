package Shopingmall;
// printDetail 추가 

public abstract class Product  extends Myshop{ // 추상 클래스 
	private String selUser;

	String pname;
	int price;
	
	

	abstract void printExtra();

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

}
