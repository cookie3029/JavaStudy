package day11;

public class Api03 {
	public static void main(String[] args) {

		// String
		String a = new String("Hello");
		String b = new String("Hello");

		// System.out.println(a == b); // false 주소 비교
		// System.out.println(a.equals(b));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		// 리터럴 방식
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2); // true 주소 비교 (문자열 비교로 사용하지 않음)
		System.out.println(str1.equals(str2)); // 문자열 비교 (사용!!!!!!)
		
		System.out.println(System.identityHashCode("abc"));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}
