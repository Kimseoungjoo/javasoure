package interfaceTest;

public class OracleDao implements DataAccessObject {

	@Override
	public String select() {
		
		return "Oracle DB���� �˻�";
	}
	

	@Override
	public String insert() {
		return "Oracle DB���� ����";
	}

	@Override
	public String update() {
		return "Oracle DB���� ����";
	}

	@Override
	public String delete() {
		return "Oracle DB���� ����";
	}

}
