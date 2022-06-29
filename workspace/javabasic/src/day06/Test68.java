package day06;
/*
 	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와
 	배열속의 ' ' 공백문자를, ',' 쉼표로 대치하는 replaceSpace() 메서드를 작성해보세요.
 	(편의를 위해 Test68 클래스안에 static 메서드로 작성해보세요)
*/

public class Test68 {

	static void printCharArray(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	static void replaceSpace(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	public static void main(String[] args) {

		char[] c = { 'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y' };
		printCharArray(c); // I am a boy
		replaceSpace(c);
		printCharArray(c); // I,am,a,boy

	}
}



/*
	연산자 : 화폐매수 구하기
	if : 짝수 홀수, 수우미양가
	for : 별찍기 ~ 8번, 구구단
	배열 : 1차: 48.java의 1-2문제 / 아파트 (정렬빼고)
*/





