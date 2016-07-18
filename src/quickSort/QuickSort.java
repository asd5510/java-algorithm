package quickSort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {23,45,67,12,33,89,98,92,37,68,4,34,66,65,97,90,24,32,32};
		quicksort(array,0,array.length-1);
		for(int iterator : array) {
			System.out.print(iterator + ",");
		}
		System.out.print("\n");
	}
	
	public static void quickSort(int[] array) {
		recursion(array,0,array.length-1);
	}
	
	private static void recursion(int[] array, int start, int end) {
		if(start < end) {
			int pivot = partition(array,start,end);
			recursion(array,start,pivot);
			recursion(array,pivot+1,end);
		}

	}
	
	private static int partition(int[] array, int start, int end) {
		int pivotValue = array[start];
		try {
			while(start < end) {
				while(array[end] >= pivotValue /*&& end > 0*/ && start < end)
					end--;
				array[start] = array[end];
				while(array[start] <= pivotValue /*&& start < (array.length -1)*/ && start < end)
					start++;
				array[end] = array[start];
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.print("\n" + start + "," + end + "\n");
		}

		array[start] = pivotValue;
		return start;
	}
	
	//其实也就比我的快排快5%,比java自带的快排慢12%
	public static void quicksort(int[] x, int l, int u){
	    int i, m;
	    if(l >= u) return;
	    m = l;
	    for(i = l+1; i<= u; i++)
	        if(x[i] < x[l]) // buggy!
	            swap(x,++m, i);

	    swap(x,l, m);

	    quicksort(x,l, m-1);
	    quicksort(x,m+1, u);

	}
	
	private static void swap(int[] x,int a, int b) {
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	
	
}
