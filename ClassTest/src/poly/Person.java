package poly;

public class Person {
	
	private String name;
	private String address;
	private int age;

	public Person(String name, String address, int age) {// 积己磊
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
//	@Override
//	public String toString() { // 林 格利 
//		return "name = " +name+", address = "+address+", age = "+age;
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
}
