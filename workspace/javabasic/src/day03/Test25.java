package day03;

import java.util.Iterator;

public class Test25 {
	public static void main(String[] args) {

		/* 초기식 생략하는 방법 (잘 사용 X)
			int a = 0;
			for (; a < 10; a++) {
				System.out.println(a);
			}
			
			for (int i = 0; i < 3; i++) {
				System.out.println("hello");
			}
			
			for(;;) {
				System.out.println("hahahahahahahah");
//				if (조건) {
//					break;
//				}
			}
		*/

		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
