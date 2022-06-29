package day11;

class Point2 {
	int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		// 매개변수가 Object 타입으로 받아줘서 x, y 못 알아보니
		// 온전히 잘 쓰기 위해 Point2 타입을 형변환해서 다시 변수에 담아 사용
		Point2 pobj = null;

		if (obj instanceof Point2) {
			pobj = (Point2) obj;
		}

		if (x == pobj.x && y == pobj.y) {
			return true;
		}

		return false;
	}
}

public class Api02 {
	public static void main(String[] args) {

		Point2 a = new Point2(1, 3);
		Point2 b = new Point2(1, 3);
		// Point2 c = a;

		System.out.println(a == b); // 주소 비교
		System.out.println(a.equals(b)); // 주소 비교

	}
}
