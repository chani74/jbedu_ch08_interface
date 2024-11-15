package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.flTire = new KumhoTire();
		myCar.frTire = new KumhoTire();
		
		myCar.run();
	}

}
