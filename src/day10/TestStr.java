package day10;

public class TestStr {
	public static void main(String[] args) {
		String str1 = "12.56";
		String str2 = "6.3";
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);
		double result = d1 / d2;
		System.out.println(result);
		
		int num1 = 33;
		String str4 = num1 + "";
		String str3 = Integer.toString(num1);
		System.out.println(str3);
		System.out.println(str4);
	}
	
}
