package day12;

import java.util.HashMap;
import java.util.Scanner;

/*  HashMap
	id와 tel(전화번호)로 구성된 Student클래스를 만들고, 
	이름을 key로하고 Student 객체를 값으로 하는 HashMap을 작성해보세요. 
	5명 정도 HashMap에 미리 저장해놓고,  
	이름을 검색하면 id와 전화번호 출력되며, exit를 입력하면 프로그램 종료. 
*/


	// 내풀이
	class Student {
		private String id;
		private String tel;
		
		public Student(String id, String tel) {
			this.id = id;
			this.tel = tel;
		}
		
		@Override
			public String toString() {
				return "아이디 : " + id + ", 전화번호 : " + tel;
			}
	}


public class CollEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Student> h = new HashMap<String, Student>();
		
		h.put("피카츄", new Student("Pikachu", "010-1111-1111"));
		h.put("라이츄", new Student("Raichu", "010-2222-2222"));
		h.put("파이리", new Student("Pairi", "010-3333-3333"));
		h.put("피카츄", new Student("Pikachu", "010-4444-4444"));
		h.put("피카츄", new Student("Pikachu", "010-5555-5555"));
			
		while(true) {
			System.out.print("이름 입력 >> ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다!!");
				sc.close();
				break;
			}
			
			if(h.containsKey(str)) {
				System.out.println(h.get(str)); 
			} else {
				System.out.println("검색된 내용이 업습니다!!");
			}
			System.out.println();
		}
		
	}
}

