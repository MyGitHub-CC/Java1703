package review.listDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class ListTest {
	public static void main(String[] args) {
		Student stu1 = new Student("张三", 20);
		Student stu2 = new Student("李四", 23);
		Student stu3 = new Student("王五", 32);
		
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------");
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("--------------------");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}
	
	@Test
	public void mapList() {
		Map<String , String> map = new HashMap<String , String>();
		map.put("CN", "中华人名共和国");
		map.put("US", "美利坚合众国");
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + " and value = "
					+ entry.getValue());
		}
		
//		for (int i = 0; i < map.size(); i++) {
//			System.out.println(map.get("CN"));
//		}
	}
}
