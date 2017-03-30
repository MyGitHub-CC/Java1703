package day01;

import java.util.Scanner;

import org.junit.Test;

public class IfDemo {
	@Test
	public void test1() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num1 = scanner.nextInt();
		if (num1 > 100) {
			System.out.println(num1);
		} else {
			System.out.println("num1 <= 100");
		}
		System.out.println("over");
	}
	
	/**
	 * 判断学生的成绩等级
	 * >=90 && <=100:优秀
	 * >=80 && <90 :良好
	 * >=70 && <80 :一般
	 * >=60 && <70 :及格
	 * >=0 && <60 :不及格
	 */
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个成绩：");
		int score = scanner.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("非法的成绩!");
			return;
		}
		if (score <= 100 && score >= 90) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
