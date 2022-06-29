package day04;

import java.util.Scanner;

public class Test44 {
	public static void main(String[] args) {

		// * 2차원 배열 문제 * 
		//문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
		/*
			10	20	30
			40	50	60
			70	80	90

			int[][] arr = { 
					{10,20,30}, 
					{40,50,60}, 
					{70,80,90} 
			};
		*/
//		int[][] arr = new int[3][3];
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = ((i * 3) + j + 1) * 10;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
//		//문제2. int형 3행 2열의 정방배열을 만들고, 
//		//		각 방에 정수를 입력받아 저장하고 출력해보세요. 
//		
//		int[][] arr = new int[3][2];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print("정수 입력>>");
//				arr[i][j] = Integer.parseInt(sc.nextLine());
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		//문제3. 아래와 같은 형태의 비정방배열을 만들어 아래와 같이 값을 저장하고 출력해보세요. 
		/*
			10	11	12
			20	21
			30	31	32
			40	41
		*/
		// int[][] arr3 = { { 10, 11, 12 }, { 20, 21 }, { 30, 31, 32 }, { 40, 41 } };

//		int [][] arr = new int[4][];
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		arr[3] = new int[2];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i + 1) * 10 + j;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		//문제4. 한층에 5호씩 3층짜리 아파트가 있다. (101호 ~ 305호) 
		//		 1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요. 
		//		 2) 층별 관리비 평균을 구해서 출력해보세요. 
		//		 3) 전체 관리비 평균을 구해서 출력해보세요. 
		//		 4) 103호와 203호의 관리비가 서로 바뀌었다고합니다. 교환해주세요. 
		//		 5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요. 
		//		 6) 관리비가 가장 적은 호수와 가장 많이나온 호수를 출력해보세요. 
		//		 7) 관리비 적게 나온순으로 정렬해보세요. 
		int[][] fee = {
				{45,89,35,68,42},
				{78,56,88,102,12},
				{47,3,56,7,100}
		};
		
//		// 1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 
//		//    전체 출력해보세요. 
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				System.out.print("관리비 입력>>");
//				fee[i][j] = Integer.parseInt(sc.nextLine());
//			}
//		}
		
//		for(int[] floor : fee) {
//			for(int target : floor) {
//				System.out.print(target + " ");
//			}
//			System.out.println();
//		}
		
//		// 2) 층별 관리비 평균을 구해서 출력해보세요. 
//		// #1.
//		int tot1 = 0;
//		int tot2 = 0;
//		int tot3 = 0;
//		
//		for(int i = 0; i < fee[0].length; i++) {
//			tot1 += fee[0][i];
//			tot2 += fee[1][i];
//			tot3 += fee[2][i];
//		}
//		
//		for(int i = 0; i < fee[0].length; i++) {
//			tot1 += fee[0][i];
//		}
//		
//		int [] floorFeeAvg = {0,0,0};
//		
//		for(int i = 0; i < fee[0].length; i++) {
//			tot2 += fee[1][i];
//		}
//		
//		for(int i = 0; i < fee[0].length; i++) {
//			tot3 += fee[2][i];
//		}
//		
//		// #2.
//		for(int i = 0; i< fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				floorFeeAvg[i] += fee[i][j];
//			}
//		}
//		
//		for(int i = 0; i < fee.length; i++) {
//			int sum = 0, avg = 0;
//			for(int j = 0; j < fee[i].length; j++) {
//				sum += fee[i][j];
//			}
//			avg = sum / fee[i].length;
//			
//			System.out.println((i + 1) + "층 :" + avg);
//		}		
		
//		// 3) 전체 관리비 평균을 구해서 출력해보세요. 
//		int tot = 0;
//		
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				tot += fee[i][j];
//			}
//		}
//		
//		int avg = tot / 15;
//		
//		System.out.println("전체 평균 : " + avg);
		
//		// 4) 103호와 203호의 관리비가 서로 바뀌었다고합니다. 
//		//	  교환해주세요. 
//		int tmp = fee[0][2];
//		fee[0][2] = fee[1][2];
//		fee[1][2] = tmp;
//		
//		System.out.println(fee[0][2] + " " + fee[1][2]);
		

		// 5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요. 
		int [][] ho = {
			{101,102,103,104,105},
			{201,202,203,204,205},
			{301,302,303,304,305}
		};
		
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				if(fee[i][j] < avg) {
//					System.out.print(ho[i][j] + " ");
//				}
//			}
//		}
		
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				if(fee[i][j] < avg2) {
//					System.out.print(((i + 1) * 100 + (j + 1)) + "호 ");
//				}
//			}
//		}
//		System.out.println();
		
//		// 6) 관리비가 가장 적은 호수와 가장 많이나온 호수를 출력해보세요.
//		int max = fee[0][0]; // 가장 많이 나온 관리비 금액 들고 있을 변수
//		int maxI = 0; // ho 배열에서 호수를 찾기 위해 인덱스 번호 들고 있을 변수
//		int maxJ = 0;
//		
//		int min = fee[0][0]; // 가장 저게 나온 관리비 금액 들고 있을 변수
//		int minI = 0;
//		int minJ = 0;
//		
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				if(max < fee[i][j]) {
//					max = fee[i][j];
//					maxI = i;
//					maxJ = j;
//				}
//				
//				if(min > fee[i][j]) {
//					min = fee[i][j];
//					minI = i;
//					minJ = j;
//				}
//			}
//		}
//		
//		System.out.println("최대 관리비 호수 : " + max + "원으로 " + ho[maxI][maxJ] + " 입니다.");
//		System.out.println("최소 관리비 호수 : " + min + "원으로 " + ho[minI][minJ] + " 입니다.");

		// #2.
//		int[] maxIdx = {0 , 0};
//		int[] minIdx = {0 , 0};
//		
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[i].length; j++) {
//				if(fee[i][j] > fee[maxIdx[0]][maxIdx[1]]) {
//					maxIdx[0] = i;
//					maxIdx[1] = j;
//				}
//				
//				if(fee[i][j] < fee[minIdx[0]][minIdx[1]]) {
//					minIdx[0] = i;
//					minIdx[1] = j;
//				}
//			}
//		}
//		
//		System.out.println("가장 많이 나온 호수 : " + (((maxIdx[0] + 1) * 100) + (maxIdx[1] + 1)) + "호");
//		System.out.println("가장 적게 나온 호수 : " + (((minIdx[0] + 1) * 100) + (minIdx[1] + 1)) + "호");
		
		// 7) 관리비 적게 나온순으로 정렬해보세요. 
		
		
//		int[] list = new int[fee.length * fee[0].length];
//
//		for(int i = 0; i < fee.length; i++) {
//			for(int j = 0; j < fee[0].length; j++) {
//				list[i * 5 + j] = fee[i][j];
//			}
//		}
//		
//		for(int i = 0; i < list.length - 1; i++) {
//			for(int j = i + 1; j < list.length; j++) {
//				if(list[i] > list[j]) {
//					int tmp = list[i];
//					list[i] = list[j];
//					list[j] = tmp;
//				}
//			}
//		}
//		
//		for(int i : list) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
