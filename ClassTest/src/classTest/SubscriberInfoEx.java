package classTest;

public class SubscriberInfoEx {
	public static void main(String[] args) {

		SubscriberInfo subscriberInfo = new SubscriberInfo("ȫ�浿", "hong", "asd12");
		subscriberInfo.setPassword("2321");
		
		// ȫ�浿 ��ȭ��ȣ �߰� 
		subscriberInfo.setTel("010-4243-2321");
		subscriberInfo.print();
		
		SubscriberInfo subscriberInfo2 = new SubscriberInfo("������", "chun",
				                                    "asd123", "010-123-4212","seoul");
		subscriberInfo2.setAddr("����� ������");
		
		subscriberInfo2.print();
		
		
		
	
	}
}
