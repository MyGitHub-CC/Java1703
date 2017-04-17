package day13.homework;

/**
 * 学生信息管理系统：
 * 1、序列化保存和读取
 * 2、添加可以删除学生的功能
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentInfos {
	public static void main(String[] args) {
		// 1、创建一个学生数组
		List<Student> studentList = new ArrayList<Student>();
		// 2、输入所有学生的信息
		inputStudentInfos(studentList);

		// 输出流写入，输入流读出
		outputANDinput(studentList);
		// 删除指定学生的信息
		deleteStudent(studentList);
		// 3、打印所有学生的信息
		printAllStudentInfos(studentList);
		// 4、查询某个某个学生的信息
		searchStudentInfos(studentList);
	}

	public static void deleteStudent(List<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("是否要删除学生：0- 退出 ,1-进入删除功能");
		int type = scanner.nextInt();
		if (type == 0) {
			System.out.println("退出删除功能！");
			return;
		} else if (type == 1) {
			System.out.println("请输入要删除的学生姓名: ");
			String name = scanner.next();
			Iterator<Student> iterator = studentList.iterator();
			while (iterator.hasNext()) {
				Student student = iterator.next();
				if (name.equals(student.getName())) {
					iterator.remove();
				}
			}
		}
	}

	public static void inputStudentInfos(List<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("录入完成请输入：0 , 按任意非“0”键继续输入");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("录入完成！");
				break;
			}
			System.out.println("请输入学生的姓名： ");
			String name = scanner.next();
			System.out.println("请输入学生的年龄： ");
			int age = scanner.nextInt();
			System.out.println("请输入学生的性别： ");
			char gender = scanner.next().charAt(0);
			Student student = new Student(name, age, gender);
			studentList.add(student);

		}
	}

	public static void printAllStudentInfos(List<Student> studentList) {
		for (Student stu : studentList) {
			System.out.println(stu);
		}
	}

	public static void outputANDinput(List<Student> studentList) {
		System.out.println("OutputStream and InputStream :");
		for (Student student2 : studentList) {
			OutputStream outputStream = null;
			ObjectOutputStream objectOutputStream = null;
			try {
				outputStream = new FileOutputStream(new File("student01.txt"));
				objectOutputStream = new ObjectOutputStream(outputStream);
				objectOutputStream.writeObject(student2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (null != objectOutputStream) {
					try {
						objectOutputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (null != outputStream) {
					try {
						outputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			InputStream inputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				inputStream = new FileInputStream("student01.txt");
				objectInputStream = new ObjectInputStream(inputStream);
				student2 = (Student) objectInputStream.readObject();
				System.out.println(student2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				if (null != objectInputStream) {
					try {
						objectInputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (null != inputStream) {
					try {
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void searchStudentInfos(List<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入查询方式：");
			System.out.println("按照姓名查找请输入：1");
			System.out.println("按照年龄查找请输入：2");
			System.out.println("按照性别查找请输入：3");
			System.out.println("退出：0");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出成功！");
				break;
			}

			switch (type) {
			case 1:
				isSearchByNameFound(studentList);
				break;
			case 2:
				isSearchByAgeFound(studentList);
				break;
			case 3:
				isSearchByGenderFound(studentList);
				break;
			default:
				break;
			}
		}
	}

	public static void isSearchByNameFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean isSearchByNameFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (name.equals(studentList.get(i).getName())) {
				System.out.println(studentList.get(i));
				isSearchByNameFound = true;
			}
		}
		if (!isSearchByNameFound) {
			System.out.println("没有找到该学生！");
		}
	}

	public static void isSearchByAgeFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生年龄：");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		boolean isSearchByAgeFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (age == studentList.get(i).getAge()) {
				System.out.println(studentList.get(i));
				isSearchByAgeFound = true;
			}
		}
		if (!isSearchByAgeFound) {
			System.out.println("没有找到该学生！");
		}
	}

	public static void isSearchByGenderFound(List<Student> studentList) {
		System.out.println("请输入要查询的学生性别：");
		Scanner scanner = new Scanner(System.in);
		char gender = scanner.next().charAt(0);
		boolean isSearchByGerderFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (gender == studentList.get(i).getGender()) {
				System.out.println(studentList.get(i));
				isSearchByGerderFound = true;
			}
		}
		if (!isSearchByGerderFound) {
			System.out.println("没有找到该学生！");
		}
	}

}
