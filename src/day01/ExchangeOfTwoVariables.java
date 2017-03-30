package day01;

public class ExchangeOfTwoVariables {
	public static void main(String[] args) {
		// 交换两个变量的值 （num1 、num2）
		int num1 = 1;
		int num2 = 2;
		System.out.println("交换前num1的值是：" + num1);
		System.out.println("交换前num2的值是：" + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("交换后num1的值是：" + num1);
		System.out.println("交换后num2的值是：" + num2);
	}
}
