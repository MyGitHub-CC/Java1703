package day03;

import org.junit.Test;

public class ArraySortTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] array = {12, 34, 666, -1};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println(delta);
	}
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length -i -1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	@Test
	public void test1() {
		int[] array = {1, 23, 34, 56 , 788, 1001, -99};
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length -i -1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
