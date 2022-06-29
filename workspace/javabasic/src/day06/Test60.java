package day06;

class TestA {
	
	// 인스턴스 변수에 자기 자신 타입으로 객체 생성하면 안된다!!!!!
	// TestA atest = new TestA();
	
	int a; // 인스턴스 변수 -> 객체 생성 후 사용 가능
	static int b;
	Test60 t;
	static String abc;
	void test() {
		int def;
		// static int st; 불가능
	}
}

public class Test60 {
	public static void main(String[] args) {
		
		TestA aaa = new TestA();
		System.out.println(aaa.a);
		System.out.println(TestA.b);
		
	}
}
