package hw10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HW10_3 {
//	請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，
//	可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一，
//	而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期格式:yyyymmdd，例如20241027");
		String ymd = sc.nextLine();
		if (isDate(ymd)) {
			String y = ymd.substring(0, 4);
			String m = ymd.substring(4, 6);
			String d = ymd.substring(6);
			System.out.println("請輸入想要的表示方式");
			System.out.println("(1)年/月/日");
			System.out.println("(2)月/日/年");
			System.out.println("(3)日/月/年");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println(y+"/"+m+"/"+d);
				break;
			case 2:
				System.out.println(m+"/"+d+"/"+y);
				break;
			case 3:
				System.out.println(d+"/"+m+"/"+y);
				break;
			}
		} else {
			System.out.println("輸入格式不正確或日期不存在");
		}
	}

	public static boolean isDate(String dateStr) {
		String regex = "\\d{8}";
		if (!Pattern.matches(regex, dateStr)) {
			return false;
		}

		// 解析年份、月份和日期
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate date = LocalDate.parse(dateStr, formatter);
			return true; // 格式正確且日期有效
		} catch (DateTimeParseException e) {
			return false; // 格式正確但日期無效（例如20241301）
		}
	}
}
