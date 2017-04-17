package day02.homework;

import java.util.Scanner;

import org.junit.Test;

public class Homework02 {
	public static void main(String[] args) {
		int[] array1 = {1, 3, 56};
		
		System.out.println(max(array1));
		System.out.println(min(array1));
		System.out.println(sum(array1));
	}
	
	// 作业：输入学生成绩，判断该学生的等级。使用switch完成。
		// [90-100]:优秀;[80-90):良好;........
		@Test
		public void studentScore() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个学生的成绩（1-100）：");
			int score = scanner.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("非法的成绩！");
				return;
			}
			switch (score / 10) {
			case 10:
			case 9:
				System.out.println("优秀");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 7:
				System.out.println("一般");
				break;
			case 6:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格");
				break;
			}
		}
		
		// 作业：打印 
		// 1
		// 12
		// 123
		// 1234
		// 12345

		@Test
		public void forFor() {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		// 3、写一个函数，名字是max，参数是int[],求出传入数组的最大值并返回.
		public static int max(int[] array) {
			int max = array[0];
			for (int i = 1; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
				}
			}
			return max;
		}
		
		// 4、写一个函数，名字是min，参数是int[],求出传入数组的最小值并返回
		public static int min(int[] array) {
			int min = array[0];
			for (int i = 1; i < array.length; i++) {
				if (min > array[i]) {
					min = array[i];
				}
			}
			return min;
		}
		
		// 传入一个整型数组，计算所有元素的和。
		public static int sum(int[] array) {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			return sum;
		}
}
