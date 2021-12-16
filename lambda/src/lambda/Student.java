package lambda;

public class Student {
	private String name;
	private int jumsu;
	
	public Student(String name, int jumsu) {
		super();
		this.name = name;
		this.jumsu = jumsu;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}

	public String getName() {
		return name;
	}

	public int getJumsu() {
		return jumsu;
	}
	
}
