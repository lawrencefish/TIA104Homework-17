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
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
		int[] xd = new int[p];
		int n1, n2, n3, n4, n5, n6;
		int index = 0;
		for (int i = 1; i <= 49; i++) {
            if (i % 10 != num && i / 10 != num) {
                xd[index++] = i;
            }
        }
		
		n1 = (int) (Math.random() * p);
		do {
			n2 = (int) (Math.random() * p) + 1;
		} while (n2 == n1);
		do {
			n3 = (int) (Math.random() * p) + 1;
		} while ((n3 == n2) || (n3 == n1));
		do {
			n4 = (int) (Math.random() * p) + 1;
		} while ((n4 == n3) || (n4 == n2) || (n4 == n1));
		do {
			n5 = (int) (Math.random() * p) + 1;
		} while ((n5 == n4) || (n5 == n3) || (n5 == n2) || (n5 == n1));
		do {
			n6 = (int) (Math.random() * p) + 1;
		} while ((n6 == n5) || (n6 == n4) || (n6 == n3) || (n6 == n2) || (n6 == n1));
		System.out.println("隨機抽六個數");
		System.out.print(xd[n1] + " ");
		System.out.print(xd[n2] + " ");
		System.out.print(xd[n3] + " ");
		System.out.print(xd[n4] + " ");
		System.out.print(xd[n5] + " ");
		System.out.print(xd[n6]);
	}
}
