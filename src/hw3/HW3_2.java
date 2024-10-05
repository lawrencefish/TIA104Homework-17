package hw3;

import java.util.Scanner;

public class HW3_2 {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息，如圖示結果：
//	進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 101);
		System.out.print("遊戲開始，請輸入 0 ~ 100 的整數");

		while (true) {
			int guess;
			// 檢查輸入是否為有效的整數
			if (sc.hasNextInt()) {
				guess = sc.nextInt();
			} else {
				System.out.println("請輸入一個 0 ~ 100 的整數");
				continue;
			}

			if (guess < 0 || guess > 100) {
				System.out.println("請輸入一個 0 到 100 的整數！");
			} else {
				// 判斷使用者的猜測是否正確
				if (guess == num) {
					System.out.println("恭喜你猜對了！答案是 " + num);
					break; // 結束遊戲
				} else if (guess < num) {
					System.out.println("再高一點");
				} else if (guess > num) {
					System.out.println("再低一點");
				}
			}
		}
	}
}
