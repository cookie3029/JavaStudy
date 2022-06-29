package day07;

import java.util.Scanner;

/*
	콘서트 예약 프로그램.
	- 공연은 하루에 한번
	- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
	- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다. 
	- 예약은 한번에 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다. 
	- 조회는 모든 좌석을 출력한다. 
	- 취소는 예약자의 이름을 입력받아 취소한다. 
	- 없는 이름, 없는 번호, 없는 메뉴 등에 대해서 오류 메세지를 출력하고 
		사용자가 다시 시도하도록 한다. 
	# 실행예시 #
	자바콘서트홀 예약시스템입니다. 
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   1  (사용자 입력)
	좌석구분 S(1), A(2), B(3) >>  1   (사용자 입력)
	S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	이름 >>  피카츄  (사용자 입력)
	번호 >>  1  (사용자 입력)
	<<예약 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   1  
	좌석구분 S(1), A(2), B(3) >>  2   
	A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	이름 >>  꼬북이  
	번호 >>  5  
	<<예약 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   2
	S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
	A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
	B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	<<조회 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   3
	좌석구분 S(1), A(2), B(3) >>  2
	A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
	이름 >>  꼬북이
	<<취소 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   2
	S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
	A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	<<조회 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>   4
	<<프로그램 종료>>
*/

/*
	- 공연은 하루에 한번
	- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
	- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다. 
	- 예약은 한번에 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다. 
	- 조회는 모든 좌석을 출력한다. 
	- 취소는 예약자의 이름을 입력받아 취소한다. 
	- 없는 이름, 없는 번호, 없는 메뉴 등에 대해서 오류 메세지를 출력하고 
		사용자가 다시 시도하도록 한다. 
 */

class Seat {
	private String name = "___";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Booking {
	private Seat[] seatS = new Seat[10];
	private Seat[] seatA = new Seat[10];
	private Seat[] seatB = new Seat[10];
	private Scanner sc;

	Booking() {
		sc = new Scanner(System.in);

		for (int i = 0; i < seatS.length; i++) {
			seatS[i] = new Seat();
		}

		for (int i = 0; i < seatA.length; i++) {
			seatA[i] = new Seat();
		}

		for (int i = 0; i < seatB.length; i++) {
			seatB[i] = new Seat();
		}
	}

	void run() {
		System.out.println("자바콘서트홀 예약시스템입니다.");

		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				book();
			} else if (num == 2) {
				show();
			} else if (num == 3) {
				cancel();
			} else if (num == 4) {
				finish();
				return; // break; 둘 중 하나!!
			} else {
				System.out.println("잘못된 메뉴 번호 선택.... 다시 입력하세요.");
			} // if
		} // while
	} // run

	void book() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int sel = Integer.parseInt(sc.nextLine());
		
		showSingle(sel); // 해당 좌석 구분의 예약 상황 출력
		
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		
		System.out.print("번호 >> ");
		int seatNum = Integer.parseInt(sc.nextLine());
		
		if(sel == 1) seatS[seatNum - 1].setName(name);
		else if(sel == 2) seatA[seatNum - 1].setName(name);
		else if(sel == 3) seatB[seatNum - 1].setName(name);
		
		System.out.println("<<예약 완료>>");
	}

	void showSingle(int sel) {
		if (sel == 1) { // S석
			System.out.print("S >> ");
			
			for(Seat s : seatS) {
				System.out.print(s.getName() + "  ");
			}
		} else if (sel == 2) { // A석
			System.out.print("A >> ");
			
			for(Seat s : seatA) {
				System.out.print(s.getName() + "  ");
			}
		} else if (sel == 3) { // B석
			System.out.print("B >> ");
			
			for(Seat s : seatB) {
				System.out.print(s.getName() + "  ");
			}
		}
		System.out.println();
	}

	void show() {
		showSingle(1);
		showSingle(2);
		showSingle(3);
	}

	void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int sel = Integer.parseInt(sc.nextLine());
		
		showSingle(sel); // 해당 좌석 구분의 예약 상황 출력
		
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		
		if (sel == 1) { // S석
			for(Seat s : seatS) {
				if(s.getName().equals(name)) s.setName("___");
			}
		} else if (sel == 2) { // A석
			for(Seat s : seatA) {
				if(s.getName().equals(name)) s.setName("___");
			}
		} else if (sel == 3) { // B석
			for(Seat s : seatB) {
				if(s.getName().equals(name)) s.setName("___");
			}
		}
		System.out.println();
		
		System.out.println("<<취소 완료>>");
	}

	void finish() {
		System.out.println("<<프로그램 종료>>");

		sc.close();
	}
}

