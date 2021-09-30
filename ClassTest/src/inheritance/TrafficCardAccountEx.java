package inheritance;

public class TrafficCardAccountEx {

	public static void main(String[] args) {
		TrafficCardAccount traffic = new TrafficCardAccount("122-14",
				"È«±æµ¿", 10000, "3333-44", true);
		System.out.println("ÇöÀç ÀÜ¾× : "+traffic.trafficPay("3333-44", 
				1800));
		
		
		
	}

}
