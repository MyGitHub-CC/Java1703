package day02;

import java.util.Scanner;

import org.junit.Test;

public class SwitchTest {
	@Test
	public void test1() {
		// 1，2，3，4...
		char type = 'a';
		/*if (type == 0) {
			System.out.println("0");
		} else if (type == 1) {
			System.out.println("1");
		} else if (type == 2) {
			System.out.println("2");
		}*/
		
		switch (type+1) {	// type 的类型可以是 int ， short ， byte ， char 
		case 0:
			System.out.println("0");
			break;
		case 97:
			System.out.println("1");
			break;
		case 98:
			System.out.println("2");
			break;
		case 'c':
			System.out.println("3");
			break;
		default:
			System.out.println("default!");
			break;
		}
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
	
	// 输入月份、年份判断本月天数。
	@Test
	public void dayLong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份（1-12）：");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("这个月是31天！");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("这个月是30天！");
			break;
		case 2:
			System.out.println("请输入年份：");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0)
					|| (year % 400 == 0)) {
				System.out.println("这个月是29天！");
			} else {
				System.out.println("这个月是28天！");
			}
			break;

		default:
			break;
		}
	}
}
