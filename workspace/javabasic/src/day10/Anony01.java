package day10;

interface MyInter {
	void func();
}

class Test {
	void method(MyInter inter) {}
}

	public class Anony01 {
	public static void main(String[] args) {
		
		// 바로 정의하며 객체 생성해 실행
		new MyInter() {
			@Override
			public void func() {
				System.out.println("myInter func 오버라이드");
			}
		}.func();
		
		Test t = new Test();
		t.method(new MyInter() {
			@Override
			public void func() {
				System.out.println("myInter func 오버라이드");
			}
		});
	}
}
