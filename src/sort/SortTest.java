package sort;

import mergeSort.MergeSort;
import quickSort.*;
import insertSort.InsertSort;
import bubbleSort.BubbleSort;

public class SortTest {
	
	public static final int LENGTH = 10000000;
	public static void main(String[] args) {
//		int[] array = {23,45,67,12,33,89,98,92,37,68,4,34,66,65,97,90,24};
		int[] array = new int[LENGTH];
		randomInitialize(array);
		
		long begin = System.currentTimeMillis();
//		BubbleSort.bubbleOptimize(array);
//		InsertSort.insertSort(array);
//		MergeSort.mergeSort(array);
//		QuickSort.quickSort(array);
		QuickSort.quicksort(array,0,array.length-1);
//		java.util.Arrays.sort(array);
		long end = System.currentTimeMillis();
		
//		printArray(array);
		
		System.out.println("Time Usage:" + (end-begin));
		check(array);
	}
	
	private static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(i + ",");
		}
		System.out.print("\n");
	}
	
	private static void check(int[] array) {
		for(int i=1;i<array.length;i++) {
			if(array[i-1] > array[i]) {
				System.out.println("Check Fail!");
				return;
			}
		}
		
		System.out.println("Check Success!");
	}
	
	private static void randomInitialize(int[] array) {
		for(int i=0;i<array.length;i++) {
			int j = (int)(Math.random()*array.length*3);
			array[i] = j;
		}
	}
}
