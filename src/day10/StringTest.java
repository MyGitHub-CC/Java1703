package day10;

import org.junit.Test;

public class StringTest {
	public static void main(String[] args) {
		// StringBuffer str = "123";
		// StringBuilder str2 = "456";
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
	}
	
	@Test
	public void test1() {
		String str = "Java android 1703";
		int index = str.indexOf('a');
		System.out.println(index);
		System.out.println(str.lastIndexOf('d'));
		
		System.out.println(str.indexOf("android"));
		System.out.println(str.contains("andriod"));
		System.out.println(str.startsWith("Java"));
		
		System.out.println(str.isEmpty());
		
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// [5, 12)
		System.out.println(str.substring(5, 12));
	}
	
	@Test
	public void test2() {
		String str = "   Java,andriod,php,python   ";
		System.out.println(str.trim());
	}
	
	@Test
	public void test3() {
		String str = "Java andriod 1703";
		System.out.println(str.replace("andriod", "123"));
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
	}
	
	@Test
	public void stringBuffer() {
		String str1 = "Java ";
		String str2 = "andriod ";
		String str3 = "1703";
		StringBuffer stringBuffer= new StringBuffer(str1);
		stringBuffer.append(str2).append(str3);
//		stringBuffer.append(str2);
//		stringBuffer.append(str3);
		System.out.println(stringBuffer);
	}
	
	
	@Test
	public void trim() {
		String str = "  Java andriod    ";
		int beginIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(i);
				beginIndex = i;
				break;
			}
		}
		
		String str2 = str.substring(beginIndex);
		System.out.println(str2);
		int endIndex = str2.length()-1;
		for (int i = endIndex; i < str2.length(); i--) {
			if (str2.charAt(i) != ' ') {
				endIndex = i + 1;
				break;
			}
		}
		
		String str3 = str.substring(beginIndex, endIndex + 1);
		System.out.println(str3);
	}
	
	@Test
	public void trim2() {
		String str = "  java 1703  ";
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		
		while ((beginIndex <= endIndex) && (str.charAt(beginIndex) == ' ')) {
			beginIndex++;
		}
		
		while ((beginIndex <= endIndex) && (str.charAt(endIndex) == ' ')) {
			endIndex--;
		}
		
		String str1 = str.substring(beginIndex, endIndex + 1);
		System.out.println(str1);
	}
}
