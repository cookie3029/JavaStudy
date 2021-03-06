package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ArrayList
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 ArrayList에 저장하고, 
	ArrayList를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요.
*/
public class CollEx02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == -1) {
				sc.close();
				break;
			}
			
			list.add(num);
		}
		
		int maxIdx = 0;

		for(int i = 1; i < list.size(); i++) {
			if(list.get(maxIdx) < list.get(i)) {
				maxIdx = i;
			}
		}
		
		System.out.println();		
		System.out.println("가장 큰 수 : " + list.get(maxIdx));
		 
	}
}
