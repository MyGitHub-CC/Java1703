package day03;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArrray = new Student[2];
		inputStudentInfos(studentArrray);
		printStudentInfo(studentArrray);
	}

	public static void inputStudentInfos(Student[] studentArrray) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < studentArrray.length; i++) {
			Student students = new Student();
			System.out.println("请输入第" + (i + 1) + "个学生姓名：");
			students.name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "个学生年龄：");
			students.age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "个学生性别：");
			students.gender = scanner.next().charAt(0);
			studentArrray[i] = students;
		}
	}

	public static void printStudentInfo(Student[] studentArrray) {
		for (int i = 0; i < studentArrray.length; i++) {
			System.out.println("姓名：" + studentArrray[i].name);
			System.out.println("年龄：" + studentArrray[i].age);
			System.out.println("性别：" + studentArrray[i].gender);
		}
	}
}
