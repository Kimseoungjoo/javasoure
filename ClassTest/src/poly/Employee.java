package poly;

public class Employee {
	private String name;
	private String position;
	
//	public Employee(String name, String position) {
//		super();
//		this.name = name;
//		this.position = position;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void work() {
		System.out.println(name+" "+position+"에서 일한다");
	}
}
