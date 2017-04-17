package day13.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Student student1 = new Student("zhangsan", 20, '男');
		Student student2 = new Student("lisi", 30, '男');
		Student student3 = new Student("wangwu", 19, '女');
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		for (Student student : list) {
			System.out.println(student);
		}
		
//		for (Student student : list) {
//			if ("wangwu".equals(student.getName())) {
//				list.remove(student);
//			}
//		}
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if ("lisi".equals(student.getName())) {
				iterator.remove();
			}
		}
		
		System.out.println("==============");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
