package day02;

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println(ifMax(3,5));
		System.out.println(threeMax(5,3));
		System.out.println(Math.max(777, 666));
	}
	
	public static int ifMax(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static int threeMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
}
