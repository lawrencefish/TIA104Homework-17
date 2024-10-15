package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入x");
		while (!sc.hasNextInt()) {
			System.out.println("輸入格式不正確，請重新輸入x");
			sc.next();
		}
		int x = sc.nextInt();

		System.out.println("請輸入y");
		while (!sc.hasNextInt()) {
			System.out.println("輸入格式不正確，請重新輸入y");
			sc.next();
		}
		int y = sc.nextInt();

		try {
			System.out.println(c.powerXY(x, y));
		} catch (CalException ce) {
			System.out.println(ce.getMessage());
		}
	}
}
