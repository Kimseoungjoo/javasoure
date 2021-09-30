package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB 연결 필수 과정

public class Select {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");// 1. 드라이브 걸기
						
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, user, password); // 연결 
			
			if(con!=null) {
				System.out.println("연결되었습니다"); // 확인
				//SQL 구문을 작성 = emp 테이블의 모든 데이터 조회
				String sql = "SELECT  * FROM emp";// SELECT  * FROM EMP;
				
				//SQL 구문을 DB서버로 전송해야한다
				pstmt = con.prepareStatement(sql);
				
				//SQL 구문이 실행된 결과를 받아(get?)와야한다
				rs = pstmt.executeQuery();// 실행 결과 RESULTSET 반환
				
				
				//받아온 결과를 화면에 출력
				
				System.out.println("empno     enam        job        mgr  \t hiredate         sal    comm   deptno");
				while(rs.next()) { // ResultSet 객체 안에 읽어올 내용이 있으면 true 없으면 false 반환
					System.out.printf("%4s\t",rs.getInt("empno"));
					System.out.printf("%7s",rs.getString("ename"));
					System.out.printf("%11s\t",rs.getString("job"));
					System.out.printf("%4d\t",rs.getInt("mgr"));
					System.out.printf("%10s\t",rs.getDate("hiredate"));// DB에선 DATE 타입으로 가지고있디
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
