package review.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		try {
			div(num1, num2);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("over");
	}
	
	// 运行时异常在编译的时候不会报错，只有非运行时的异常在编译时才会报错，需要try catch来解决
		public static int div(int num1, int num2) throws Exception, ArrayIndexOutOfBoundsException, ArithmeticException{
			int[] array = new int[2];
			array[3] = 10;
			return num1 / num2;
		}
}
