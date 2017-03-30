package day03;

import java.util.Scanner;

import org.junit.Test;

public class ArrayTest {
	public static void main(String[] args) {
		
	}
	
	/**
	 * 求一个数组中0-9出现的次数
	 */
	@Test
	public void test1() {
		int[] score = {0, 0, 1, 2, 5, 7, 8, 6, 5};
		int[] count = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			default:
				break;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "出现的个数是：" + count[i]);
		}
	}
	
	/**
	 * 求一个数组的奇数个数和偶数个数
	 */
	@Test
	public void test2() {
		int[] score = {0, 1, 2, 56, 88, 15};
		int even = 0;
		int odd = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("奇数个数为：" + odd);
		System.out.println("偶数个数为：" + even);
	}
	
	/**
	 * 输入一组学生的成绩，计算出他们的平均值。
	 */
	@Test
	public void test3() {
		int[] score = new int[2];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入学生成绩：");
			score[i] = scanner.nextInt();
			sum += score[i];
		}
		int avg = sum /score.length;
		System.out.println("平均成绩为：" + avg);
	}
	
	
	@Test
	public void test10() {
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
