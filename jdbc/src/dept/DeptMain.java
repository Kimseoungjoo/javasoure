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
			System.out.println("1. ��ü �μ� ��ȸ");
			System.out.println("2. Ư�� �μ� ��ȸ");
			System.out.println("3. �μ� �߰�");
			System.out.println("4. �μ� ����");
			System.out.println("5. �μ� ����");
			System.out.println("6. ����");
			System.out.println("***************************************");
			
		System.out.print("���� >> ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			List<DeptDTO> list  = dao.getRows();
			
			System.out.println("�μ���ȣ\t�μ���\t����");
			for(DeptDTO dto : list) {
				System.out.print(dto.getDeptno()+"\t");
				System.out.print(dto.getDname()+"\t");
				System.out.print(dto.getLoc()+"\t");
				System.out.println();
			}
			
			break;
		case 2:
			System.out.print("\n��ȸ �μ� ��ȣ �Է� :");
			int deptNo = sc.nextInt();
			DeptDTO dto1 = dao.getRow(deptNo);
			System.out.println("��ȸ ������ ������ �����ϴ�.");
			System.out.println("�μ� ��ȣ : "+dto1.getDeptno());
			System.out.println("�μ��� : "+dto1.getDname());
			System.out.println("��ġ : "+dto1.getLoc());
			System.out.println();
			
			break;
		case 3:
			System.out.println("\n���ο� �μ� �߰� ");
			System.out.print("�μ� ��ȣ :");
			int newDeptno = sc.nextInt();
			System.out.print("\n�μ��� : ");
			String newDname = sc.next();
			System.out.print("\n ������ :");
			String newLoc = sc.next();
			DeptDTO dto = new DeptDTO(newDeptno,newDname,newLoc);
			System.out.println(dao.insert(dto)?"�μ� �Է� ����": "�μ� �Է� ����");
			System.out.println();
			break;
		case 4:
			
			System.out.print("\n������ �μ���ȣ �Է� : ");
			int updateDeptno = sc.nextInt();
			System.out.print("���ϴ� �μ��� �Է� : ");
			String updateDname = sc.next();
			boolean flag = dao.update(updateDname, updateDeptno);
			System.out.println(flag?"����Ϸ�":"����");
			System.out.println();
			break;
		case 5:
			System.out.print("\n������ �μ� ��ȣ : ");
			int deleteDeptno = sc.nextInt();
			boolean deleteFlag = dao.delete(deleteDeptno);
			System.out.println(deleteFlag? "�μ� ���� ����":"����");
			System.out.println();
			break;
		case 6:
			run = false;
			break;

		default:
			System.out.println("��ȣ�� Ȯ�����ּ���");
			break;
		}
		}
	}
}
