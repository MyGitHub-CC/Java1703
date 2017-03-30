package day03;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Car[] carArray = new Car[2];
		inputCarInfos(carArray);
		printCarInfos(carArray);
		
	}

	public static void inputCarInfos(Car[] carArray) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < carArray.length; i++) {
			Car car = new Car();
			System.out.println("请输入汽车品牌：");
			car.brand = scanner.next();
			System.out.println("请输入汽车价格：");
			car.price = scanner.nextInt();
			System.out.println("请输入汽车颜色：");
			car.color = scanner.next();
			carArray[i] = car;
		}
	}
	
	public static void printCarInfos(Car[] carArray) {
		for (int i = 0; i < carArray.length; i++) {
			carArray[i].show();
			carArray[i].startup();
		}
	}
}
