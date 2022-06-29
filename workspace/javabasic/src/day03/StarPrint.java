package day03;

public class StarPrint {

	public static void main(String[] args) {
//		//문제1.
//		for(int i = 1 ; i <= 5; i++) {
//			System.out.print(i + "행 : " );
//			for(int j = 1; j <= 3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// 문제2.
//		for (int line = 1; line <= 5; line++) {
//			for (int star = 1; star <= i; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// 문제3.
//		for (int line = 0; line < 5; line++) {
//			for (int star = 0; star < 5 - line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// 문제4.
//		for (int line = 0; line < 5; line++) {
//			for(int num = line + 1; num <= line + 5; num++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}

//		// 문제5.
//		for (int i = 0; i < 5; i++) {
//			for(int j = 5 - i; j < 10 - i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		// 문제6.
//		for(int line = 0; line < 9; line++) {
//			if(line <= 4) {
//				for(int star = 0; star < line + 1; star++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int star = 0 ; star < 9 - line; star++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

//		// 문제7.
//		for (int line = 0; line < 5; line++) {
//			for(int space = 0; space < 4 - line; space++) {
//				System.out.print(" ");
//			}
//			for(int star = 0; star <= line; star++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		// 문제8.
//		for (int line = 0; line < 5; line++) {
//			for(int space = 0; space < line; space++) {
//				System.out.print(" ");
//			}
//			for(int star = line; star < 5; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// 문제9.
//		for (int line = 0; line < 11; line++) {
//			if (line < 6) {
//				for (int space = line + 1; space < 6 ; space++) {
//					System.out.print(" ");
//				}
//				for (int star = 0; star < line + 1; star++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int space = 0; space < line - 5; space++) {
//					System.out.print(" ");
//				}
//				for (int star = 0; star < 11 - line; star++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

//		// 문제10.
//		for(int line = 0; line < 5; line++) {
//			for(int space = line; space < 4; space++) {
//				System.out.print(" ");
//			}
//			
//			for(int star = 0; star < 2 * line + 1; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// 문제11.
//		for(int line = 0; line < 6; line++) {
//			for(int space = 0; space < line; space++) {
//				System.out.print(" ");
//			}
//			
//			for(int star = 0; star < (6 - line) * 2 - 1; star++) {
//				System.out.print("*");
//			}
//						
//			System.out.println("");
//		}

//		// 문제12.
//		for(int line = 0; line < 10; line++) {
//			if(line < 5) {
//				for(int star = 0; star < 5 - line; star++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int star = 0; star < line - 4; star++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

//		// 문제13.
//		for (int line = 0; line < 9; line++) {
//			if (line < 5) {
//				for (int space = 0; space < line; space++) {
//					System.out.print(" ");
//				}
//				
//				for (int star = 0; star < 5 - line; star++) {
//					System.out.print("*");
//				}				
//			} else {
//				for (int space = 0; space < 8 - line; space++) {
//					System.out.print(" ");
//				}
//				for (int star = 0; star < line - 3; star++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

//		// 문제14.
//		for (int line = 0; line < 9; line++) {
//			if (line < 5) {
//				for(int space = line; space < 4; space++) {
//					System.out.print(" ");
//				}
//				for(int star = 0; star < 2 * line + 1; star++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int space = 0; space < line - 4; space++) {
//					System.out.print(" ");
//				}
//				for(int star = 0; star < (9 - line) * 2 - 1; star++) {
//					System.out.print("*");
//				}
//			
//			}
//			System.out.println();
//		}

		// 문제15.
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = i; j <= 4; j++) {
					System.out.print("*");
				}

				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print(" ");
				}
				
				for (int j = i; j <= 4; j++) {
					System.out.print("*");
				}
			} else {
				// i = 6 => 9
				// i = 7 => 7
				for (int j = 1; j <= i - 5 ; j++) {
					System.out.print("*");					
				}
				
				for (int k = 1; k <= (9 - i) * 2 + 1; k++) {
					System.out.print(" ");
				}
	
				
				for (int j = 1; j <= i - 5 ; j++) {
					System.out.print("*");					
				}
			}
			System.out.println("");
		}

//		// 문제16.
//		for(int i = 0; i < 9; i++) {
//			if(i <= 3) {
//				for(int j = 0; j <= i; j++) {
//					System.out.print("*");
//				}
//				for(int k = 0; k < 9 - (2 * i) - 2; k++) {
//					System.out.print(" ");
//				}
//				for(int j = 0; j <= i; j++) {
//					System.out.print("*");
//				}
//			} else if(i == 4) {
//				for(int j = 0; j < 9; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int j = i; j < 9; j++) {
//					System.out.print("*");
//				}
//				
//				for(int k = 0; k < (i - 4) * 2 - 1; k++) {
//					System.out.print(" ");
//				}
//				
//				for(int j = i; j < 9; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");

//		// 문제17.
//		for (int i = 0; i < 10; i++) {
//			if (i <= 4) {
//				for (int j = 0; j < i; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 8; k > i * 2 - 1; k--) {
//					System.out.print("*");
//				}
//			} else {
//				for (int j = i; j < 9; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k < (i - 5) * 2 + 1; k++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

//		// 문제18.
//		System.out.println("\t\t\t\t구구단");
//		for(int k = 2; k <= 9; k += 4) {
//			System.out.println("\n");
//			for(int i = 1; i <= 9; i++) {
//				for(int j = k; j <= k + 3 && j <= 9; j++) {
//					System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//				}
//				System.out.println("");
//			}
//		}
	}
}
