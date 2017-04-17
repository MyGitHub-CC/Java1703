package day04.homework;
/**
 * 描述动物、 狗、 鱼 三个类，动物都具备name、 color两个属性、 动物都具备移动的行为。
 * 狗特有的一个方法就是咬人。 鱼特有的一个行为：吹泡泡。
 */
public class Animal {
	private String name;
	private String color;
	
	public Animal() {
		super();
	}

	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println(color + name + "会移动");
	}
}
