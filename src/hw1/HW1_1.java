package hw1;

import java.math.BigDecimal;

public class Homework1 {
	public static void main(String[] args) {
		//請設計一隻Java程式，計算12，6這兩個數值的和與積
		int i1 = 12, i2 = 6;
		int sum = i1 + i2;
		int pdt = i1 * i2;
		System.out.println(i1 +  "+" + i2 + "=" + sum);
		System.out.println(i1 +  "*" + i2 + "=" + pdt);
		
		System.out.println("========================================");
		//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200;
		int doz = egg / 12;  //宣告int，小數點後捨去
		int modEgg = egg % 12;
		System.out.println("200顆蛋共有" + doz + "打" + modEgg + "顆");
		
		System.out.println("========================================");
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		//一天 = 60秒*60分*24時 = 86,400秒，一時 = 60秒*60分 = 3,600秒
		//宣告int，小數點後捨去
		int d1 = 256559 / 86400;
		int h1 = (256559 % 86400) / 3600;
		int m1 = ((256559 % 86400) % 3600) / 60;
		int s1 = ((256559 % 86400) % 3600) % 60;
		System.out.println(d1 + "天" + h1 + "時" + m1 + "分" + s1 + "秒");

		System.out.println("========================================");
		//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		var pi = new BigDecimal("3.1415");//pi
		var r2 = new BigDecimal("10");//直徑
		var rr = new BigDecimal("25");//半徑*半徑
		var cr = pi.multiply(r2);//圓周=直徑*pi
		var ca = pi.multiply(rr);//面積=半徑*半徑*pi
		System.out.println("圓周=" + cr.stripTrailingZeros());//捨去多餘的0
		System.out.println("面積=" + ca.stripTrailingZeros());//捨去多餘的0

		System.out.println("========================================");
		//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行
		//請用程式計算10年後，本金加利息共有多少錢(用複利計算，公式請自行google)
		//【複利公式】FV ＝ PV×（1 ＋ R）n 次方
		//FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
		int PV = 1_500_000, n = 10;
		double R = 0.02;
		double FV = PV * Math.pow((1 + R), n);
		System.out.println("10年後本利和=" + (int)FV + "元");	//取整數int

		System.out.println("========================================");
		//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);		
		//int數值相加=10
		System.out.println(5 + '5');	
		//char型別'5'，Unicode'5'的16進位是35，換算10進位是53，所以5+53=58
		System.out.println(5 + "5");
		//數值與字串相加，會直接串接相連
	}
}
