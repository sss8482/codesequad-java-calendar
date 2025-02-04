package calendar;

import java.util.Scanner;

public class Calendar {

	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeepYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//			서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1984년, 1988년, 1992년, 1996년, 2000년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년, 2048년, 2052년 ...)
//			서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. (1700년, 1800년, 1900년, 2100년, 2200년, 2300년...)
//			서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (1600년, 2000년, 2400년...) 
			return true;

		} else {
			return false;
		}

	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeepYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}

	}

	public void printCalendar(int year, int month) {

		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println("  --------------------");

		int maxDay = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21"); 
//		System.out.println("22 23 24 25 26 27 28");
	}

}
