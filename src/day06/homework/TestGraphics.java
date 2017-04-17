package day06.homework;

import org.junit.Test;

public class TestGraphics {
	public static void main(String[] args) {

	}

	@Test
	public void testMethod1() {
		Graphics graphics = new Square();
		graphics.draw();

		graphics = new Rectangle();
		graphics.draw();

		graphics = new Circular();
		graphics.draw();

		print(graphics);
		print(graphics);
		print(graphics);

		if (graphics instanceof Square) {
			Square square = (Square) graphics;
			square.setSideLength(2);
			square.draw();
			print(square);
		} else if (graphics instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) graphics;
			print(rectangle);
		} else if (graphics instanceof Circular) {
			Circular circular = (Circular) graphics;
			print(circular);
		}
	}

	public void print(Graphics graphics) {
		System.out.println("这是一个图形。");
	}

	public void print(Square square) {
		System.out.println("这是一个正方形。");
	}

	public void print(Rectangle rectangle) {
		System.out.println("这是一个矩形。");
	}

	public void print(Circular circular) {
		System.out.println("这是一个圆形。");
	}
}
