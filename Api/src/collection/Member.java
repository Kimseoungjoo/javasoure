package collection;

public class Member {
	private String id;
	private String password;
	private String name;

	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	@Override // set 중복 제거 
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override // set 중복 제거 
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return this.id.equals(mem.id);
		}
		return super.equals(obj);
	}
	
}
