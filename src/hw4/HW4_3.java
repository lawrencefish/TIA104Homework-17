package hw4;

import java.util.Scanner;

public class HW4_3 {
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 輸入西元年、月、日
		System.out.println("請輸入西元年月日yyyy mm dd：");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		// 確認日期是否有效
		if (!isValidDate(year, month, day)) {
			System.out.println("輸入的日期無效。");
			return;
		}
		// 計算該日期在當年中的第幾天
		int dayOfYear = calculateDayOfYear(year, month, day);
		// 輸出結果
		System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	}

	// 檢查日期是否有效
	private static boolean isValidDate(int year, int month, int day) {
		// 確認月份範圍
		if (month < 1 || month > 12) {
			return false;
		}
		// 每月天數的陣列
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 檢查是否為閏年，並調整二月的天數
		if (isLeapYear(year)) {
			daysInMonth[2] = 29;
		}
		// 確認日數範圍
		return day > 0 && day <= daysInMonth[month];
	}

	// 判斷是否為閏年
//	閏年規則
//	引述自維基百科的閏年定義，現行使用的是格高曆閏年規則：
//	公元年分除以4不可整除，為平年。
//	公元年分除以4可整除但除以100不可整除，為閏年。
//	公元年分除以100可整除但除以400不可整除，為平年。
//	公元年分除以400可整除，為閏年。
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	// 計算當年的第幾天
	private static int calculateDayOfYear(int year, int month, int day) {
		// 每月天數的陣列
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 如果是閏年，調整二月的天數
		if (isLeapYear(year)) {
			daysInMonth[2] = 29;
		}

		int dayOfYear = 0;

		// 計算該日期在當年中的第幾天
		for (int i = 0; i < month; i++) {
			dayOfYear += daysInMonth[i];
		}

		dayOfYear += day; // 加上當天

		return dayOfYear;
	}
}
