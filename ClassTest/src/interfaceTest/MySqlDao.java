package interfaceTest;

public class MySqlDao implements DataAccessObject {

	@Override
	public String select() {//public void select(){System.out.println(..);}
		return "MySql DB에서 검색";
	}

	@Override
	public String insert() {
		return "MySql DB에서 삽입";
	}

	@Override
	public String update() {
		return "MySql DB에서 수정";
	}

	@Override
	public String delete() {
		return "MySql DB에서 삭제";
	}

}
