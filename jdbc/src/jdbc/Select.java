package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB ���� �ʼ� ����

public class Select {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");// 1. ����̺� �ɱ�
						
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, user, password); // ���� 
			
			if(con!=null) {
				System.out.println("����Ǿ����ϴ�"); // Ȯ��
				//SQL ������ �ۼ� = emp ���̺��� ��� ������ ��ȸ
				String sql = "SELECT  * FROM emp";// SELECT  * FROM EMP;
				
				//SQL ������ DB������ �����ؾ��Ѵ�
				pstmt = con.prepareStatement(sql);
				
				//SQL ������ ����� ����� �޾�(get?)�;��Ѵ�
				rs = pstmt.executeQuery();// ���� ��� RESULTSET ��ȯ
				
				
				//�޾ƿ� ����� ȭ�鿡 ���
				
				System.out.println("empno     enam        job        mgr  \t hiredate         sal    comm   deptno");
				while(rs.next()) { // ResultSet ��ü �ȿ� �о�� ������ ������ true ������ false ��ȯ
					System.out.printf("%4s\t",rs.getInt("empno"));
					System.out.printf("%7s",rs.getString("ename"));
					System.out.printf("%11s\t",rs.getString("job"));
					System.out.printf("%4d\t",rs.getInt("mgr"));
					System.out.printf("%10s\t",rs.getDate("hiredate"));// DB���� DATE Ÿ������ �������ֵ�
					System.out.printf("%5d\t",rs.getInt("sal"));
					System.out.printf("%5d\t",rs.getInt("comm"));
					System.out.printf("%2s\n",rs.getString("deptno"));
					
			
				}
				
				
				
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
