package hw3;

import java.util.Scanner;

public class HW3_1 {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字: ");
		double n1 = check(sc);
		double n2 = check(sc);
		double n3 = check(sc);

		// 檢查是否為三角形
		if ((n1 * n2 * n3 != 0) && ((n1 + n2) > n3) && (n2 + n3 > n1) && (n3 + n1 > n2)) {
			if (n1 == n2 && n2 == n3) {
				System.out.println("正三角形");
			} else if (rightTriangle(n1, n2, n3)) {
				System.out.println("直角三角形");
			} else if (n1 == n2 || n2 == n3 || n1 == n3) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}

	// check 方法：輸入INT或DOUBLE都指定給DOUBLE
	public static double check(Scanner sc) {
		double deta = 0;
		if (sc.hasNextInt()) {
			deta = sc.nextInt();
		} else if (sc.hasNextDouble()) {
			deta = sc.nextDouble();
		} else {
			System.out.println("輸入的不是有效數字，請輸入數字。");
		}
		return deta;
	}

	// rightTriangle方法，檢查是否為直角
	public static boolean rightTriangle(double a, double b, double c) {
		double max = Math.max(a, Math.max(b, c));
		if (max == a) {
			return (b * b + c * c) == (a * a);
		} else if (max == b) {
			return (a * a + c * c) == (b * b);
		} else {
			return (a * a + b * b) == (c * c);
		}
	}
}