package day09;

// 오버라이딩으로 다형성 실현
class Shape1 {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line1 extends Shape1 {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect1 extends Shape1 {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle1 extends Shape1 {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class Test115 {

	static void paint(Shape1 s) { // 매개변수의 다형성
		s.draw(); // line, shape, rect, circle
	}
	
	public static void main(String[] args) {
		Line1 line = new Line1();
		
		paint(line);
		
		paint(new Shape1());
		paint(new Line1());
		paint(new Rect1());
		paint(new Circle1());
	}
}
