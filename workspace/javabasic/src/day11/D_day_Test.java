package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class D_day_Test {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// D-day 계산기 만들어보기
		Scanner sc = new Scanner(System.in);
		Calendar target = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		System.out.print("날짜 입력 : ");
		
		try {
			String dateStr = sc.nextLine();
			Date tmp = sdf.parse(dateStr);
			target.set(tmp.getYear() + 1900, tmp.getMonth(), tmp.getDate());
		} catch (ParseException e) {

		}
		
//		System.out.print("년도 입력 : ");
//		target.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
//		
//		System.out.print("월 입력 : ");
//		target.set(Calendar.MONTH, Integer.parseInt(sc.nextLine()) - 1);
//		
//		System.out.print("날짜 입력 : ");
//		target.set(Calendar.DATE, Integer.parseInt(sc.nextLine()));
//		

		Long dDays = (target.getTimeInMillis() - now.getTimeInMillis()) / (24 * 60 * 60 * 1000);	
		System.out.println("D-day : " + dDays);
		
	}
}
