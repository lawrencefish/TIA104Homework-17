package hw5;

public class HW5_4 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}
	public static String genAuthCode() {
		char[] all = new char[62]; // 10數字+26英文大小寫=10+26+26=62
		int[] rd = new int[8];
		StringBuilder rdd = new StringBuilder();
		for (int i = 0; i < 10; i++) { // 數字1~10
			all[i] = (char) (i + 48);
		}
		for (int i = 10; i < 36; i++) { // 英文A~Z
			all[i] = (char) (i + 55);
		}
		for (int i = 36; i < 62; i++) { // 英文a~z
			all[i] = (char) (i + 61);
		}
		for (int i = 0; i < 8; i++) { // 0~61隨機8個數
			rd[i] = (int) (Math.random() * 62);
		}
		for (int i = 0; i < 8; i++) { // 輸出亂碼
			rdd.append(all[rd[i]]);
		}
		String str = rdd.toString();
		return str;
	}
}
