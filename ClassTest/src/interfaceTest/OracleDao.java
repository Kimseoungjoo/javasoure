package interfaceTest;

public class OracleDao implements DataAccessObject {

	@Override
	public String select() {
		
		return "Oracle DB에서 검색";
	}
	

	@Override
	public String insert() {
		return "Oracle DB에서 삽입";
	}

	@Override
	public String update() {
		return "Oracle DB에서 수정";
	}

	@Override
	public String delete() {
		return "Oracle DB에서 삭제";
	}

}
