package classTest;

public class TV2 {
	//�Ӽ� ( �ʵ� ) : ���� / ä�� / ��������
		String color; // red,black
		boolean power;              // on, off
		int channel;
		//���� ( �޼ҵ� ) : ä�� �����ϴ� / ������ Ű�� / ����

		
		//������
		TV2(){
			//Default(�⺻) ������
			//��������� �����ڰ� �ϳ��� ��������ʾҴٸ� �����Ϸ��� �ڵ����θ����.
			System.out.println(color+" "+channel);
		}
		TV2(String color, int channel) { // �����ε� (������ 2���̻�)
										 // ���� �޼ҵ忡�� �⺻���� �ֱ�����
			this.color = color;
			this.channel = channel;
			System.out.println(color+" "+channel);
		}
		void channelUp() {
			//channelUp �� �ؾ� �ϴ� �۾� �ۼ� (����ä��(7) > 6 
			channel++;
		}
		
		void channelDown()	{
			//channelDown �� �ؾ� �ϴ� �۾� �ۼ�
			channel--;
			
		}
		
		void power () {
			//power �� �ؾ� �ϴ� �۾� �ۼ�
			power = !power;
		}
		
		
}
