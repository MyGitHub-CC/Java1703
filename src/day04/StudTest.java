package day04;

import java.util.Scanner;

public class StudTest {
	public static void main(String[] args) {
		Stud[] stuArray = new Stud[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("请输入第" + (i + 1) + "学生姓名：");
			String name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "学生性别：");
			char gender = scanner.next().charAt(0);
			System.out.println("请输入第" + (i + 1) + "学生成绩：");
			int score = scanner.nextInt();
			Stud student = new Stud(name, age, gender, score);
			stuArray[i] = student;
		}
		
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("学生的姓名是：" + stuArray[i].getName());
			System.out.println("学生的年龄是：" + stuArray[i].getAge());
			System.out.println("学生的性别是：" + stuArray[i].getGender());
			System.out.println("学生的成绩是：" + stuArray[i].getScore());
		}
		
		while(true) {
			System.out.println("请输入查询方式：（1-姓名；2-年龄；3-性别；0-退出）");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序！");
			}
			switch (type) {
			case 1:
				System.out.println("请输入要查询的学生姓名：");
				String name = scanner.next();
				boolean isSearchByName = false;
				for (int i = 0; i < stuArray.length; i++) {
					if (name.equals(stuArray[i].getName())) {
						System.out.println("学生的姓名是：" + stuArray[i].getName());
						System.out.println("学生的年龄是：" + stuArray[i].getAge());
						System.out.println("学生的性别是：" + stuArray[i].getGender());
						System.out.println("学生的成绩是：" + stuArray[i].getScore());
						isSearchByName = true;
					}
				}
				if (isSearchByName == false) {
					System.out.println("没有找到该学生！");
				}
				break;
			case 2:
				System.out.println("请输入要查询的学生年龄：");
				int age = scanner.nextInt();
				boolean isSearchByAge = false;
				for (int i = 0; i < stuArray.length; i++) {
					if (age == stuArray[i].getAge()) {
						System.out.println("学生的姓名是：" + stuArray[i].getName());
						System.out.println("学生的年龄是：" + stuArray[i].getAge());
						System.out.println("学生的性别是：" + stuArray[i].getGender());
						System.out.println("学生的成绩是：" + stuArray[i].getScore());
						isSearchByAge= true;
					}
				}
				if (isSearchByAge == false) {
					System.out.println("没有找到该学生！");
				}
				break;
			case 3:
				System.out.println("请输入要查询的学生性别：");
				char gender = scanner.next().charAt(0);
				boolean isSearchByGender = false;
				for (int i = 0; i < stuArray.length; i++) {
					if (gender == stuArray[i].getGender()) {
						System.out.println("学生的姓名是：" + stuArray[i].getName());
						System.out.println("学生的年龄是：" + stuArray[i].getAge());
						System.out.println("学生的性别是：" + stuArray[i].getGender());
						System.out.println("学生的成绩是：" + stuArray[i].getScore());
						isSearchByGender = true;
					}
				}
				if (isSearchByGender== false) {
					System.out.println("没有找到该学生！");
				}
				break;
			default:
				break;
			}
		}
	}

}
