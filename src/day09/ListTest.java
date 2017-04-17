package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class ListTest {
	public static void main(String[] args) {
		Student[] array = new Student[2];
		Student student1 = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 22);
		array[0] = student1;
		array[1] = student2;
		
		for (int i = 0; i < array.length; i++) {
			Student stu = array[i];
			System.out.println(stu.getName());
			System.out.println(stu.getAge());
		}
		
		for (Student student : array) {
			System.out.println(student);
		}
		System.out.println("-----------------");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu);
		}
		for (Student student : list) {
			System.out.println(student);
		}
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
		
	}
	
	@Test
	public void testMap() {
		Map<String , String> map = new HashMap<String , String>();
		map.put("CN", "中华人名共和国");
		map.put("US", "美利坚合众国");
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= "
					+ entry.getValue());
		}
		
	}
}
