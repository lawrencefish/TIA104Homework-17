package hw2;

import java.util.Scanner;

public class HW2_1 {
	public static void main(String[] args) {
		//請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for(int i = 2 ; i <= 1000 ; i += 2) {
			sum += i;
		}
		System.out.println("1～1000的偶數和=" + sum);
		
		System.out.println("========================================");
		//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int pdt = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			pdt = pdt * i;
		}
		System.out.println("1～10的連乘積=" + pdt);
		
		System.out.println("========================================");
		//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int j = 1, k = 1;
		while(j <= 10) {
			k = k * j;
			j++;
		}
		System.out.println("1～10的連乘積=" + k);
		
		System.out.println("========================================");
		//請設計一隻Java程式，輸出結果為以下：
		//1 4 9 16 25 36 49 64 81 100
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		
		System.out.println("========================================");
		//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int p = 0;
		for(int i = 1 ; i <= 49 ; i++) {
			if(i % 10 != 4 && i/10 != 4) {
				System.out.print(i + " ");
				p++;
			}
		}
		System.out.println();
		System.out.println("總共有" + p + "個");
		
		System.out.println("========================================");
//		請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for(int x = 10 ; x >= 1 ; x--) {
			for(int y = 1 ; y <= x ; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		System.out.println("========================================");
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//		使用Unicode，'A'=(char)65, 'B'=(char)66, 'C'=(char)67...
		for(int i = 1 ; i <= 6 ; i++) {
			for(int h = 1; h <= i ; h++) {
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}
