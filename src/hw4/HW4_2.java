package hw4;

import java.util.Scanner;

public class HW4_2 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//	表如下：
//	員工編號		25		32		8		19		27
//	身上現金		2500	800		500		1000	1200
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!」
//	(提示：Scanner，二維陣列)
	public static void main(String[] args) {
		int[][] colleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		System.out.println("小華，想借多少？");
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		System.out.print("有錢可以借的員工編號：");
		for (int i = 0; i < colleague[1].length; i++) {
			if (colleague[1][i] >= cash) {
				System.out.print(colleague[0][i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("共 " + count + " 人");
		if(count==0) {
			System.out.println("沒那麼多錢！");
		}
	}
}