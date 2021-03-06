package day12;
/*
	나라와 수도 맞추기 게임을 만들어 보세요. 
	나라 이름(country)과 수도(capital)로 구성된 Nation 클래스를 작성하고,
	ArrayList를 이용하여 아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
	실행예시:
		** 수도 맞추기 게임을 시작합니다 **
		입력:1, 퀴즈:2, 종료:3 >> 1 (사용자 입력) 
		현재 8개의 나라와 수도가 입력되어 있습니다. 
		나라와 수도 입력 9>> 한국 서울   (사용자 입력)
		나라와 수도 입력 10>> 그리스 아테네 
		그리스는 이미 있습니다..
		나라와 수도 입력 10>> 호주 시드니
		나라와 수도 입력 11>> 이탈리아 로마
		나라와 수도 입력 12>> 그만 
		입력:1, 퀴즈:2, 종료:3 >> 2 
		호주의 수도는?  시드니  (사용자 입력) 
		정답!! 
		독일의 수도는?  하얼빈
		아닙니다!!
		멕시코의 수도는?  하얼빈 
		아닙니다!!
		이탈리아의 수도는?  로마
		정답!!
		영국의 수도는?  그만 
		입력:1, 퀴즈:2, 종료:3 >> 3
		
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Nation {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}
}

class CapitalGame {
	private List<Nation> list = new ArrayList<Nation>();
	private Scanner sc = new Scanner(System.in);

	public void run() {
		setGame();
		comment();

		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");

			switch (getMenuNum()) {
			case 1:
				insert();
				break;
			case 2:
				quiz();
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("제대로 된 번호를 입력하세요!!!");
			}

			System.out.println();
		}
	}

	private void setGame() {
		list.add(new Nation("멕시코", "멕시코시티"));
		list.add(new Nation("스페인", "리스본"));
		list.add(new Nation("프랑스", "파리"));
		list.add(new Nation("영국", "런던"));
		list.add(new Nation("그리스", "아테네"));
		list.add(new Nation("독일", "베를린"));
		list.add(new Nation("일본", "도쿄"));
		list.add(new Nation("중국", "베이징"));
	}

	private void comment() {
		System.out.println("** 수도 맞추기 게임을 시작합니다 **");
		System.out.println("현재 " + list.size() + "개의 나라와 수도가 입력되어 있습니다.\n");
	}

	public int getMenuNum() {
		try {
			int num = Integer.parseInt(sc.nextLine());
			return num;
		} catch (Exception e) {
			System.out.println("번호를 입력해주세요!!!");
			return 0;
		}

	}

	public void insert() {
		System.out.print("나라와 수도 입력 " + (list.size() + 1) + ">> ");
		String nation = sc.next();
		String capital = sc.next();

		if (!contains(nation)) {
			list.add(new Nation(nation, capital));
		}

		sc.nextLine();
	}

	public boolean contains(String nation) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCountry().equals(nation)) {
				System.out.println("이미 입력된 나라입니다!!!");
				return true;
			}
		}

		return false;
	}

	public void quiz() {
		while (true) {
			int questionNum = (int) (Math.random() * list.size());

			System.out.print(list.get(questionNum).getCountry() + "의 수도는? ");
			String answer = sc.nextLine();

			if (answer.equals("그만")) {
				break;
			}

			checkAnswer(questionNum, answer);
		}
	}

	public void checkAnswer(int questionNum, String answer) {
		if (answer.equals(list.get(questionNum).getCapital())) {
			System.out.println("정답!!!");
		} else {
			System.out.println("아닙니다!!");
		}
	}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

public class CollEx10 {
	public static void main(String[] args) {

		// main 작성 완료, 주석 해제하고 실행
		CapitalGame game = new CapitalGame();
		game.run();

	}
}
