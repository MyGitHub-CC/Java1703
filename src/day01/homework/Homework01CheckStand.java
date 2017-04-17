package day01.homework;

import java.util.Scanner;

/**
 * Homework day01:
 * 作业：
 * 1、编写一个收银台收款程序，if
 * 定义输入----单价、数量、金额
 * 定义输出----应收金额、找零
 * 使用double类型变量
 * 
 * 2、当总价>=500时候打八折
 * 
 * 3、考虑程序出现异常的情况，如：收款金额小于应收金额
 *  若收款金额大于等于应收金额，则计算找零后输出
 *  若收款金额小于应收金额，输出错误信息。
 */
public class Homework01CheckStand {
	public static void main(String[] args) {
		// 1、定义输入----单价、数量、金额
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个单价");
		double price = scanner.nextDouble();
		System.out.println("请输入一个数量");
		double count = scanner.nextDouble();
		double  receivable = price * count;
		// 2、当总价>=500时候打八折
		if (receivable >= 500) {
			receivable = receivable * 0.8;
		}
		System.out.println("应收金额为：￥" + receivable);
		// 定义输出----应收金额、找零
		System.out.println("请输入一个实收金额");
		double  paid = scanner.nextDouble();
		/*3、考虑程序出现异常的情况，如：收款金额小于应收金额
		 *  若收款金额大于等于应收金额，则计算找零后输出
		 *  若收款金额小于应收金额，输出错误信息
		 */
		if (paid < receivable) {
			System.out.println("收款金额不足！");
			return;
		} 
		double change =  paid - receivable;
		System.out.println("应找零为：" + change);
	}
}