/*
 * class Reservation { private Scanner sc; private String[][] seat; private
 * char[] seatKind={'S','A','B'};;
 * 
 * public Reservation() { sc = new Scanner(System.in); seat = new String[3][];
 * 
 * for (int i = 0; i < seat.length; i++) { seat[i] = new String[10];
 * 
 * for (int j = 0; j < seat[i].length; j++) { seat[i][j] = "___"; } } }
 * 
 * public void run() { while (true) {
 * System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> "); int num =
 * Integer.parseInt(sc.nextLine());
 * 
 * if (num == 1) { reservation(); } else if (num == 2) { view(); } else if (num
 * == 3) { cancel(); } else if (num == 4) { close(); break; } else {
 * System.out.println("알맞은 숫자를 입력하세요!!"); }
 * 
 * System.out.println(); } }
 * 
 * public void reservation() { int num = 0;
 * 
 * while (true) { System.out.print("좌석구분 S(1), A(2), B(3) >> "); num =
 * Integer.parseInt(sc.nextLine());
 * 
 * if (num >= 1 && num <= 3) { break; }
 * 
 * System.out.println("제대로 된 좌석 종류를 입력하세요!!"); }
 * 
 * System.out.print(seatKind[num - 1] + " >>  ");
 * 
 * for (int j = 0; j < seat[num - 1].length; j++) { System.out.print(seat[num -
 * 1][j] + " "); } System.out.println();
 * 
 * System.out.print("이름 >> "); String name = sc.nextLine();
 * 
 * System.out.print("번호 >> "); int idx = Integer.parseInt(sc.nextLine()) - 1;
 * 
 * if ((idx >= 0 && idx <= seat[num - 1].length - 1) && seat[num - 1][idx] ==
 * "___") { seat[num - 1][idx] = name; System.out.println("<<예약 완료>>"); } else
 * if (idx < 0 || idx > seat[num - 1].length - 1) {
 * System.out.println("잘못된 좌석 번호입니다!!"); } else {
 * System.out.println("이미 예약된 좌석입니다!!"); }
 * 
 * System.out.println(); }
 * 
 * public void view() { for(int i = 0; i < seat.length; i++) {
 * System.out.print(seatKind[i] + " >> ");
 * 
 * for(int j = 0; j < seat[i].length; j++) { System.out.print(seat[i][j] + " ");
 * } System.out.println(); }
 * 
 * System.out.println("<<조회 완료>>"); }
 * 
 * public void cancel() { int num = 0;
 * 
 * while (true) { System.out.print("좌석구분 S(1), A(2), B(3) >> "); num =
 * Integer.parseInt(sc.nextLine());
 * 
 * if (num >= 1 && num <= 3) { break; }
 * 
 * System.out.println("제대로 된 좌석 종류를 입력하세요!!"); }
 * 
 * System.out.print(seatKind[num - 1] + " >>  ");
 * 
 * for (int i = 0; i < seat[num - 1].length; i++) { System.out.print(seat[num -
 * 1][i] + " "); } System.out.println();
 * 
 * System.out.print("이름 >> "); String name = sc.nextLine();
 * 
 * 
 * for(int i = 0; i < seat[num - 1].length; i++) { if(seat[num -
 * 1][i].equals(name)) { seat[num - 1][i] = "___";
 * System.out.println("<<취소 완료>>"); return; } }
 * 
 * System.out.println("해당 이름으로 예약된 좌석이 없습니다!!"); }
 * 
 * public void close() { System.out.println("<<프로그램 종료>>"); } }
 */

public class Test93 {
	public static void main(String[] args) {
		Booking book = new Booking();
		book.run();
	}
}
