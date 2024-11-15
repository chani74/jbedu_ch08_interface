package sec01.exam;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("네발로 움직인다.");
	}

	@Override
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public void eat() {
		System.out.println("강아지 사료를 먹는다.");
	}

}
