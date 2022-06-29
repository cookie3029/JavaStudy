package day02;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// *연산자문제*
//		// 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력하세요.
//		System.out.print("입력1:");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.print("입력2:");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("몫 : " + (num1 / num2) + " / 나머지 : " + (num1 % num2));

//		// 문제2. 일수(day)를 입력받고, 몇개월 몇일인지 출력
//		//			단, 한달을 30일 고정
//		System.out.print("일수 입력 : ");
//		int day = Integer.parseInt(sc.nextLine());
//		
//		System.out.println((day / 30) + "개월 " + (day % 30) + "일");

//		// 문제3. 점수 3개를 입력받고, 총점과 평균을 출력하세요.
//		System.out.print("점수 입력1 : ");
//		int sco1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("점수 입력2 : ");
//		int sco2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("점수 입력3 : ");
//		int sco3 = Integer.parseInt(sc.nextLine());
//		
//		int total = sco1 + sco2 + sco3; // 총점
//		
//		System.out.println("총점 : " + total);
//		System.out.println("평균 : " + total / 3.0);

		// *if문 문제*
//		// 문제4. 숫자 하나를 입력받고, "음수"인지 "양수"인지 출력하세요.
//		System.out.print("숫자 입력>>");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		if(num > 0) {
//			System.out.println("양수");
//		} else if(num < 0) {
//			System.out.println("음수");			
//		}
//		else {
//			System.out.println("0입니다.");
//		}

//		// 문제4. 1 ~ 99 사이 숫자를 입력받고, "짝수"인지 "홀수"인지 출력해보세요.
//		System.out.println("1 ~ 99 사이 숫자 입력 : ");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}

//		// 문제6. 정수 3개를 입력받고, 가장 큰 수를 출력하세요.
//		System.out.print("입력1:");
//		int num1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("입력2:");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("입력3:");
//		int num3 = Integer.parseInt(sc.nextLine());
//	
//		if (num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}
		
//		if(num1 > num2) {
//			if(num1 > num3) {
//				System.out.println("가장큰수 : " + num1);
//			} else {
//				System.out.println("가장큰수 : " + num3);
//			}
//		} else {
//			if(num2 > num3) {
//				System.out.println("가장큰수 : " + num2);
//			} else {
//				System.out.println("가장큰수 : " + num3);				
//			}
//		}

		// 문제7. 2차원 평면에서 직사각형은 왼쪽 모서리와 오른쪽 하단 모서리
		// 		두점으로 표현한다. (왼쪽 위가 0,0)
		//		(100, 100)과 (200,200)의 두점으로 이루어진 사각형이 있을때,
		//		Scanner를 이용해 정수 x,y 값을 입력받고,
		//		점(x, y)가 이 직사각형 안에 있는지 판단하는 프로그램을 만드세요.
//		System.out.print("x 입력 : ");
//		int x = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("y 입력 : ");
//		int y = Integer.parseInt(sc.nextLine());
//		
//		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
//			System.out.println("(" + x + "," + y + ")는 사각형 안에 있다.");
//		} else {
//			System.out.println("(" + x + "," + y + ")는 사각형 안에 없다.");
//		}

		// * 추가문제 *
		// if 문제
		// 문제8. 369게임. 1~99까지 정수를 입력받고,
		// 		정수에 3, 6, 9중 하나가 있는 경우 "박수짝"을 출력
		// 		두개 있는 경우 "박수 짝짝"을 출력해보세요.
		// 힌트1.
		// String str = "abc";
		// char ch = str.charAt(0); ch ==> a
		// ch = str.charAt(2); ch ==> c
		// 힌트2.
		// int len = str.length(); len ==> 3		
//		System.out.print("정수 입력 : ");
//		String strNum = sc.nextLine();
//		int strLen = strNum.length();
//		
//		if (strLen == 2) {
//			int num1 = (int)strNum.charAt(0);
//			int num2 = (int)strNum.charAt(1);
//
//			if ((num1 % 3 == 0) && (num2 % 3 == 0)) {
//				System.out.println("박수 짝짝");
//			}
//		} else if (strLen == 1 && strNum.charAt(0) != 0) {
//			int num1 = (int)strNum.charAt(0);
//
//			if (num1 % 3 == 0) {
//				System.out.println("박수 짝");
//			}
//		} else {
//			System.out.println("1부터 99까지 숫자를 입력하세요");
//		}

		// switch문제
		// 문제9. 정수를 입력받아 3~5는 "봄",
		// 6~8은 "여름", 9~11은 "가을", 12~2는 "겨울을 출력.
		// 그 외 다른수는 "잘못입력" 출력.
//		System.out.print("정수 입력:");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		switch(num) {
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		case 12: case 1: case 2:
//			System.out.println("겨울");
//			break;
//		}
		
		// 문제10. 성적을 입력받고 90~100 "수", 80~89 "우",
		// 70~79 "미", 60~69 "양", 그 이하는 "가" 출력
//		System.out.print("성적 입력 : ");
//		int score = Integer.parseInt(sc.nextLine());
//		
//		switch(score / 10) {
//		case 9: case 10:
//			System.out.println("수");
//			break;
//		case 8:
//			System.out.println("우");
//			break;
//		case 7:
//			System.out.println("미");
//			break;
//		case 6:
//			System.out.println("양");
//			break;
//		default:
//			System.out.println("가");
//		}
		
		
		// 문제11. 숫자 두개와 사칙연산기호중 하나를 입력받아,
		// 입력받은 값들의 사칙연산 결과를 출력하세요.
//		System.out.print("숫자 입력1 : ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("숫자 입력2 : ");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		System.out.print("기호 입력 : ");
//		char op = (sc.nextLine()).charAt(0);
//		
//		switch(op) {
//		case '+':
//			System.out.println("연산 결과 : " + (num1 + num2));
//			break;
//		case '-':
//			System.out.println("연산 결과 : " + (num1 - num2));
//			break;
//		case '/':
//			System.out.println("연산 결과 : " + (num1 / num2));
//			break;
//		case '%':
//			System.out.println("연산 결과 : " + (num1 % num2));
//		}
		
		sc.close();

	}
}
