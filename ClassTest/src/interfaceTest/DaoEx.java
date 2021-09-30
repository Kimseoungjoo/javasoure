package interfaceTest;

public class DaoEx {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	public static void dbWork(DataAccessObject dao) {
		System.out.println(dao.select());//dao.select()
		System.out.println(dao.insert());//dao.insert()
		System.out.println(dao.update());//dao.update()
		System.out.println(dao.delete());//dao.delete()
	}

}
