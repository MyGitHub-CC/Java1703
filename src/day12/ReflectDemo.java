package day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {
	public static void main(String[] args) {
		Class<?> clazz1 = Person.class;

		Class<?> clazz2 = null;
		try {
			clazz2 = Class.forName("day12.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Person person = new Person();
		Class<?> clazz3 = person.getClass();

		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);

		System.out.println(clazz1);
		System.out.println(clazz2);
		System.out.println(clazz3);
	}

	@Test
	public void test1() {
		Class<?> clazz = Person.class;
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
			// System.out.println(field.getName());
		}
	}

	@Test
	public void testConstructor() {
		Class<?> clazz = Person.class;
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
	}

	@Test
	public void testMethod() {
		Class<?> clazz = Person.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

	@Test
	public void testMethOf() throws Exception {
		Class<?> clazz = Person.class;
		Constructor<?> constructor = clazz.getConstructor();
		Person person = (Person) constructor.newInstance();

		Method setNameMethod = clazz.getDeclaredMethod("setName", new Class[] { String.class });
		setNameMethod.setAccessible(true);
		setNameMethod.invoke(person, new Object[] { "java" });
		String name = person.getName();
		System.out.println(name);
	}

	@Test
	public void stu() throws Exception {
		Student student = new Student();
		System.out.println(student);
		changeField(student);
		System.out.println(student);
	}

	public void changeField(Object obj) throws IllegalAccessException {
		// 1、获得对应的Class
		Class<Student> clazz = Student.class;
		// 2、获得所有的Fields
		Field[] fields = clazz.getDeclaredFields();
		// 3、遍历所有的Field，如果是String类型，将包含b的改成a
		for (Field field : fields) {
			// 3.1 如果是String类型的属性才修改
			if (field.getType() == String.class) {
				// 3.2 取出Field的值
				field.setAccessible(true);
				String oldValue = (String) field.get(obj); //student.getName();
				// 3.3 将属性的值中的b改为a
				String newValue = oldValue.replace("a", "b");
				// 3.4 将修改后的值设置到属性上
				field.set(obj, newValue); //student.setName(value);
			}
		}
	}
}
