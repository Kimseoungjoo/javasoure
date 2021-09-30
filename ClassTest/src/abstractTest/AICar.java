package abstractTest;

public class AICar extends Car {

	public AICar(String color) {
		super(color);
	}

	@Override
	void drive() {
		System.out.println("ÀÚÀ²ÁÖÇà");
	}

	@Override
	void stop() {
		System.out.println("ÀÚµ¿¸ØÃã");
	}

}
