package day02;

public class Test11 {

	public static void main(String[] args) {

		// 문제1. 결과를 먼저 주석으로 작성해보고 실행해서 확인
		int i = 5, j = 5;
		System.out.println(i++); // 5 ==> i = 6
		System.out.println(++j); // 6
		System.out.println("i=" + i + ", j=" + j); // i=6, j=6

		// 문제2.
		int k = 10;
		System.out.println(k++); 	// 10 11
		System.out.println(++k); 	// 12 12
		++k; 						// 13
		System.out.println(++k); 	// 14 14
		System.out.println(k++); 	// 14 15
		System.out.println(k); 		// 15

		// 문제3.
		int a = 10;
		int b = 10;			//			a	b
		int r = ++a + ++b;	// r = 22   11	11
		r = ++a + b++;		// r = 23 	12	12
		r = ++a + a;		// r = 26 	13
		r = ++a + a++;		// r = 28 	15
		r = ++a + ++a;		// r = 33 	17
		
		System.out.println(r);
		
	}

}
