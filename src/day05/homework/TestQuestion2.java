package day05.homework;

import java.util.Scanner;

public class TestQuestion2 {
	public static void main(String[] args) {
		// 1、new一个对象，并传入题干、选项及答案。
		String[] options1 = new String[] { "A:1\t", "B:2\t", "C:3\t", "D:4\t" };
		String[] trueAnswerId = { "B", "C", "D" };
		MultiChoice multiChoice = new MultiChoice("问题1：一加一不等于几？", options1, trueAnswerId);
		// 2、打印多选题的题干及答案。
		System.out.println(multiChoice.getText());
		for (int i = 0; i < multiChoice.getOptions().length; i++) {
			System.out.print(multiChoice.getOptions()[i]);
		}
		System.out.println();
		// 3、接收用户输入的多选题答案。
		Scanner scanner = new Scanner(System.in);
		String[] answerId = new String[3];
		for (int i = 0; i < answerId.length; i++) {
			String answ = scanner.next();
			answerId[i] = answ;
		}
		// 4、判断用户的答案是否正确。
		String[] tureAnswerId = multiChoice.getAnswerIds();
		if (answerId[0].equals(tureAnswerId[0]) 
				&& answerId[1].equals(tureAnswerId[1]) && answerId[2].equals(tureAnswerId[2])) {
			System.out.println("恭喜你，答对了！");
		} else {
			System.out.println("答案错误！正确答案是：" + multiChoice.getAnswerIds());
		}
	}
}
