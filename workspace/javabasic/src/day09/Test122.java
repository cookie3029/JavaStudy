package day09;

//상속, 생성자
/*
	Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하세요. 
	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
	실행결과:
		RED색의 (10,20)의 점입니다.
*/
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// [x, y 생성자, move(x, y)], getX(), getY()
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) { // 인스턴스 메서드
		move(x, y); // 상속받은 인스턴스 메서드 호출해서 대신 일해라~~
		// this.x = x; this.y = y 	private 이면 상속받아도 접근X
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

public class Test122 {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");

	}
}
