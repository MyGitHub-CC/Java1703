package day01;
import org.junit.Test;


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld!");
	}
	
	@Test
	public void test1() {
		// char 2个字节
		// Unicode码
		char c1 = 'a';
		System.out.println(c1);
		System.out.println(c1 + 0);
		
//		char c2 = '字';
//		char c3 = ' ';
		System.out.println(c1 + 1);
		System.out.println((char)(c1 + 1));
		// int 的取值范围
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	@Test
	public void test2() {
		// 逻辑运算符
		int num1 = 3;
		int num2 = 5;
		System.out.println(num1 > 0 && num1 <num2);
		System.out.println(num1 < 0 && num1 <num2);
		System.out.println(num1 < 0 || num1 <num2);
	}
	
	@Test
	public void test3() {
		// i++ ++i
		int i = 3;
		i++;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
	}
	
	@Test
	public void test4() {
		// 短路问题
		int num1 = 3;
		int num2 = 5;
		// 短路&&
		/*System.out.println(num1 < 0 && num1++ > num2);
		System.out.println(num1);
		System.out.println(num2);*/
		
		//短路 ||
		System.out.println(num1 > 0 || num1 > num2++);
		System.out.println(num1);
		System.out.println(num2);
	}
	
	@Test
	public void test5() {
		short s = 5;// 右侧的值得范围只要不超过short
//		Type mismatch: cannot convert from int to short
//		s = s + 3;
		
		byte b1 = 3;
		byte b2 = 5;
		/*Type mismatch: cannot convert from int to byte
		byte num = b1 + b2;*/
		System.out.println(s + b1 + b2);
	}
	
	@Test
	public void isLeapYear() {
		int year = 2017;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String s = isLeapYear ? year + "是闰年"  : year + "不是闰年";
		System.out.println(s);
	}
	
	@Test
	public void test7() {
		// 分解一个三位数：386	分别打印这个数的个位、十位、百位上的数的值。
		int num = 386;
		int bai = num / 100;
		int shi = num % 100 /10;
		int ge = num % 100 % 10;
		System.out.println(num + "的百位数是：" + bai);
		System.out.println(num + "的十位数是：" + shi);
		System.out.println(num + "的个位数是：" + ge);
	}
}
