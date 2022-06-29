package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	이름과 학점(4.5 만점)을 5개 입력받아 HashMap에 저장하고, 
	장학생 선발 기준을 입력받아 장학생 명단을 출력하세요. 
	실행 예시 :
		자바 장학금관리 시스템입니다. 
		이름과 학점 >> 토르 3.1  (사용자 입력)
		이름과 학점 >> 블랙위도우 4.0
		이름과 학점 >> 데드풀 2.8
		이름과 학점 >> 아이언맨 4.3
		이름과 학점 >> 호크아이 3.8
		장학생 선발 학점 기준 입력 >> 3.2 
		장학생 명단 : 블랙위도우 아이언맨 호크아이
*/

class Scholarship {
	private Scanner sc;
	private String scholarName;
	private HashMap<String, Double> h;

	public Scholarship(String scholarName) {
		this.h = new HashMap<String, Double>();
		this.sc = new Scanner(System.in);
		
		this.scholarName = scholarName;
	}

	public void read() {
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();
			double credit = sc.nextDouble();

			if (credit > 4.5) {
				System.out.println("4.5점 이하여야 합니다.");
				i--;
			} else {
				h.put(name, credit);
			}
		}
	}
	
	public void select() {
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double stdCredit = sc.nextDouble();
		
		System.out.print("장학생 명단 : ");
		
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			
			if(h.get(name) > stdCredit) {
				System.out.print(name + " ");
			}
		}
		System.out.println();
	}
}

public class CollEx09 {
	public static void main(String[] args) {

		
		// main 작성완료, 주석해제해서 실행  
		Scholarship sch = new Scholarship("자바 장학금"); 
		sch.read();
		sch.select();
		

	}
}
