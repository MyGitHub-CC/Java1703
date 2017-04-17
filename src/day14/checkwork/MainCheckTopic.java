package day14.checkwork;

import org.junit.Test;


/**
 * 1、1-100的累加和 while和for 
 * 2、写一个函数参数是int[],然后打印数组中的每一个值
 * 3、写一个函数参数是int[],返回值是所有元素的累加和 public int sum(int[] array)
 * 4、写一个抽象类AbstractPerson（name,age,抽象的show(),
 * 子类Student继承AbstractPerson，实现抽象方法，利用多态的方式调用一下。
 * 5、写一个线程，打印1-100以内的奇数。
 */
public class MainCheckTopic {
	public static void main(String[] args) {
		// 2.写一个函数参数是int[],然后打印数组中的每一个值
		int[] intArr = new int[]{12, 55, 66, 898};
		printArray(intArr);
		
		System.out.println();
		System.out.println("--------------");
		// 3.写一个函数参数是int[],返回值是所有元素的累加和 public int sum(int[] array)
		int result = sum(intArr);
		System.out.println(result);
		
		// 4.写一个抽象类AbstractPerson（name,age,抽象的show(),
		// 子类Student继承AbstractPerson，实现抽象方法，利用多态的方式调用一下。
		AbstractPerson abstractPerson = new Student();
		abstractPerson.show();
		
		// 5.写一个线程，打印1-100以内的奇数。
		Thread thread = new OddThread(1);
		thread.start();
	}
	
	
	/**
	 * 1.1 用for循环计算1-100的和
	 */
	@Test
	public void forsum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	/**
	 * 1.2 用while循环计算1-100的和
	 */
	@Test
	public void whilesum() {
		int sum = 0;
		int i = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
	
	/**
	 * 2.传入一个int[]类型的数组，打印数组中的每一个元素
	 */
	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
	}
	
	/**
	 * 3.传入一个数组，返回这个数组中所有元素的和
	 * @param array
	 * @return
	 */
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
}
