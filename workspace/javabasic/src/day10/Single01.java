package day10;

class SingleT {
	static int a = 10;
	int b = 20;
	
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance() {
		// System.out.println("getInstance : " + instance);
		return instance;
	}
	
	void func() {
		System.out.println("싱글턴턴턴!!!" + this);
	}
}

public class Single01 {
	public static void main(String[] args) {
		
		// SingleT s = new SingleT();
		SingleT s = SingleT.getInstance();
		SingleT ss = SingleT.getInstance();
		
		System.out.println(s.b);
		System.out.println(ss.b);
		System.out.println("--------");
		s.b = 1000;
		System.out.println(s.b);
		System.out.println(ss.b);
	}
}
