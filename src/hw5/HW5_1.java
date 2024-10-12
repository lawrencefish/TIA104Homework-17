package hw5;

import java.util.Scanner;

public class HW5_1 {
	public static void main(String[] args) {
		HW5_1 nw = new HW5_1();
		nw.starSquare();
	}

//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	public void starSquare() {
		System.out.println("請輸入寬、高");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print("*");
			}
		}
	}
}
