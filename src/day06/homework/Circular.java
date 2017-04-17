package day06.homework;

public class Circular extends Graphics {
	private double radius;

	public Circular() {
		super();
	}

	public Circular(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("正在画一个半径为：" + radius + "的圆。");
	}
}
