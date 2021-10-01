package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		
		while (run) {
			System.out.println("***************************************");
			System.out.println("1. 전체 부서 조회");
			System.out.println("2. 특정 부서 조회");
			System.out.println("3. 부서 추가");
			System.out.println("4. 부서 수정");
			System.out.println("5. 부서 삭제");
			System.out.println("6. 종료");
			System.out.println("***************************************");
			
		System.out.print("선택 >> ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			List<DeptDTO> list  = dao.getRows();
			
			System.out.println("부서번호\t부서명\t지역");
			for(DeptDTO dto : list) {
				System.out.print(dto.getDeptno()+"\t");
				System.out.print(dto.getDname()+"\t");
				System.out.print(dto.getLoc()+"\t");
				System.out.println();
			}
			
			break;
		case 2:
			System.out.print("\n조회 부서 번호 입력 :");
			int deptNo = sc.nextInt();
			DeptDTO dto1 = dao.getRow(deptNo);
			System.out.println("조회 내용은 다음과 같습니다.");
			System.out.println("부서 번호 : "+dto1.getDeptno());
			System.out.println("부서명 : "+dto1.getDname());
			System.out.println("위치 : "+dto1.getLoc());
			System.out.println();
			
			break;
		case 3:
			System.out.println("\n새로운 부서 추가 ");
			System.out.print("부서 번호 :");
			int newDeptno = sc.nextInt();
			System.out.print("\n부서명 : ");
			String newDname = sc.next();
			System.out.print("\n 지역명 :");
			String newLoc = sc.next();
			DeptDTO dto = new DeptDTO(newDeptno,newDname,newLoc);
			System.out.println(dao.insert(dto)?"부서 입력 성공": "부서 입력 실패");
			System.out.println();
			break;
		case 4:
			
			System.out.print("\n변경할 부서번호 입력 : ");
			int updateDeptno = sc.nextInt();
			System.out.print("원하는 부서명 입력 : ");
			String updateDname = sc.next();
			boolean flag = dao.update(updateDname, updateDeptno);
			System.out.println(flag?"변경완료":"실패");
			System.out.println();
			break;
		case 5:
			System.out.print("\n삭제할 부서 번호 : ");
			int deleteDeptno = sc.nextInt();
			boolean deleteFlag = dao.delete(deleteDeptno);
			System.out.println(deleteFlag? "부서 삭제 성공":"실패");
			System.out.println();
			break;
		case 6:
			run = false;
			break;

		default:
			System.out.println("번호를 확인해주세요");
			break;
		}
		}
	}
}
