package day04;

import java.util.Scanner;

public class Test46 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문제1. 아래와 같은 2차원 배열 arr을 출력하는 프로그램을 작성하세요. 
		/*
			1
			1	2	3
			1
			1	2	3	4
			1	2
		*/
//		int[][] arr = { { 1 }, { 1, 2, 3 } , { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		//문제2. Scanner로 소문자 알파벳 하나 입력받고, 아래와 같이 출력하는 프로그램을 작성하세요. 
		// String.charAt(); --> char --> ascii 숫자
		/*
			소문자 알파벳하나 입력 >> 	e (사용자가 입력) 
			abcde		97 98 99 100 101
			abcd		97 98 99 100
			abc			97 98 99
			ab			97 98
			a			97
		*/

//		#1.
//		System.out.println("소문자 알파벳하나 입력 >>");
//		String alpha = sc.nextLine();
//		char ch = alpha.charAt(0);
//		
//		for(int i = ch; i >= 97; i--) {
//			for(int j = 97; j <= i; j++) {
//				System.out.print((char)j);
//			}
//			System.out.println();
//		}
		
//		#2.		
//		System.out.print("입력 >> ");
//		char c = (sc.nextLine()).charAt(0);
//		
//		for(int i = 97; i <= c; i++) {
//			for(int j = 0; j <= c - i; j++) {
//				System.out.print((char)(j + 97));
//			}
//			System.out.println();
//		}
		
		//문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램을 작성하세요. 

//		#1.
//		int [] n = new int[10];
//		for(int i = 0; i < n.length; i++) {
//			n[i] = Integer.parseInt(sc.nextLine());
//		}
//		
//		for(int i = 0; i < n.length; i++) {
//			if(n[i] % 3 == 0) {
//				System.out.println(n[i]);
//			}
//		}
		
//		#2.		
//		int[] val = new int[10];
//		
//		for(int i = 0; i < val.length; i++) {
//			System.out.print((i + 1) + "번 입력 : ");
//			val[i] = Integer.parseInt(sc.nextLine());
//		}
//		
//		for(int i = 0; i < val.length; i++) {
//			if(val[i] % 3 == 0) {
//				System.out.print(val[i] + " ");
//			}
//		}
//		System.out.println();
		
		
		//문제4. 4x4의 2차원 배열(총16개방)을 만들고, 1 ~ 10까지 범위의 정수를 10개만 
		//		랜덤하게 생성하여 임의의 위치에 삽입하세요. 
		//		동일한 정수가 있어도 상관 없으며, 나머지 6개의 숫자는 모두 0으로 만들고 
		//		4 x 4 형태로 출력해보세요.
		/*
				예) 
				3	0	7	2
				1	7	0	4
				0	6	4	5
				0	8	0	0
		*/
		
		int [][] board = new int[4][4];
		int [] randNums = new int[10];	// 임의의 정수 10개 받아놓을 배열

		// board를 0으로 초기화
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		
		// 10개 랜덤 받기
		for(int i = 0; i < randNums.length; i++) { 
			randNums[i] = (int)(Math.random() * 10) + 1;
		}
		
		// 임의의 방에 랜덤 받아놓은 수 넣기. 중복되면 안됨
		for(int i = 0; i < randNums.length; i++) {
			int x = (int)(Math.random() * 4);
			int y = (int)(Math.random() * 4);
			
			if(board[x][y] != 0) { // 이미 한번 뽑혔던 방 -> for문 횟차 다시
				i--;
			} else { // 방에 0이 들어있으면 중복X 잘 뽑은 랜덤방이므로
				board[x][y] = randNums[i]; // 랜덤값으로 방에 넣기
			}
			// System.out.println(i);
		}
		
		// 출력
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "   ");
			}
			System.out.println();
		}
		
//		#2.
//		int[][] arr16 = new int[4][4];
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
//				arr16[i][j] = 0;
//			}
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			int num = (int)(Math.random() * 10) + 1;
//			
//			int x = (int)(Math.random() * 4);
//			int y = (int)(Math.random() * 4);
//			
//			if(arr16[x][y] == 0) {
//				arr16[x][y] = num;
//			} else {
//				i--;
//			}
//		}
//		
//		for(int arr[]: arr16) {
//			for(int val : arr) {
//				System.out.print(val + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}
}
