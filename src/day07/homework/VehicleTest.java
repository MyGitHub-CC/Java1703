package day07.homework;
/**
 * 最后在测试类VehicleTest中的main()中实例化一个交通工具对象，
 * 并通过方法给它初始化speed,size的值，并且通过get方法打印出来。
 * 另外，调用加速，减速的方法对速度进行改变（改变speed的值），
 * 改变后的速度值在main()方法中打印出来
 */
public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(1, 10);
		System.out.println(vehicle);
		
		vehicle.speedUp();
		System.out.println(vehicle.getSpeed());
		
		vehicle.speedDown();
		System.out.println(vehicle.getSpeed());
	}
}
