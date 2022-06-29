package day07;

import java.util.Scanner;

/*
	n명이 참가하는 끝말잇기 게임을 만드세요. 
	처음 단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료 

	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성. 
	WordGameApp : 게임을 전체적으로 진행하는 run(), 
				run()에서 플레이어수 만큼 Player객체 배열 생성
	Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 
	 		끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 

	# tip : 문자열중 첫번째 문자 알아내는 방법은 String클래스의 charAt(0); 사용 
	String word = "자동차"; 
	char firstChar = word.charAt(0);
*/

class Player {
	private String name;
	private String inputWord = "";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getWordFromUser(Scanner sc) { // 단어 입력받기
		// Scanner sc = new Scanner(System.in);
		System.out.print(name + ">> ");
		inputWord = sc.nextLine();
		
		return inputWord;
	}
	
	boolean checkSuccess(String lastWord) { // 입력받은 단어 첫 글자와 이전 단어의 마지막 글자가 일치하는지 검사
		boolean check = false;
		
		int lastIdx = lastWord.length() - 1;
		
		char lastChar = lastWord.charAt(lastIdx);
		char firstChar = inputWord.charAt(0);
		
		if(lastChar == firstChar) {
			check = true;
		}
		
		return check;
	}
}

class WordGameApp {
	private String startWord = "자동차";
	int num = 0;
	Player [] p;
	Scanner sc;
	
	WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	public void createPlayers() {
		// 게임 시작 세팅
		
		System.out.print("게임에 참가하는 인원>> ");
		num = Integer.parseInt(sc.nextLine());
		p = new Player[num];
		
		for(int i = 0; i < num; i++) {
			p[i] = new Player();
			
			System.out.println("참가자 이름 입력>>");
			p[i].setName(sc.nextLine()); // 참가자 이름 입력받아 객체 배열안 변수에 저장
		}
	}
	
	public void finish() { // 프로그램 종료시 처리해줄 코드 작성으로 활용
		sc.close();
	}
	
	public void run() {
		System.out.println("끝말잇기 게임 시작!!!");
		
		createPlayers();
		
		// 게임 진행
		String lastWord = startWord;
		System.out.println("시작 단어는 " + startWord + "입니다.");
		
		int idx = 0; // while문 안에서 인덱스번호로 사용할 변수 미리 선언
		
		while(true) {
			String newWord = p[idx].getWordFromUser(sc); // 새로 입력 받은 것

			if(!p[idx].checkSuccess(lastWord)) {	// 이전단어주면서 새단어랑 비교해~~~
				System.out.println("게임오버! " + p[idx].getName() + "님이 졌습니다.");
				finish();
				break;
			}
			
			lastWord = newWord;
			idx++;
			
			idx %= p.length; // 0 1 2 0 1 2....
		}
	}
}

//class Player {
//	private String name;
//	private String word;
//	private Scanner sc;
//	
//	Player(String name) {
//		this.name = name;
//		sc = new Scanner(System.in);
//	}
//	
//	public void getWordFromUser() {
//		System.out.println(name + "님 차례입니다.");
//		System.out.print("단어 입력>> ");
//		word = sc.nextLine();
//		
//		System.out.println();
//	}
//	
//	public boolean checkSuccess(String prev_word) {
//		if(word.charAt(0) == prev_word.charAt(prev_word.length() - 1)) {
//			return true;
//		}
//		return false;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getWord() {
//		return word;
//	}
//
//}
//
//class WordGameApp {
//	Scanner sc;
//	
//	public WordGameApp() {
//		sc = new Scanner(System.in);
//	}
//	
//	public void run() {
//		int idx = 0;	
//		String prev_word = "자동차";
//
//		System.out.print("인원 수 입력 : ");
//		int num = Integer.parseInt(sc.nextLine());
//		System.out.println();
//		
//		Player[] players = new Player[num];
//		
//		for(int i = 0; i < players.length; i++) {
//			System.out.print((i + 1) + "번째 플레이어 이름>> ");
//			String name = sc.nextLine();
//			
//			players[i] = new Player(name);
//			System.out.println();
//		}
//		
//		while(true) {
//			if(idx % num == 0) idx = 0;
//					
//			players[idx].getWordFromUser();
//			
//			if(players[idx].checkSuccess(prev_word)) {
//				prev_word = players[idx].getWord();
//			} else {
//				System.out.println("게임 오버!!!");
//				System.out.println("패배한 사람 : " + players[idx].getName());
//				break;
//			}
//		
//			idx++;
//		}
//	}
//}

public class Test91 {
	public static void main(String[] args) {

		// main 작성 완료
		WordGameApp game = new WordGameApp();
		game.run(); 
		
	}
}
