package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle mr1 = new MyRectangle();
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println(mr1.getArea());

		MyRectangle mr2 = new MyRectangle(10, 20);
		System.out.println(mr2.getArea());
	}
}
