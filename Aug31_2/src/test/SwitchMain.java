package test;
//Switch �Լ�
/*switch(int,double,float,char,String,enum ,����)
 *   case ��1:
 *   �ؾ��� ��;
 *   break;
 *   case ��2:
 *   �ؾ��� ��;
 *   break;
 *   default:
 *   �ؾ��� ��;
 *   *****if ��ü��밡��*********
 * */
public class SwitchMain {
	public static void main(String[] args) {
		//�ֻ��� ����� ���� 6 
		
		// 1~6������ ���� �ڵ����� �����ϰ� ���ִ� random�Լ�(math�� ����)
		int dice = (int)(Math.random()*6)+1; //Math.random() > 0.0 ~ 1.0 � �Ǽ� ���� �ҷ��ش�.
										//�Ҽ����� �������� ó���ȴ�
										//1�� ���ϴ� ������ 1���� �̸��� ���� �����⶧���� 6�� �ȳ��´� ^^
			/*
			 *  if (dice==1) {
			 *   System.out.println("���� 1 ����");
			 *    }else if (dice==2) {
			 * 		System.out.println("���� 2 ����"); 
			 * }else if (dice==3) {
			 * 		System.out.println("���� 3 ����"); 
			 * }else if (dice==4) {
			 * 		System.out.println("���� 4 ����");
			 *  }else if (dice==5) {
			 * 			System.out.println("���� 5 ����"); 
			 * }else{ 
			 * 		System.out.println("���� 6����");
			 *  }
			 */
		switch (dice) {
		case 1:
			System.out.println("�ֻ��� 1�� ���Խ��ϴ�");
			break;
		case 2:
			System.out.println("�ֻ��� 2�� ���Խ��ϴ�");
			break;
		case 3:
			System.out.println("�ֻ��� 3�� ���Խ��ϴ�");
			break;
		case 4:
			System.out.println("�ֻ��� 4�� ���Խ��ϴ�");
			break;
		case 5:
			System.out.println("�ֻ��� 5�� ���Խ��ϴ�");
			break;
		default:
			System.out.println("�ֻ��� 6�� ���Խ��ϴ�");
			break;
		}
		System.out.println(dice);
	}
}
