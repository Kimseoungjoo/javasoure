package interfaceTest;

public class MySqlDao implements DataAccessObject {

	@Override
	public String select() {//public void select(){System.out.println(..);}
		return "MySql DB���� �˻�";
	}

	@Override
	public String insert() {
		return "MySql DB���� ����";
	}

	@Override
	public String update() {
		return "MySql DB���� ����";
	}

	@Override
	public String delete() {
		return "MySql DB���� ����";
	}

}
