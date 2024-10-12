package hw5;

public class TestPen {
	public static void main(String[] args) {
		Pen[] myPen = new Pen[2];
		myPen[0] = new Pencil("鉛筆", 20);
		myPen[1] = new InkBrush("毛筆", 100);
		for (int i = 0; i < myPen.length; i++) {
			myPen[i].write();
			myPen[i].getPrice();
			System.out.println("===========================");
		}
	}
}
