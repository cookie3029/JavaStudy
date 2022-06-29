package day05;

class Tv2 {
	// static int x = y; // x가 만들어질 시점에는 y가 아직 존재하지 않는다.
	// int y = 20;
	
	static int x = 100;
	int y = x;
}

public class Test55 {
	static int a = 100;
	int i = 20;
	
	public static void main(String[] args) {
		
		System.out.println(Test55.a);
		// 인스턴스 참조형
		Test55 test;
		
		
		// Test55 tt = new Test55();
		// System.out.println(tt.i);
		
		// 1회성으로 사용 할때 가능 (잘 사용하지 않지만 알아두기)
		System.out.println(new Test55().i);
		
		System.out.println(Tv2.x);
		Tv2 t = new Tv2();
		System.out.println(t.y);
		
		
		
		
	}
}
