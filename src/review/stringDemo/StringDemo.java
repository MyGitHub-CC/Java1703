package review.stringDemo;

import org.junit.Test;

public class StringDemo {
	public static void main(String[] args) {
		
		
	}
	
	@Test
	public void test1() {
		String str1 = "1212";
		String str2 = "123";
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1);
		System.out.println(num2);
	}
	
	@Test
	public void test2() {
		int num3 = 555;
		String str3 = num3 + "";
		String str4 = Integer.toString(num3);
		String str5 = String.valueOf(num3);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
	
	@Test
	public void test3() {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
	}
	
}
