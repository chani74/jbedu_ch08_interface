package sec01.exam04;

public interface RemoteControl { //인터페이스 -> 인스턴스(객체)로 만들 수 없음
	// 필드 x 
	// const
	public int MAX_VOLUME	= 10;  // 초기값 없는 필드 선언 에러
	public int MIN_VOLUME	= 0;	// 상수만 선언 가능
	
	// 생성자 x -> 필드가 없으니 생성자도 의미가 없다.
	
	// method => 일반 메서드 생성 불가 
	// abstrac method  => 추상 메서드만 가능
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

// 인터페이스 특징
//1 .인스턴스(객체) 생성 불가능( new 연산자 사용 x ) -> 상속 전용
// 2. 상수만 선언가능
// 3. 추상 메소드 만 선언 가능