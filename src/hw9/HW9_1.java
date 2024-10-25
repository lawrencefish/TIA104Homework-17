package hw9;


//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//• 參考範例：CounterRunnable.java
//• 需留意主執行緒執行順序
public class HW9_1 {
	public static void main(String[] args) {
		Eat e1 = new Eat("詹姆士");
		Eat e2 = new Eat("饅頭人");

		System.out.println("大衛王比賽開始！");
		try {
			e1.t.join();
			e2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("大衛王比賽結束！");
	}
}

class Eat implements Runnable {
	private String name;
	Thread t;

	public Eat(String name) {
		this.name = name;
		t = new Thread(this, name); // 建構元內即同時建構執行緒
		t.start(); // 啟動執行緒
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + "吃完第" + i + "碗飯");
			int w = (int) (Math.random() * 2501) + 500;
			if (i < 10) {
				try {
					Thread.sleep(w); // 暫停
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
	}
}