package day05;

class Tv6 {
	static int x = 100;
	int a = 10;
}

public class Test58 {
	// static int a = 10;
	
	public static void main(String[] args) {
		
		Tv6 tv = new Tv6();
		
		/*
			자바 JVM이 5개 영역으로 나누어서 관리
			Class Area(Method Area) : static이 붙은 아이들이 저장되는 곳
			Stack : 지역변수 
			Heap : new ~~~
			Native Method Stack Area : C 관련 데이터 저장
			PCregister
		*/
		
		int a = 200;
		
		System.out.println(a);
		// System.out.println(Test58.a);
		
		// 지역 > 인스턴스 > 클래스
		

	}
}
