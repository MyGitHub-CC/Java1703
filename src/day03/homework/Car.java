package day03.homework;
/**
 * 作业：
 * 创建汽车类Car，包含：
 * 属性：brand(品牌)，price(价格)，color(颜色)
 * 方法：show()用于输出汽车对象的3个属性
 * 		startup()用于输出brand品牌的汽车启动
 * 创建CarTest类，在main中：
 * 创建Car的两个对象，并给属性赋值，再调用方法。
 *
 */

public class Car {
	String brand;
	double price;
	String color;
	
	public void show() {
		System.out.println("汽车的品牌是：" + brand);
		System.out.println("汽车的价格是：" + price);
		System.out.println("汽车的颜色是："  + color);
	}
	
	public void startup() {
		System.out.println(brand + "的汽车启动");
	}
	
}
