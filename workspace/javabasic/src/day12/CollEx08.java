package day12;
/*
	CollEx07번 문제를 ArrayList 대신, HashMap을 이용하여 다시 작성해보세요. 
	이때, HashMap의 키값은 학생이름으로 한다. 
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollEx08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentClass> h = new HashMap<String, StudentClass>();
		
		System.out.println("학생이름, 학과, 학번, 학점 평균 입력하세요.");
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] info = sc.nextLine().split(",");
			h.put(info[0], new StudentClass(info[0], info[1], info[2], Double.parseDouble(info[3])));
		}
		
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String name = h.get(it.next()).getName();
			String dept = h.get(name).getDept();
			String stuNum = h.get(name).getStuNum();
			double credit = h.get(name).getCredit();
			
			System.out.println("------------------------------------------");
			System.out.println("이름:" + name);
			System.out.println("학과:" + dept);
			System.out.println("학번:" + stuNum);
			System.out.println("학점평균:" + credit);
		}
		System.out.println("------------------------------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.nextLine();
			
			if(name.equals("그만")) {
				System.out.println("프로그램 종료!");
				break;
			}
			
			if(h.containsKey(name)) {
				System.out.println(h.get(name));
			}
		}
				
	}
}
