package day06;

// Tv 클래스
// 값 저장 : 채널, 볼륨, 전원
// 기능 : 전원on/off, 볼륨 조정, 채널 조정...
class Tv { 
	int ch = 1, vol = 0;
	boolean power = false;
	
	void onOff() {
		power = !power;
	}
	
	void chUp() {
		ch++;
	}
	
	void volDown() {
		vol--;
	}
	
	void changeCh(int newCh) {
		ch = newCh;
	}
	
	//chDown(), volUp()
	void chDown() {
		ch--;
	}
	
	void volUp() {
		vol++;
	}
}

public class Test63 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.power);
		tv.chUp();
		System.out.println(tv.ch);
		tv.volDown();
		System.out.println(tv.vol);
		tv.changeCh(10);
	}
}
