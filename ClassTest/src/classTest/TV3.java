package classTest;

public class TV3 {
	//�Ӽ� ( �ʵ� ) : ���� / ä�� / ��������
		private String color;
		private boolean power;
		private int channel;
		

		
		public String getColor() {
			return color;
		}
		public boolean isPower() {
			return power;
		}
		public int getChannel() {
			return channel;
		}
		public TV3(String color, boolean power, int channel) {
			super();
			this.color = color;
			this.power = power;
			this.channel = channel;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		public void setChannel(int channel) {
			this.channel = channel;
		}
		//������
		TV3(){
			//Default(�⺻) ������
			//��������� �����ڰ� �ϳ��� ��������ʾҴٸ� �����Ϸ��� �ڵ����θ����.
			System.out.println(color+" "+channel);
		}
		TV3(String color, int channel) { // �����ε� (������ 2���̻�)
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
