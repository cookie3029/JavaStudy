package day06;
/* TvEx 기능 구현
v0. on/off, vol 조정, ch 조정
v1. 채널 = 배열[10] 생성 후 랜덤값 10개 생성 후, 오름차순으로 정렬 
v2. 채널 (up, down) 기능
v3. 채널값 입력받아 변경 (없는 채널번호 입력하면 변경X)
v4. 볼륨 (up, down) 기능 0 ~ 10 사이 증감
v5. 볼륨 음소거 기능
v6. Tv 정보 출력 기능 -> 전원 상태, 볼륨, 채널 값들 출력 
7. 전원이 꺼져있는 경우 모든 기능 동작 안되게
*/

class TvEx {
	boolean power = false;
	int vol = 0;
	int[] channel = new int[10]; // 랜덤 채널들 목록 가지고 있을 배열
	int chIdx = 0; // 현재 채널을 배열상의 idx번호로 가지고 있을 변수
	// int ch = 0;

	// 전원
	void onOff() {
		power = !power;
	}

	// 채널 세팅
	void setChannel() {
		if (power) {
			// 랜덤 10개 채워주기 (중복 체크)
			for (int i = 0; i < channel.length; i++) {
				channel[i] = (int) (Math.random() * 50) + 1;

				for (int j = 0; j < i; j++) { // 중복 체크
					if (channel[i] == channel[j]) {
						i--;
						break;
					}
				}
			}
			// 정렬
			for (int i = 0; i < channel.length - 1; i++) {
				for (int j = i + 1; j < channel.length; j++) {
					if (channel[i] > channel[j]) {
						int tmp = channel[i];
						channel[i] = channel[j];
						channel[j] = tmp;
					}
				}
			}

			// 출력해 확인
			for (int c : channel) {
				System.out.print(c + "   ");
			}
			System.out.println();
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	// 채널
	void chUp() {
		if (power) {
			chIdx++; // 0 ~ 9
			if (chIdx == 10)
				chIdx = 0;
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	void chDown() {
		if (power) {
			chIdx--; // 0 ~ 9
			if (chIdx == -1)
				chIdx = 9;
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	void channelChange(int c) {
		if (power) {
			for (int i = 0; i < channel.length; i++) {
				if (channel[i] == c) {
					chIdx = i;
					break;
				}
			}
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	// 볼륨
	void volUp() {
		if (power) {
			if (vol < 10) {
				vol++;
			}
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	void volDown() {
		if (power) {
			if (vol > 0) {
				vol--;
			}
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	void mute() {
		if (power) {
			vol = 0;
		} else {
			System.out.println("전원을 키고 실행해주세요.");
		}
	}

	// Tv 정보 기능 출력
	String tvStatus() {
		return "전원 : " + (power ? "ON" : "OFF") + ", 채널 : " + channel[chIdx] + ", 볼륨 : " + vol;
	}
}

//class TvEx {
//	boolean power = false;
//	int vol = 0, chIdx = 0, ch = -1;
//	int[] chList = new int[10];
//
//	void onOff() {
//		power = !power;
//	}
//
//	void setChList() {
//		for (int i = 0; i < chList.length; i++) {
//			chList[i] = (int) (Math.random() * 10) + 1;
//
//			for (int j = 0; j < i; j++) {
//				if (chList[i] == chList[j]) {
//					i--;
//				}
//			}
//		}
//
//		for (int i = 0; i < chList.length - 1; i++) {
//			for (int j = i; j < chList.length; j++) {
//				if (chList[i] > chList[j]) {
//					int tmp = chList[i];
//					chList[i] = chList[j];
//					chList[j] = tmp;
//				}
//			}
//		}
//
//		ch = chList[chIdx];
//	}
//
//	void chUp() {
//		if (power) {
//			if (chIdx < 9) {
//				System.out.println("현재 채널 : " + chList[chIdx + 1]);
//				ch = chList[chIdx++];
//			} else {
//				System.out.println("현재 채널 : " + chList[chIdx]);
//			}
//		}
//	}
//
//	void chDown() {
//		if (power) {
//			if (chIdx > 0) {
//				System.out.println("현재 채널 : " + chList[chIdx - 1]);
//				ch = chList[chIdx--];
//			} else {
//				System.out.println("현재 채널 : " + chList[chIdx]);
//			}
//		}
//	}
//
//	void changeCh(int n) {
//		if (power) {
//			for (int i = 0; i < chList.length; i++) {
//				if (chList[i] == n) {
//					ch = chList[i];
//					return;
//				}
//			}
//
//			System.out.println("채널을 변경할 수 없습니다.");
//		}
//	}
//
//	void volUp() {
//		if (power) {
//			if (vol < 10) {
//				vol++;
//			} else {
//				vol = 10;
//			}
//		}
//	}
//
//	void volDown() {
//		if (power) {
//			if (vol > 0) {
//				vol--;
//			} else {
//				vol = 0;
//			}
//		}
//	}
//
//	void mute() {
//		if (power) {
//			vol = 0;
//		}
//	}
//
//	void tvInfo() {
//		if (power) {
//			System.out.println("전원 상태 : " + power);
//			System.out.println("볼륨 : " + vol);
//			System.out.println("채널 : " + ch);
//		}
//	}
//}

public class Test66 {
	public static void main(String[] args) {

		TvEx tv = new TvEx();
		tv.onOff();
		tv.setChannel();
		System.out.println(tv.tvStatus());
//		tv.chDown();
//		System.out.println(tv.tvStatus());
//		tv.channelChange(10);
//		System.out.println(tv.tvStatus());

	}
}
