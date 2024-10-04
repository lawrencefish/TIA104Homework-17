package hw3;

import java.util.Scanner;

public class HW3_3 {
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數，如圖：
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, p = 0;
		System.out.println("請輸入1 ~ 9的正整數");
		while (true) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				if (num >= 1 && num <= 9) {
					break;
				} else {
					num = 0;
					System.out.println("請輸入1 ~ 9的正整數");
				}
			} else {
				System.out.println("請輸入1 ~ 9的正整數");
				continue;
			}
		}
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != num && i / 10 != num) {
				System.out.print(i + " ");
				p++;
			}
		}
		System.out.println();
		System.out.println("總共有" + p + "個");
	}
}
