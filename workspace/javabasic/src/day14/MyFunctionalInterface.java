package day14;

// 인터페이스 생성
@FunctionalInterface // 옵션 
// 써도 되고 안써도 되고,
// 중요한건 함수적 인터페이스가 되기 위해서는 추상 메서드가 1개만 있어야 함
public interface MyFunctionalInterface {

	// public void otherMethod();
	// public void method();
	
	//public void method(int x);

	public int method(int x, int y);
	
}
