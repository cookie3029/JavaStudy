package day09;

import java.awt.Shape;
import java.util.Scanner;

//추상클래스
/*
	텍스트로 입출력하는 간단한 그래픽 편집기 만들기. 
	아래 추상클래스 ShapeAbst를 상속받은 Line, Rect, Circle 클래스를 만들고, 
	실행 예시처럼 "삽입", "삭제", "모두보기", "종료"의 4가지 그래픽 편집 기능을 가진 
	클래스 GraphicEditor를 작성하세요.
	실행예시 : 
		그래픽 에디터를 실행합니다. 원하는 기능의 번호를 눌러주세요.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1 (사용자 입력)
		1.Line  2.Rect  3.Circle >>  2
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1
		1.Line  2.Rect  3.Circle >>  3
		1.삽입  2.삭제  3.모두보기  4.종료 >>  3
		Rect
		Circle
		1.삽입  2.삭제  3.모두보기  4.종료 >>  2
		삭제할 도형의 위치 >> 3
		삭제할 수 없습니다.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  4
		에디터를 종료합니다.
*/
abstract class ShapeAbst {
	private ShapeAbst next;

	public ShapeAbst() {
		next = null;
	}

	public void setNext(ShapeAbst obj) {
		next = obj;
	} // 링크 연결

	public ShapeAbst getNext() {
		return next;
	}

	abstract public void draw(); // 추상메서드 : 도형이름 출력하는 기능을 갖고 있다.
}

class Line extends ShapeAbst {

	@Override
	public void draw() {
		System.out.println("Line");
	}

}

class Rect extends ShapeAbst {

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends ShapeAbst {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

class GraphicEditor {
	Scanner sc = new Scanner(System.in);

	ShapeAbst start = null;
	ShapeAbst last = null;

	public void run() {
		System.out.println("그래픽 에디터를 실행합니다. 원하는 기능의 번호를 눌러주세요.");

		while (true) {
			System.out.print("1.삽입  2.삭제  3.모두보기  4.종료 >> ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num == 1) {
				insertProcess();
			} else if (num == 2) {
				delete();
			} else if (num == 3) {
				view();
			} else if (num == 4) {
				System.out.println("에디터를 종료합니다.");
				break;
			}
			System.out.println();
		}
	}

	public void insertProcess() {
		System.out.print("1.Line  2.Rect  3.Circle >> ");
		int shapeNum = Integer.parseInt(sc.nextLine());

		if (shapeNum == 1) {
			insert(new Line());
		} else if (shapeNum == 2) {
			insert(new Rect());
		} else if (shapeNum == 3) {
			insert(new Circle());
		} else {
			System.out.println("제대로 된 메뉴를 선택하세요!!");
		}
	}

	public void insert(ShapeAbst tmp) {
		if (start == null) {
			start = tmp;
			last = start;
		} else {
			last.setNext(tmp);
			last = tmp;
		}
	}

	public void delete() {
		ShapeAbst tmpShape = null;

		System.out.print("삭제할 도형의 위치 >> ");
		int pos = Integer.parseInt(sc.nextLine()) - 1;

		if (start == null) {
			System.out.println("삭제할 수 없습니다.");				
		} else if (pos == 0) {
			start = start.getNext();
		} else {
			tmpShape = start;
			
			for(int i = 0; i < pos - 1; i++) {
				tmpShape = tmpShape.getNext();
			}
			
			if(tmpShape.getNext() == null) {
				System.out.println("삭제할 수 없습니다.");
				return;
			}
			
			tmpShape.setNext(tmpShape.getNext().getNext());
		}
	}

	public void view() {
		ShapeAbst stmp = start;

		while (stmp != null) {
			stmp.draw();
			stmp = stmp.getNext();
		}
	}

}

public class Test128 {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.run();
	}
}
