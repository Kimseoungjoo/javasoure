package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEacgEx2 {
	public static void main(String[] args) {
		// forEach : for문을 함수적 스타일로 사용 / 요소를 하나씩 꺼내기 
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍길동",40));
		stuList.add(new Student("김태우",90));
		stuList.add(new Student("김종국",50));
		stuList.add(new Student("김윤호",80));
		
		
		// 홍길동 : 40
		for(Student student : stuList) {
			System.out.println(student.getName()+" : " +student.getJumsu());
		}
		stuList.forEach(student -> System.out.println(student.getName()+" : " +student.getJumsu()));
		
	}
}
