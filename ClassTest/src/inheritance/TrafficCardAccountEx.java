package inheritance;

public class TrafficCardAccountEx {

	public static void main(String[] args) {
		TrafficCardAccount traffic = new TrafficCardAccount("122-14",
				"ȫ�浿", 10000, "3333-44", true);
		System.out.println("���� �ܾ� : "+traffic.trafficPay("3333-44", 
				1800));
		
		
		
	}

}
