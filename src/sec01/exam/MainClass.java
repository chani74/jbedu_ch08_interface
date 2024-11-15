package sec01.exam;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		
		Dog dog = new Dog();  // 인스턴스화 가능 ( 메모리에 객체 생성 가능 )
		animal = dog;	// 인터페이스 변수에 자식 클래스로 만든 구현 객체 대입
		Eagle eagle = new Eagle();
		animal = eagle;	// 인터페이스 변수에 자식 클래스로 만든 구현 객체 대입
		
		BlackEagle blackEagle = new BlackEagle();
		animal = blackEagle;
		
		animal.cry();
		
		// 부모는 자식의 모든 것을 받아준다.
		Pudel	pudel = new Pudel();
		dog = pudel;
		
		// 자식은 부모의 객체를 모두 받아주지 않는다. - 강제 형변환이 필요하다.
		pudel = (Pudel) dog;
		
		animal = dog;
		dog = (Dog) animal;
		
	}

}
