package day02;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		int[] array2 = {3, 5, 9};
//		int[] array3 = new int[]{3, 5, 9};
		array1[0] = 1;
		array1[1] = 5;
		array1[2] = 9;
		System.out.println(array1.length);
		System.out.println(array1[array1.length-1]);
		System.out.println("-----------------");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("-----------------");
		for (int i = array2.length - 1; i >=0 ; i--) {
			System.out.println(array2[i]);
		}
	}
}
