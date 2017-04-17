package day04.homework;

public class PerAndCirTest {
	public static void main(String[] args) {
		Rectangular rect = new Rectangular();
		rect.setLength(3);
		rect.setWidth(4);
		double peri = rect.getPerimeter();
		double area = rect.getArea();
		System.out.println(peri);
		System.out.println(area);
		
		Circular ciru = new Circular();
		ciru.setRadius(5);
		System.out.println(ciru.getPerimeter());
		System.out.println(ciru.getArea());
	}
}
