package day13;

import javax.swing.JOptionPane;

class ThreadTime extends Thread {
	@Override
	public void run() {
		System.out.println("10초 안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");

		ThEx05.inputCheck = true;
		
		if(input != null) {
			System.out.println("입력하신 값은 " + input + "입니다");			
		} else {
			System.out.println("취소를 누르셨습니다!");
		}
	}
}

class ThreadInput extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			// 다른 스레드를 통해 입력했는지 검사
			if (ThEx05.inputCheck == true) {
				return; // 입력했으면 run() 메서드 종료
			}

			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("10초 동안 값이 입력되지 않아 종료합니다.");
		System.exit(0); // 프로그램 종료 (빨간 버튼 눌러서 종료하듯)
	}
}

public class ThEx05 {
	static boolean inputCheck = false;

	public static void main(String[] args) {

		ThreadTime th = new ThreadTime(); // timer
		ThreadInput inputTh = new ThreadInput(); // 입력
//		System.out.println(th.getPriority());
//		th.setPriority(Thread.MAX_PRIORITY);
		
		th.start();
		inputTh.start();

	}
}
