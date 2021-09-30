package poly;

public class Product {
	
	int price;
	int bonusPoint;
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
//		this.bonusPoint = (int)(price/10.0);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
