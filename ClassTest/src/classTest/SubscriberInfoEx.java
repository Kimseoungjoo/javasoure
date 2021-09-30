package classTest;

public class SubscriberInfoEx {
	public static void main(String[] args) {

		SubscriberInfo subscriberInfo = new SubscriberInfo("홍길동", "hong", "asd12");
		subscriberInfo.setPassword("2321");
		
		// 홍길동 전화번호 추가 
		subscriberInfo.setTel("010-4243-2321");
		subscriberInfo.print();
		
		SubscriberInfo subscriberInfo2 = new SubscriberInfo("춘향이", "chun",
				                                    "asd123", "010-123-4212","seoul");
		subscriberInfo2.setAddr("서울시 성동구");
		
		subscriberInfo2.print();
		
		
		
	
	}
}
