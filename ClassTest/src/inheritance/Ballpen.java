package inheritance;
/*
 * public class Ballpen extends Pencil{
	private int amount;
	private String color;
	public String getColor() {
		return color;	}
	public void setColor(String color) {
		this.color = color;	}
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	
	 상속 받기 전의 코드
 */ 

public class Ballpen extends Pencil{
	
	private String color;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
