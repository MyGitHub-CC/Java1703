package review.stringDemo;

import org.junit.Test;

public class StringMethodTest {
	
	@Test
	public void test1() {
		String str = "Java andriod 1703 ddd";
		char ch = str.charAt(0);
		System.out.println("ch: " + ch);
		
		int index1 = str.indexOf('a');
		System.out.println("index1: " + index1);
		
		System.out.println("lastIndexOf(d): " + str.lastIndexOf('d'));
		
		int index2 = str.indexOf('a', index1 + 1);
		System.out.println("index2: " + index2);
	}
	
	@Test
	public void test2() {
		String str = "   Java andriod 1703   ";
		System.out.println(str.isEmpty());
		System.out.println(str.contains("Java"));
		System.out.println(str.concat("170"));
		System.out.println(str.replace("Java", "python"));
	}
	
	@Test
	public void stringBuffer() {
		String str1 = "Java ";
		String str2 = "andriod ";
		String str3 = "1703 ";
		String str4 = "班 ";
		StringBuffer stringBuffer = new StringBuffer(str1);
		stringBuffer.append(str2).append(str3).append(str4);
		System.out.println(stringBuffer);
	}
}
