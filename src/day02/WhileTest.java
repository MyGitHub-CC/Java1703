package day02;

import java.util.Scanner;

import org.junit.Test;

public class WhileTest {
	// 打印5遍Helloworld!
	@Test
	public void test1() {
		int i = 0; // 1、循环条件的初始化
		while (i < 5) { // 2、循环条件的控制
			System.out.println("HelloWorld!");
			i++; // 3、循环条件的改变 （趋向于循环条件）
		}
	}

	// 计算1+2+3+...+100的和。
	@Test
	public void test2() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

	// 打印99乘法表最后一行
	@Test
	public void test3() {
		int i = 1;
		while (i <= 9) {
			System.out.print(i + "*9" + "=" + i * 9 + "\t");
			i++;
		}
	}

	@Test
	public void test4() {
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请猜猜这个数是多少：");
		int scanNum = scanner.nextInt();
		while (scanNum != random) {
			if (scanNum == 0) {
				System.out.println("退出成功！");
				return;
			}
			if (scanNum < random) {
				System.out.println("太小了");
				System.out.println("继续猜吧！");
			} else if (scanNum > random) {
				System.out.println("太大了");
				System.out.println("继续猜吧！");
			}
			scanNum = scanner.nextInt();
		}
		System.out.println("恭喜你！答对了！");
	}
	// 课后作业：do-while 循环做上面的题
	
	@Test
	public void doWhile() {
		int random = (int)(Math.random() * 1000 + 1);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		System.out.println("猜猜这个数！");
		int scanNum;
		do {
			scanNum = scanner.nextInt();// 初始值和改变的一致，可以用do-while
			if (scanNum == 0) {
				System.out.println("退出成功！");
				return;
			}
			if (scanNum > random) {
				System.out.println("太大了");
				System.out.println("继续猜吧！");
			} else {
				System.out.println("太小了");
				System.out.println("继续猜吧！");
			}
		} while (scanNum != random);
		System.out.println("恭喜你，答对了！");
	} 
}
