package day04;
/**
 * 定义一个矩形类，有计算面积与周长的方法。
 */
public class Rectangular {
	double length;
	double width;
	
	public double perimeter() {
		double perimeter = (length + width) *2;
		return perimeter;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
}
