package day12;

import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
	HashMap을 이용하여 학생이름과 자바 점수를 기록하는 관리 프로그램을 만드세요. 
	아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고, 6번을 입력받으면 프로그램 종료. 
	*** 자바 성적 관리 프로그램 ***
	1. 전체 조회
	2. 등록
	3. 점수 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료 
	
*/
public class CollEx04 {
	private Scanner sc;
	private HashMap<String, Integer> data;

	public CollEx04() {
		data = new HashMap<String, Integer>();
		sc = new Scanner(System.in);
	}

	private void show() {
		Iterator<String> it = data.keySet().iterator();

		/*
		 * while(it.hasNext()) { String name = it.next(); int score = data.get(name);
		 * System.out.println(name + " " + score); }
		 */

		if (it.hasNext()) {
			while (it.hasNext()) {
				String name = it.next();
				int score = data.get(name);
				System.out.println(name + " " + score);
			}
		} else {
			System.out.println("저장된 정보가 없습니다.");
		}

		System.out.println("===================================");
	}

	private void insertData() {
		System.out.print("이름>> ");
		String name = sc.nextLine();

		System.out.println("점수>> ");
		int score = Integer.parseInt(sc.nextLine());

		Set<String> keys = data.keySet();

		if (keys.contains(name)) {
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 입력해주세요");
			insertData();
			// return
		} else {
			data.put(name, score);
			System.out.println("저장 완료!!");
		}
		System.out.println("===================================");
	}

	private void modifyData() {
		System.out.print("이름>> ");
		String name = sc.nextLine().trim();

		Set<String> keys = data.keySet();

		if (keys.contains(name)) {
			System.out.print("점수>> ");
			int score = Integer.parseInt(sc.nextLine().trim());

			data.put(name, score);

			System.out.println("수정 완료!!");
		} else {
			System.out.println("존재하지 않는 학생입니다.");
		}

		System.out.println("===================================");
	}

	private void deleteData() {
		System.out.print("삭제할 이름>> ");
		String name = sc.nextLine();

		Set<String> keys = data.keySet();

		if (keys.contains(name)) {
			data.remove(name);

			System.out.println("삭제 완료!!");
		} else {
			System.out.println("존재하지 않는 학생입니다.");
		}

		System.out.println("===================================");
	}

	private void getAvg() {
		Collection<Integer> scores = data.values();
		Iterator<Integer> it = scores.iterator();

		int sum = 0;

		while (it.hasNext()) {
			int score = it.next();
			sum += score;
		}

		double avg = (double) sum / data.size();
		
		System.out.println("자바 평균 점수 : " + avg);
		System.out.println("===================================");
	}

	private void finish() {
		sc.close();
	}

	private void run() {
		while (true) {
			System.out.println("*** 자바 성적 관리 프로그램 ***\n" + "1. 전체 조회\n" + "2. 등록\n" + "3. 점수 수정\n" + "4. 삭제\n"
					+ "5. 전체 평균\n" + "6. 프로그램 종료 ");

			System.out.print("원하는 서비스 번호를 눌러주세요 >> ");
			int sel = Integer.parseInt(sc.nextLine().trim());

			System.out.println();

			if (sel == 1) show();
			else if (sel == 2) insertData();
			else if (sel == 3) modifyData();
			else if (sel == 4) deleteData();
			else if (sel == 5) getAvg();
			else if (sel == 6) { finish(); break; } 
			else System.out.println("잘못 입력하셨습니다!!!");

			System.out.println();
		}
	}

	public static void main(String[] args) {
		CollEx04 ex = new CollEx04();
		ex.run();
	}
}
