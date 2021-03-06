package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점(학점단위 : 'A','B','C','D','F')을 문자로 입력받아
	ArrayList에 저장하고 ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 
	평균을 출력하는 프로그램을 작성하세요. 
	콘솔예:
		6개의 학점을 띄어쓰기하여 입력하세요(A/B/C/D/F) >> A C A B F D  (사용자 입력)
		평균 : 2.333333333
		
*/
public class CollEx03 {
	public static void main(String[] args) {

		float tot = 0.0F;
		
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();

		System.out.print("6개의 학점을 띄어쓰기하여 입력하세요(A/B/C/D/F) >> ");
		
		for(int i = 0; i < 6; i++) {
			list.add(sc.next().charAt(0));
		}

		Iterator<Character> it = list.iterator();
		
		
		while(it.hasNext()) {
			switch(it.next()) {
			case 'A':
				tot += 4.0;
				break;
			case 'B': 
				tot += 3.0;
				break;
			case 'C':
				tot += 2.0;
				break;
			case 'D':
				tot += 1.0;
				break;
			case 'F':
				tot += 0.0;
			}
		}
		
		System.out.println("평균 : " + (tot / 6));
		 
		sc.close();
		
	} 
}
