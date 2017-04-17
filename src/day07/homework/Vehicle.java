package day07.homework;
/**
 * 作业：
 * 1、请定义一个交通工具(Vehicle)的类，其中有:
 * 属性：速度(speed)，体积(size)等等
 * 方法：移动(move())，加速speedUp(),减速speedDown()等等.
 */
public class Vehicle {
	private double speed;
	private double size;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	public void move() {
		System.out.println("速度为：" + speed + "大小为：" + size + "的物体正在移动！");
	}
	
	public void speedUp() {
		speed++;
	}
	
	public void speedDown() {
		speed--;
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}
	
	
	
}
