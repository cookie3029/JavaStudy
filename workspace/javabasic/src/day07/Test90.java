package day07;

/*
	직사각형을 표현하는 Rectangle 클래스를 작성하세요.
	- int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보
	  * x, y는 사각형의 왼쪽 위의 점을 말함. (0,0)은 왼족 위, x값은 오른쪽으로 증가, y값은 아래로 증가
	- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
	- int squareArea() 메서드 : 사각형의 너비 리턴
	- void show() 메서드 : 사각형의 좌표와 너비 출력
	- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	콘솔 출력예 >>
		(2,2)에서 크기가 8x7인 사각형
		b의 면적은 36
		c는 a를 포함합니다.
*/

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int squareArea() {
		return width * height;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) {	
		if((r.x > x && r.x < x + width) && (r.y > y && r.y < y + height)) {
			if((r.x + r.width > x && r.x + r.width < x + width) && (r.y + r.height > y && r.y + r.height < y + height)) {
				return true;
			}
		}
		return false;
	}
}

public class Test90 {
	public static void main(String[] args) {

									 // x, y, width, height
			Rectangle a = new Rectangle(2, 2, 8, 7);
			Rectangle b = new Rectangle(5, 5, 6, 6);
			Rectangle c = new Rectangle(1, 1, 10, 10);
			
			a.show();
			System.out.println("b의 면적은 " + b.squareArea());
			if(c.contains(a)) System.out.println("c는 a를 포함합니다.");
			if(c.contains(b)) System.out.println("c는 b를 포함합니다.");

		
	}
}
