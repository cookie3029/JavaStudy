package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 	하나의 학생 정보를 나타내는 StudentClass에는 이름, 학과, 학번, 학점평균을 저장하는 필드가 있다. 
 	학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 
 	ArrayList 에 저장한 후, 모든 학생의 정보를 출력, 
 	학생이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하세요. 
 	실행예시:
 		학생이름, 학과, 학번, 학점 평균 입력하세요.
 		>> 아이언맨,빅데이터,1,4.25  (사용자 입력)
 		>> 데드풀,안드로이드,2,3.9
 		>> 호크아이,모바일,3,4.1
 		>> 헐크,웹개발,4,3.5
 		------------------------------------------
 		이름:아이언맨
 		학과:빅데이터
 		학번:1
 		학점평균:4.25
 		------------------------------------------
 		이름:데드풀
 		학과:안드로이드
 		학번:2
 		학점평균:3.9
 		------------------------------------------
 		이름:호크아이
 		학과:모바일
 		학번:3
 		학점평균:4.1
 		------------------------------------------
 		이름:헐크
 		학과:웹개발
 		학번:4
 		학점평균:3.5
 		------------------------------------------
 		학생 이름 >> 아이언맨   (사용자 입력)
 		아이언맨, 빅데이터, 1, 4.25
 		학생 이름 >> 호크아이 
 		호크아이, 모바일, 3, 4.1
 		학생 이름 >> 그만
 		프로그램 종료! 
*/

class StudentClass {
	//이름, 학과, 학번, 학점평균
	private String name;
	private String department;
	private int id;
	private double grade;
	
	public StudentClass(String name, String department, int id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}

	public String getdepartment() {
		return department;
	}

	public int getid() {
		return id;
	}

	public double getgrade() {
		return grade;
	}	
	
	@Override
	public String toString() {
		return name + ", " + department + ", " + id + ", " + grade;
	}
}

public class CollEx07 {
	
	private Scanner sc;
	private List<StudentClass> list;
	
	public CollEx07() {
		sc = new Scanner(System.in);
		list = new ArrayList<StudentClass>();
	}
	
	private void setList() {
		System.out.println("학생이름, 학과, 학번, 학점 평균 입력하세요.");
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] text = sc.nextLine().split(",");
			
			String name = text[0].trim();
			String dept = text[1].trim();
			int id = Integer.parseInt(text[2].trim());
			double grade = Double.parseDouble(text[3].trim());
			
			list.add(new StudentClass(name, dept, id, grade));
		}
	}
	
	private void printAll() {
		System.out.println("------------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			StudentClass s = list.get(i);	
			
			System.out.println("이름:" + s.getName());
			System.out.println("학과:" + s.getdepartment());
			System.out.println("학번:" + s.getid());
			System.out.println("학점평균:" + s.getgrade());
		}
		
		System.out.println("------------------------------------------");
	}

	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String input = sc.nextLine();
			
			if(input.equals("그만")) {
				System.out.println("프로그램 종료!");
				sc.close();
				break;
			}
			
			for(int i = 0; i < list.size(); i++) {
				StudentClass s = list.get(i);
				
				if(s.getName().equals(input)) {
					System.out.println(list.get(i));
					break;
				}
			}
		}
	}
	
	private void run() {
		setList();
		printAll();
		search();
	}
	
	public static void main(String[] args) {
		
		CollEx07 ex = new CollEx07();
		ex.run();
		
	}
}
