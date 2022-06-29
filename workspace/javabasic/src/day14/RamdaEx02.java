package day14;

/*

	class Test implements MyFunctionalInterface2 {
		public void method() {
			System.out.println("ehahahah");
		}
	}

	// Test t =  new Test();
*/

class UseThis {
	int outterVar = 10;
	
	class Inner {
		int innerVar = 20;
		
		void method() {
			MyFunctionalInterface2 my = () -> {
				System.out.println("outter var : " + outterVar);
				System.out.println("outter var : " + UseThis.this.outterVar);

				System.out.println("inner var : " + innerVar);
				System.out.println("inner var : " + this.innerVar);
			};
			
			my.method();
		} // method
	} // Inner class
} // UseThis class

public class RamdaEx02 {
	public static void main(String[] args) {
		
		UseThis useThis = new UseThis(); // 외부 클래스 객체 생성
		UseThis.Inner inner = useThis.new Inner(); // 외부 참조 변수로 내부 객체 생성
		
		inner.method();
	}
}
