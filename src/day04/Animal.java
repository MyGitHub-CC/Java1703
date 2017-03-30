package day04;
/**
 * 描述动物、 狗、 鱼 三个类，动物都具备name、 color两个属性、 动物都具备移动的行为。
 * 狗特有的一个方法就是咬人。 鱼特有的一个行为：吹泡泡。
 */
public class Animal {
	String name;
	String color;
	
	public void move() {
		System.out.println("会移动");
	}
}
