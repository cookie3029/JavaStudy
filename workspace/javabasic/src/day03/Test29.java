package day03;

public class Test29 {
	public static void main(String[] args) {

		double[] dArr = new double[5];
		dArr[0] = 1.234;
		dArr[1] = 3;
		System.out.println(dArr[1]);

		float[] fArr = new float[3];
		fArr[0] = 3.14F;

		char[] chArr = new char[5];
		chArr[0] = 'a';

		String[] strArr = new String[3];
		strArr[0] = "피카츄";
		System.out.println(strArr[0]);

		int[] score = { 10, 20, 30, 40, 50 };
		// int [] score2 = new int[] {10,20,30,40,50};

		// ArrayIndexOutOfBoundsException : 인덱스번호 잘못써서 에러생김
		// System.out.println(score[5]);

		
		// 문제: 최대값과 최소값을 구해보세요.
		int[] arr = { 79, 800, 85, 12, 4, 120, 95, 1 };

		// 최대값
		int max = arr[0]; // 최대값을 들고있을 변수 생성, 초기값은 배열 첫번째 값으로

		// 최소값
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) { // 최대값
				max = arr[i];
			} 
			
			if(arr[i] < min) { // 최소값
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);

	}
}
