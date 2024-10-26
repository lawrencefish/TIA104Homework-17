package hw10;

import java.util.Formatter;
import java.util.Scanner;

public class HW10_2 {
//	請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種
//	表示方法顯示(1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息
//	如圖(提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Formatter fm = new Formatter();
		System.out.print("請輸入一個數字：");
		String input = scanner.nextLine();

		// 檢查是否為有效的數字格式（可為整數或小數）
		if (!input.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("輸入無效，請輸入一個有效的數字。");
			return;
		}

		// 將輸入轉換為數字
		double number = Double.parseDouble(input);

		// 顯示選項給使用者
		System.out.println("請選擇顯示格式：");
		System.out.println("(1) 千分位");
		System.out.println("(2) 百分比");
		System.out.println("(3) 科學記號");
		System.out.print("請輸入選項 (1-3)：");

		int choice = scanner.nextInt();
		scanner.close();

		// 格式化輸出
		switch (choice) {
		case 1:
			// 千分位
			System.out.println("千分位格式：" + fm.format("%,.2f", number));
			break;
		case 2:
			// 百分比
			System.out.println("百分比格式：" + fm.format("%.2f%%", number * 100));
			break;
		case 3:
			// 科學記號
			System.out.println("科學記號格式：" + fm.format("%e", number));
			break;
		default:
			System.out.println("選項無效，請輸入 1 到 3 之間的數字。");
		}
	}
}