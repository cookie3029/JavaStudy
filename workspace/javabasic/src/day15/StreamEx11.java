package day15;

import java.util.Arrays;

public class StreamEx11 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int sum = Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);

		long count = Arrays.stream(arr).count();
		System.out.println("count : " + count);

		// OptionalXXX 타입으로 리턴받는 메서드는
		// 이 객체의 값을 얻기 위해
		// 뒤에 get(), getAsDouble(), getAsInt(), getAsLong()
		// 메서드를 호출해 받을 수 있다.
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("max : " + max);

		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("min : " + min);

		int findFirst = Arrays.stream(arr).filter(n -> n % 3 == 0).findFirst().getAsInt();
		
		System.out.println("first : " + findFirst);
	}
}
