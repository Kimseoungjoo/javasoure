package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEacgEx2 {
	public static void main(String[] args) {
		// forEach : for���� �Լ��� ��Ÿ�Ϸ� ��� / ��Ҹ� �ϳ��� ������ 
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ȫ�浿",40));
		stuList.add(new Student("���¿�",90));
		stuList.add(new Student("������",50));
		stuList.add(new Student("����ȣ",80));
		
		
		// ȫ�浿 : 40
		for(Student student : stuList) {
			System.out.println(student.getName()+" : " +student.getJumsu());
		}
		stuList.forEach(student -> System.out.println(student.getName()+" : " +student.getJumsu()));
		
	}
}
