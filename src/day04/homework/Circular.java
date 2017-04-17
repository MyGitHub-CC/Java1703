 package day04.homework;
/**
 * 定义一个圆形类，有计算图形和周长的方法。
 */
public class Circular {
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

	public double getPerimeter() {
		return 2  * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
