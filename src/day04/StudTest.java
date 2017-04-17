package day04;

import java.util.Scanner;

public class StudTest {
	public static void main(String[] args) {
		// 1、创建一个学生数组
		Stud[] stuArray = new Stud[2];
		// 2、输入所有学生的信息
		inputStudentInfos(stuArray);
		// 3、打印所有学生的信息
		printAllStudentInfos(stuArray);
		// 4、查询某个某个学生的信息
		searchStudentInfos(stuArray);
	}

	public static void inputStudentInfos(Stud[] stuArray) {
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
	}
	
	public static void printAllStudentInfos(Stud[] stuArray) {
		for (int i = 0; i < stuArray.length; i++) {
			printSearchResult(stuArray[i]);
		}
	}

	public static void searchStudentInfos(Stud[] stuArray) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("请输入查询方式：（1-姓名；2-年龄；3-性别；0-退出）");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序！");
				break;
			}
			
			switch (type) {
			case 1:
				searchByName(stuArray);
				break;
			case 2:
				searchByAge(stuArray);
				break;
			case 3:
				searchByGender(stuArray);
				break;
			default:
				break;
			}
		}
	}

	public static void searchByName(Stud[] stuArray) {
		System.out.println("请输入要查询的学生姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean isSearchByName = false;
		for (int i = 0; i < stuArray.length; i++) {
			if (name.equals(stuArray[i].getName())) {
				printSearchResult(stuArray[i]);
				isSearchByName = true;
			}
		}
		if (isSearchByName == false) {
			System.out.println("没有找到该学生！");
		}
	}

	public static void searchByAge(Stud[] stuArray) {
		System.out.println("请输入要查询的学生年龄：");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		boolean isSearchByAge = false;
		for (int i = 0; i < stuArray.length; i++) {
			if (age == stuArray[i].getAge()) {
				printSearchResult(stuArray[i]);
				isSearchByAge= true;
			}
		}
		if (isSearchByAge == false) {
			System.out.println("没有找到该学生！");
		}
	}
	
	public static void searchByGender(Stud[] stuArray) {
		System.out.println("请输入要查询的学生性别：");
		Scanner scanner = new Scanner(System.in);
		char gender = scanner.next().charAt(0);
		boolean isSearchByGender = false;
		for (int i = 0; i < stuArray.length; i++) {
			if (gender == stuArray[i].getGender()) {
				printSearchResult(stuArray[i]);
				isSearchByGender = true;
			}
		}
		if (isSearchByGender== false) {
			System.out.println("没有找到该学生！");
		}
	}
	
	public static void printSearchResult(Stud stu) {
		System.out.println("学生的姓名是：" + stu.getName());
		System.out.println("学生的年龄是：" + stu.getAge());
		System.out.println("学生的性别是：" + stu.getGender());
		System.out.println("学生的成绩是：" + stu.getScore());
	}
}
