package hw5;

public abstract class Pen {
	private String brand;
	private double price;

	public Pen() {
	}

	public Pen(String brand, double price) {
		if (price > 0) {
			this.brand = brand;
			this.price = price;
		} else {
			System.out.println("價格輸入錯誤");
		}
	}

	public void getBrand() {
		System.out.println("brand=" + brand);
	}

	public void getPrice() {
		System.out.println("price=" + price);
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("價格輸入錯誤");
		}
	}

	public abstract void write();
}

class Pencil extends Pen {
	public Pencil(String brand, double price) {
		super(brand, price * 0.8);
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}

class InkBrush extends Pen {
	public InkBrush(String brand, double price) {
		super(brand, price * 0.9);
	}

	public void write() {
		System.out.println("沾墨汁再寫");
	}
}