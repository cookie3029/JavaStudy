package day12;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest02 {
	public static void main(String[] args) {
		
		// 영한 사전 만들기
		// HashMap을 이용하여 10개의 단어를 영어, 한글의 쌓으로 저장하고
		// 입력받은 영어의 한글 뜻을 출력해주는 프로그램을 만들어 보세요.
		// 10개 단어는 미리 저장해놓고,
		// exit를 입력할 때까지 계속 영단어를 입력받아 검색할 수 있게 만드세요.
		// 찾는 단어가 없으면 "찾는 단어가 없습니다.." 이런 메세지 출력.
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");
		h.put("pear", "배");
		h.put("banana", "바나나");
		h.put("mandarine", "귤");
		h.put("kiwi", "키위");
		h.put("grape", "포도");
		h.put("melon", "멜론");
		
		while(true) {
			System.out.print("찾고 싶은 단어>> ");
			String eng = sc.nextLine();
			
			if(eng.equals("exit")) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
			
			String kor = h.get(eng);
			
			if(kor == null) {
				System.out.println(eng + "는 없는 단어 잆니다.");
			} else {
				System.out.print("검색 결과 : " + h.get(eng) + "\n");				
			}
			
			/*
				if(h.containsKey(eng)) {
					System.out.print("검색 결과 : " + h.get(eng) + "\n");
				} else {
					System.out.println("찾는 단어가 없습니다..");
				}
				System.out.println();
			*/
		}
	}
}
