package day04;
/**
 * 定义一个圆形类，有计算图形和周长的方法。
 */
public class Circular {
	double radius;
	
	public double perimeter() {
		double cirPerimeter = 2  * Math.PI * radius;
		return cirPerimeter;
	}
	
	public double area() {
		double cirArea = Math.PI * radius * radius;
		return cirArea;
	}
}
