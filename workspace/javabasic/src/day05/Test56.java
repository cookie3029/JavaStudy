package day05;

/*
	클래스 기본형 변수 : static키워드. 클래스명.변수명
	클래스 참조형 변수

	인스턴스 기본형 변수 : new로 객체생성해서 참조변수명.변수명
	인스턴스 참조형 변수
	
	지역 기본형 변수 : 메서드안, 메서드가 끝나면 없어진다.
	지역 참조형 변수
*/
class Tv3 {
	boolean power = false;
	int ch = 1, vol = 0;
}

public class Test56 {
	// 클래스 영역
	static int a;		// Test56.a
	static Test56 test; // Test56.test
	static Tv3 tv = new Tv3();		// Test56.tv
	
	int x;
	Tv3 tv3;
	// 메모리 무한로딩 : 자신의 클래스로 인스턴스 객체 생성(new)할 때 발생.
	// Test56 test56 = new Test56();
	Test56 z = null;
	
	public static void main(String[] args) {

		// System.out.println(new Test56().test56);
		Test56 testtt = new Test56(); // 인스턴스변수 z를 사용하기 위해 객체 생성
		testtt.z = new Test56();	// z가 객체생성이 되지 않아 안에 들은 x를 꺼낼 수가 없다.
		System.out.println(testtt.z.x);
		
		
		
		
		
	}
}
