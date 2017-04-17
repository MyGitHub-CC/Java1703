package day04.homework;
/**
 * 定义一个矩形类，有计算面积与周长的方法。
 */
public class Rectangular {
	private double length;
	private double width;
	
	public Rectangular() {
	}

	public Rectangular(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getPerimeter() {
		return (length + width) *2;
	}
	
	public double getArea() {
		return length * width;
	}
}
