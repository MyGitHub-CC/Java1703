package day06.homework;

public class Square extends Graphics {
	private double sideLength = 1;

	public Square() {
		super();
	}

	public Square(double sideLength) {
		super();
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public void draw() {
		System.out.println("正在画一个边长为" + sideLength + "的正方形。");
	}
}
