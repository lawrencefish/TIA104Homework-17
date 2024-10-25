package hw9;

//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
public class HW9_2 {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
	}
}

class Account{
	private int money = 0; // 戶頭
	synchronized public void add(int qty) {
		while (money > 3000) {
			System.out.println("戶頭超過3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += qty;
		System.out.println("媽媽存" + qty + "，戶頭還有" + money);
		notify();
	}

	synchronized public void cost(int qty) {
		while (money < qty) {
			System.out.println("沒錢了QQ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= qty;
		System.out.println("兒子領" + qty + "，戶頭還有" + money);
		if (money < 2000) {
			System.out.println("快沒錢了，叫媽媽匯錢");
			notify();
		}
	}
}

class Mom extends Thread{
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.add(2000); // 每次生產4個
	}
}

class Son extends Thread{
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.cost(1000); // 每次消費3個
	}
}