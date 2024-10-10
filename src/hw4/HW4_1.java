package hw4;

public class HW4_1 {
	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		// 宣告陣列
		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		// 加總
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		// 計算平均值
		double average = sum / numbers.length;
		// 輸出平均值
		System.out.println("平均值 = " + average);
		System.out.print("大於平均值的元素：");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println("=======================");
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		// 定義字串
		String s1 = "Hello World";
		// 字串轉換為字元陣列
		char[] charArray1 = s1.toCharArray();
		// 建立一個新的字元陣列
		char[] charArray2 = new char[charArray1.length];
		// 使用迴圈反轉字串
		for (int i = 0; i < charArray1.length; i++) {
			charArray2[i] = charArray1[charArray1.length - 1 - i];
		}
		// 將反轉的字符陣列轉換回字串
		String s2 = new String(charArray2);
		// 輸出反轉後的字串
		System.out.println(s2);
		System.out.println("=======================");
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		// 定義字串陣列
		String[] deta = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		// 計數器
		int count = 0;
		// 母音字元
		String aeiou = "aeiou";
		for (int i = 0; i < deta.length; i++) {
			String s = deta[i];
			// 遍歷行星名稱的每個字元
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j); // 使用 charAt() 方法取得字符
				// 檢查該字元是否是母音
				if (aeiou.indexOf(c) != -1) {
					count++;
				}
			}
		}
		// 輸出母音的總數
		System.out.println("母音的總數：" + count);
	}
}
