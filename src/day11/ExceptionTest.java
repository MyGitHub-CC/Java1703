package day11;


public class ExceptionTest {
	public static void main(String[] args) {
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		try {
//			int result = div(6, 0);
//			System.out.println(result);
//		}catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
//		System.out.println("over");
		
		
		try {
			div(6, 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
	
	// 运行时异常在编译的时候不会报错，只有非运行时的异常在编译时才会报错，需要try catch来解决
	public static int div(int num1, int num2) throws Exception, ArithmeticException, ArrayIndexOutOfBoundsException{
		// Student student = null;
		// student.getName();
		int[] array = new int[2];
		array[2] = 20;
		
		return num1 / num2;
	}
	
}
