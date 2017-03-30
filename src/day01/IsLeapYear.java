package day01;

public class IsLeapYear {
	public static void main(String[] args) {
		int year = 2017;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String s = isLeapYear ? year + "是闰年"  : year + "不是闰年";
		System.out.println(s);
	}
}
