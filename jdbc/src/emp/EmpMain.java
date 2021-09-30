package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		
		boolean run = true;

		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("=====================================");
			System.out.println("1. 개별 조회");
			System.out.println("2. 전체 조회");
			System.out.println("3. 사원 급여 조회");
			System.out.println("4. 급여 수정");// update emp_temp set sal = 입력값 where empno = 입력값;
			System.out.println("5. 추가 수당 수정");
			System.out.println("6. 신입사원 입력");
			System.out.println("7. 사원 삭제");
			System.out.println("8. 종     료");
			System.out.println("=====================================");

			System.out.print("입력 >> ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.print("조회할 사원 번호 입력 :");
				int empno = sc.nextInt();
				EmpDTO dto = dao.getRow(empno);

				if(dto==null) {
					System.out.println("\nNo data");
				}else {
					System.out.println("\n사번\t이름\t직무\t매니저\t입사일\t\t급여\t보너스\t부서번호");
					System.out.print(dto.getEmpno()+"\t");
					System.out.print(dto.getEname()+"\t");
					System.out.print(dto.getJob()+"\t");
					System.out.print(dto.getMgr()+"\t");
					System.out.print(dto.getHiredate()+"\t");
					System.out.print(dto.getSal()+"\t");
					System.out.print(dto.getComm()+"\t");
					System.out.println(dto.getDeptno()+"\t");
				}
				break;
			case 2:
				List<EmpDTO> list= dao.select();
				System.out.println("\n사번\t이름\t   직무\t\t매니저\t입사일\t\t급여\t보너스\t부서번호");
				for(EmpDTO dto1 : list) {
					System.out.print(dto1.getEmpno()+"\t");
					System.out.print(dto1.getEname()+"\t");
					System.out.printf("%8s\t",dto1.getJob());
					System.out.print(dto1.getMgr()+"\t");
					System.out.print(dto1.getHiredate()+"\t");
					System.out.print(dto1.getSal()+"\t");
					System.out.print(dto1.getComm()+"\t");
					System.out.println(dto1.getDeptno()+"\t");
				}
				break;
			case 3:
				System.out.println("사원별 급여 오름차순 조회");				
				System.out.println("사원명\t급여");
				list = dao.orderBySal();
				for(EmpDTO dto2 : list) {
					System.out.print(dto2.getEname()+"\t");
					System.out.print(dto2.getSal()+"\n");
				}
				System.out.println();
				break;
			case 4:
				System.out.print("\n수정할 사원 번호 : ");
				empno = sc.nextInt();
				System.out.print("\n수정 급여 : ");
				int sal = sc.nextInt();
				
				boolean updateFlag = dao.updateSal(empno,sal);
				System.out.println(updateFlag? "업데이트 성공" : "업데이트 실패");			
				System.out.println();
				break;
				
			case 5:
				System.out.print("\n 조건 급여 : ");
				sal = sc.nextInt();
				System.out.print("추가수당 : ");
				int comm = sc.nextInt();
				updateFlag = dao.updateComm(comm,sal);
				System.out.println(updateFlag ? "업데이트 성공":"업데이트 실패");
				break;
			case 6:
				System.out.println("\n***신입사원 입력***");
//				System.out.print("\n사원 번호 : ");
//				empno = sc.nextInt();
//				System.out.print("\n사원명 : ");
//				String ename = sc.next();
//				System.out.print("\n직무 : ");
//				String job = sc.next();
//				System.out.print("\n매니저 번호 : ");
//				int mgr = sc.nextInt();
//				System.out.print("\n급여 : ");
//				sal = sc.nextInt();
//				System.out.print("\n추가수당 : ");
//				comm = sc.nextInt();
//				System.out.print("\n부서번호 : ");
//				int deptno = sc.nextInt();
//				EmpDTO newDto = new EmpDTO();
//				newDto.setEmpno(empno);
//				newDto.setEname(ename);
//				newDto.setJob(job);
//				newDto.setMgr(mgr);
//				newDto.setSal(sal);
//				newDto.setComm(comm);
//				System.out.println(dao.insertEmp(newDto)? "추가 성공": "추가 실패 ");
				
				EmpDTO newDto = new EmpDTO();
				
				System.out.print("\n사원 번호 : ");
				newDto.setEmpno(sc.nextInt());
				System.out.print("\n사원명 : ");
				newDto.setEname(sc.next());
				System.out.print("\n직무 : ");
				newDto.setJob(sc.next());
				System.out.print("\n매니저 번호 : ");
				newDto.setMgr(sc.nextInt());
				System.out.print("\n급여 : ");
				newDto.setSal(sc.nextInt());
				System.out.print("\n추가수당 : ");
				newDto.setComm(sc.nextInt());
				System.out.print("\n부서번호 : ");
				newDto.setDeptno(sc.nextInt());
				System.out.println(dao.insertEmp(newDto)? "추가 성공": "추가 실패 ");
				break;
			case 7:
				
				System.out.println("\n**** 사원 삭제 **** : ");
				System.out.print("\n삭제할 사원번호 : ");
				empno = sc.nextInt();
				System.out.println(dao.deleteEmp(empno)? "삭제 성공": "삭제 실패");
				System.out.println();
				break;
			case 8:
				run =false;
				break;
				
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
		}
	}
}
