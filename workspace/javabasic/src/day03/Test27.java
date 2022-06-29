package day03;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {

		// 중첩 반복, 2중 for문
//		for(int i = 0; i <= 3; i++) {
//			for(int j = 0; j <= 3; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
		/*
			// 문제1. 구구단 2단 출력
			// 		2 * 1 = 2
			//		2 * 2 = 4
			// 		2 * 3 = 6
			//		2 * 4 = 8
			//		2 * 9 = 18
			for(int i = 1; i <= 9; i++) {
				System.out.println("2 * " + i + " = " + (2 * i));
			}
	
			// 문제2. 구구단의 단수를 입력받아, 해당 단을 출력
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원하는 구구단 단수 입력 >> ");
			int dan = Integer.parseInt(sc.nextLine());
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
	
			sc.close();
		
			// 문제3. 구구단 전체 출력
			for (int dan = 1; dan <= 9; dan++) {
				System.out.println("**** " + dan + "단 ****");
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
				System.out.println();
			}
	
			// 문제3-1. 구구단 전체 출력
			// 1단 2단 3단
			// 1 * 1 = 1 2 * 1 = 2 3 * 1 = 3
			// ...
			// 4단 5단 6단\
			// .....
			// 7단 8단 9단\
			// ....
		*/
		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (j == 1 && i == 1) {
//					for (int k = 1; k <= 9; k++) {
//						System.out.print("   " + k + "단\t\t");
//					}
//					System.out.println();
//				}
//				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//			}
//			System.out.println();
//		}
		
		// 문제4. 별찍기
		/*
			*
		 	**
		 	***
		 	****
		*/
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

	}

}
