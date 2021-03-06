package day12;
/*
	CollEx10번 문제를 HashMap을 이용하여 작성하세요. 
	key는 나라이름, value는 수도입니다. 
*/

import java.util.HashMap;
import java.util.Scanner;

class CapitalGame2 {
	public void run() {
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> h = new HashMap<String, String>();
		
		System.out.println("** 수도 맞추기 게임을 시작합니다 **");
		System.out.println("현재 " + h.size() + "개의 나라와 수도가 입력되어 있습니다.");
		
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("나라와 수도 입력 " + (h.size() + 1) + ">> ");
				String nation = sc.next();
				String capital = sc.next();
				
				if(h.containsKey(nation)) {
					System.out.println("이미 입력된 나라입니다!!!");
					continue;
				}
				
				h.put(nation, capital);
			} else if (num == 2) {
								
				Object[] nations = h.keySet().toArray();
				
				while(true) {
					int questionNum = (int)(Math.random() * h.size());
					
					System.out.print(h.get(((String)nations[questionNum]) + "의 수도는? "));
					String answer = sc.next();
					
					if(answer.equals("그만")) {
						break;
					}
				
					if(answer.equals(h.get((String)nations[questionNum]))) {
						System.out.println("정답!!!");
					} else {
						System.out.println("아닙니다!!");
					}
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}

public class CollEx11 {
	public static void main(String[] args) {

		// main 작성 완료, 주석 해제하고 실행 
		CapitalGame2 game = new CapitalGame2(); 
		game.run(); 
	}
}
