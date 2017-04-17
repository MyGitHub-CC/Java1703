package day10.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 作业：
 * 1、获取一个字符串在另一个字符串中出现的次数。
 * "abkkcdkkefkkskk"      "kk"
 * public static int getSubCount(String str, String key) ;
 * 2、实现函数public String[] toArray(List list)，其中参数list中元素类型为String字符串。
 */
public class StringHomework {
	public static void main(String[] args) {
		int count = getSubCount("abkkcdkkefkkskk","kk");
		System.out.println(count);
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghk");
		String[] strArr = toArray(list);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	
	public static int getSubCount (String str, String key) {
		int count = 0;
		int index = 0;
		//while (str.indexOf(key) != -1) {
		while ((index = str.indexOf(key, index)) != -1) {
			// str = str.substring(str.indexOf(key) + key.length());
			index = index + key.length();
			count++;
			System.out.println(str.indexOf(key, index));
		}
		
		return count;
	}
	
	public static String[] toArray(List<String> list) {
		String[] strArray = new String[list.size()];
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = list.get(i);
		}
		
		return strArray;
	}
}
