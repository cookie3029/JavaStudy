package day04;

import java.util.Scanner;

public class Test45 {
	public static void main(String[] args) {

		/*	
			문제1. Up & Down 게임 
				0 ~ 99 사이의 임의의 수(랜덤값)를 받아 숨기고, 그 수를 맞추는 게임. 
				임의의 수보다 낮게 입력하면 "Up" 출력, 
				높게 입력하면 "Down" 출력하면서 범위를 좁혀가며 수를 맞춘다. 
				게임을 반복하기 위해 y/n으로 묻고, n인 경우 프로그램 종료 
				
			콘솔예) 
				숫자가 정해졌습니다. 맞춰보세요! 
				0~99
				1 >>	55 (사용자가 입력) 
				"Up"
				55~99
				2 >>	70
				"Up"
				70~99
				3 >>	85
				"Down"
				70~85
				4 >>	80
				"Down"
				70~80
				5 >>	75
				"Up"
				75~80
				6 >>	77
				맞았습니다!! 
				다시하시겠습니까?(y/n) >>	y 
				숫자가 정해졌습니다. 맞춰보세요!
				0~99
				1 >>	30
				"Up"
				30~99
				2 >>	45
				맞았습니다!!
				다시하시겠습니까?(y/n) >> 	n
				게임 종료!	
		*/
		
		Scanner sc = new Scanner(System.in);
		
//		#1.
//		int num = -1, cnt = 1;
//		int low = 0, high = 99;
//		
//		while(true) {
//			if(num == -1) {
//				num = (int)(Math.random() * 100);
//				System.out.println("숫자가 정해졌습니다. 맞춰보세요");
//			}
//			
//			System.out.println(low + "~" + high);
//			System.out.print(cnt + " >>\t");
//			
//			int pickNum = Integer.parseInt(sc.nextLine());
//			
//			if(pickNum == num) {
//				num = -1;
//				
//				System.out.println("맞았습니다!!"); 
//				System.out.print("다시하시겠습니까?(y/n) >>\t"); 
//				
//				if((sc.nextLine()).equalsIgnoreCase("n")) {
//					System.out.println("게임 종료!");	
//					break;
//				};
//				
//			} else if(pickNum < num) {
//				System.out.println("Up");
//				low = pickNum;
//			} else {
//				System.out.println("down");
//				high = pickNum;
//			}
//			
//			cnt++;
//		}

		boolean play = true;
		while(play) {
			// 임의의 숫자를 생성하고
			int num = (int)(Math.random() * 100); // 0 ~ 99 사이 난수
			int guess = -1; // 사용자가 추측하는 숫자 입력받을 변수
			int low = 0; 	// 낮은 범위값 변수
			int high = 99;	// 높은 범위값 변수
			int count = 1;
			
			// 맞추기 게임 진행
			System.out.println("숫자가 정해졌습니다. 맞춰보세요!");
			
			while(true) {		
				// 맞췄으면 다시 할 것인지 물어보기 
				// -> y = 다시 반복, n = while문 종료 play = false 처리
				if(guess == num) {
					System.out.println("맞췄습니다!!");
					System.out.println("다시 하시겠습니까?");
					String answer = sc.nextLine();
					
					if(answer.equalsIgnoreCase("n")) { // 대소문자 상관없이 비교
						System.out.println("게임 종료!!!");
						play = false;	// 겉에 있는 전체 게임 회전 종료
						break; // 가까운 while true (범위 추측 while문 종료)
					} else if(answer.equalsIgnoreCase("y")) {
						play = true;
						break;	// 게임 다시 시작하더라도, 추측했던 반복은 종료
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
				
				System.out.println(low + "~" + high); // 범위 출력
				System.out.println(count + " >>");
				
				guess = Integer.parseInt(sc.nextLine());
				count++;
				
				if(guess < num) {
					System.out.println("Up");
					low = guess; // 낮은 범위가 변경
				}
				
				if(guess > num) {
					System.out.println("Down");
					high = guess; // 높은 범위가 변경
				}
			}
 			sc.close();		
		}
	}
}
