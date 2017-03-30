package day02;

import org.junit.Test;

public class ForTest {
	@Test
	public void test1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("HelloWorld!");
		}
	}
	
	//for循环累加的思想
	@Test
	public void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}
	
	// 1-100中7的倍数
	// for循环统计的思想
	@Test
	public void elven() {
		int count =0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count=" + count);
	}
	
	// 双重for循环
	@Test
	public void doubleFor() {
		for (int i = 0; i < 3; i++) {	// 外层循环控制列
			for (int j = 0; j < 4; j++) {	// 内层循环控制行
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 作业：打印 1 \n 12 \n 123 \n 1234 \n 12345 \n
	@Test
	public void test4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	@Test
	public void nineNinetable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	@Test
	public void printForFor() {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
					System.out.print(" ");
			} 
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
