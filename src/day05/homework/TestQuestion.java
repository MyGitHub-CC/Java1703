package day05.homework;

import java.util.Scanner;

public class TestQuestion {
	public static void main(String[] args) {
		// 1、定义一个options数组，并new一个singChoice对象，传入题干、选项及答案。
		String[] options1 = new String[] { "A:1\t", "B:2\t", "C:3\t", "D:4\t" };
		SingleChoice singleChoice = new SingleChoice("问题1：一加一等于几？", options1, "A");
		// 2、打印题干及选项。
		System.out.println(singleChoice.getText());
		for (int i = 0; i < singleChoice.getOptions().length; i++) {
			System.out.print(singleChoice.getOptions()[i]);
		}
		System.out.println();
		// 3、输入答案，并判断对错。
		Scanner scanner = new Scanner(System.in);
		String answerId = scanner.next();
		if (answerId.equals(singleChoice.getAnswerId())) {
			System.out.println("恭喜你，答对了！");
		} else {
			System.out.println("答案错误！正确答案是：" + singleChoice.getAnswerId());
		}
	}
}
