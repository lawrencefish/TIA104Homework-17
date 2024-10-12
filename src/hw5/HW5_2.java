package hw5;

public class HW5_2 {
	public static void main(String[] args) {
		randAvg();
	}
//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public static void randAvg() {
		int[] num = new int[10];
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 101);
			sum += num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println(sum/10);
	}
}
