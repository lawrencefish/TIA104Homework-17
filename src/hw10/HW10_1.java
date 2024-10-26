package hw10;

public class HW10_1 {
//	請設計一隻程式，用亂數產生5個介於1～100之間的整數，
//	而輸出結果可以判斷出這5個整數為是否為質數(提示：Math類別)
	public static void main(String[] args) {
		int[] rr = new int[5];
		for (int i = 0; i < rr.length; i++) {
			rr[i] = (int) (Math.random() * 100) + 1;
			System.out.println(rr[i] + (myRandom(rr[i]) ? "是質數" : "不是質數"));
		}
	}

	public static boolean myRandom(int num) {
		if (num <= 1) return false; // 小於等於1的數不是質數
        if (num == 2) return true;  // 2 是質數
        if (num % 2 == 0) return false; // 偶數不是質數

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
	}
}
