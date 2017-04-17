package review.exception;

public class ErrorDemo {
	public static void main(String[] args) {
		fun(); // Exception in thread "main" java.lang.StackOverflowError
		System.out.println("over ---");
	}
	
	public static void fun() {
		fun();
	}
	
}
