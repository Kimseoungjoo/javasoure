package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		
//��ü ������ ������ �ڵ�ȣ��
		Car2 car = new Car2();// �ν��Ͻ�ȭ (car:�ν��Ͻ�)
		//�⺻ �Ӽ� ���� String >null,
						//int >0,boolean> false,
						//double > 0.0
		
		
		//�ι�°��
		Car2 car2 = new Car2("kona");
		
		//����° ��
		Car2 car3 = new Car2("kona","black");
		
		//�׹�° ��
		Car2 car4 = new Car2("����","kona","black", 250);
		
		
//		car.company = "����";
//		car.model = "ĳ����";
//		car.color = "red";
//		car.maxSpeed = 200;
		
		car.forward();
		
		
//��ü ������ ������ �ڵ�ȣ��
//field Car2.company is not visible
//		car2.company = "����";
//		car2.model = "��Ÿ��";
//		car2.color = "black";
//		car2.maxSpeed = 250;
		
		car.forward();
		
		
		
		
		
	}
}
