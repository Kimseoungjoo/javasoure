package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.Cleanup;

public class Connect {

	public static void main(String[] args) {
		// SQL�� ����
		// ����̹� �ε�
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			// ���� �õ�
			// localhost : ���� ��ǻ��
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("����Ǿ����ϴ�");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}