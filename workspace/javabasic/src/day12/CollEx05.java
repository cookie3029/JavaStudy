package day12;

import java.util.HashMap;
import java.util.Scanner;

/*
	"그만"이 입력될때까지 나라이름과 인구를 입력받아 저장하고,
	다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 
	HashMap<String, Integer> nations = new HashMap<String, Integer>(); 여기에 저장. 
	실행예시:
		나라 이름과 인구를 입력하세요 (예 : Korea 5000). 
		나라이름, 인구 >>  Korea 5000  (<- 사용자 입력) 
		나라이름, 인구 >>  USA 100000
		나라이름, 인구 >>  Swiss 2000
		나라이름, 인구 >>  France 3000
		나라이름, 인구 >>  그만 
		인구 검색 >>  France
		France의 인구는 3000
		인구 검색 >> 스위스 
		스위스 나라는 없습니다. 
		인구 검색 >> 그만 
		프로그램 종료!!!
*/
public class CollEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 입력하세요 (예 : Korea 5000).");
		
		while(true) {
			System.out.print("나라이름, 인구 >> ");
			String nation = sc.next();
			
			if(nation.equals("그만")) {
				sc.nextLine();
				
				while(true) {				
					System.out.print("인구 검색 >> ");
					String nation2 = sc.nextLine();
					
					if(nation2.equals("그만")) {
						System.out.println("프로그램 종료!!!");
						return;					
					}
					
					if(nations.containsKey(nation2)) {
						System.out.println(nation2 + "의 인구는 " + nations.get(nation2));
					} else {
						System.out.println(nation2 + " 나라는 없습니다.");
					}
					System.out.println();
				}
			} else {
				int population = Integer.parseInt(sc.next());
				nations.put(nation, population);
			}
			
			sc.close();
		}

}}
