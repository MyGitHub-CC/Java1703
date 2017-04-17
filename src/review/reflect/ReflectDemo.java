package review.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {
	public static void main(String[] args) {
		
	}

	@Test
	public void newClazzMeth1() {
		Class<?> clazz = Person.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
	}
	
	@Test
	public void newClazzMeth2() throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Person person = new Person();
		Class<?> clazz = person.getClass();
		Constructor<?> constructor = clazz.getConstructor();
		Person person1 = (Person) constructor.newInstance();
		person1.setName("zhangsan");
		String name = person1.getName();
		System.out.println(name);
	}
	
	@Test
	public void newClazzMeth3() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("review.Person");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}
	
	@Test
	public void studentTest() throws IllegalArgumentException, IllegalAccessException {
		Student student = new Student();
		System.out.println(student + "  old");
		
		changeField(student);
		System.out.println(student + "  new");
	}

	public void changeField(Object obj) throws IllegalAccessException {
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if(field.getType() == String.class) {
				field.setAccessible(true);
				String oldValue = (String) field.get(obj);
				String newValue = oldValue.replace("a", "b");
				field.set(obj, newValue);
			}
		}
	}
}
