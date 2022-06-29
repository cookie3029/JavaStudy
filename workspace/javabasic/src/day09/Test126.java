package day09;

import java.util.Scanner;

//인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}

class StringStack implements Stack {
	int limit;
	int top = 0;
	String[] strStack;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 스택 저장 공간의 크기 입력 >> ");
		limit = Integer.parseInt(sc.nextLine());

		strStack = new String[limit];
		
		for(int i = 0; i < limit; i++) {
			strStack[i] = new String();
		}
		
		while(true) {
			System.out.println("문자열 입력 >> ");
			String input = sc.nextLine();
			
			if(input.equals("그만")) {
				while(top > 0) {
					System.out.print(pop() + " "); 
				}
				break;
			} 
			
			if(!push(input)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return limit;
	}

	@Override
	public String pop() {
		return strStack[--top];
	}

	@Override
	public boolean push(String val) {
		if(top < limit) {
			strStack[top++] = val;
			return true;
		}
		return false;
	}
	
}

public class Test126 {
	public static void main(String[] args) {

		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작
		
	}
}
