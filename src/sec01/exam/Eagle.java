package sec01.exam;

public class Eagle implements Animal {

	@Override
	public void move() {
		System.out.println("두 날개로 날라간다.");
	}

	@Override
	public void cry() {
		System.out.println("독수리 울음");
	}

	@Override
	public void eat() {
		System.out.println("사냥해서 먹는다.");
	}
  
	

}
