package mergeSort;

public class MergeSort {
	private static int[] queue = {23,45,67,12,33,89,98,92,37,68,4,34,66,65,97,90,24};
	private static int[] queue2 = {4,34,66,65,97,90,24};
	public static void main(String[] args) {
		mergeSort(queue);
		for(int i : queue) {
			System.out.print(i + ",");
		}
		System.out.print("\n" + queue.length);
	}
	
	public static void mergeSort(int[] queue) {
		divideRecursion(queue,0,queue.length - 1);
	}
	
	public static void divideRecursion(int[] array, int start, int end) {
		int cutPoint = 0;
		if(end == start) {
			return;
		} else {
			if((end - start + 1) % 2 == 0) {
				cutPoint = (end - start + 1)/2 + start -1;
			} else {
				cutPoint = (end - start + 1)/2 + start;
			}
			divideRecursion(array, start, cutPoint);
			divideRecursion(array, cutPoint+1, end);
		}
		
		mergeWrap(array,cutPoint,start,end);
	}
	
	private static void mergeWrap(int[] array, int cutPoint, int start, int end) {
		// TODO Auto-generated method stub
		int[] a = new int[cutPoint-start+1];
		int[] b = new int[end-cutPoint];
		try {
				System.arraycopy(array, start, a, 0, cutPoint - start + 1);
				System.arraycopy(array, cutPoint + 1, b, 0, end - cutPoint);
				System.arraycopy(merge(a,b), 0, array, start, end-start+1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(start + "," + cutPoint + "," + end);
		}

	}

	private static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int topA = 0,topB = 0,topC = 0;
		while(topA < a.length && topB < b.length) {
			if(a[topA] <= b[topB]) {
				c[topC] = a[topA];
				topA++;
				topC++; 
			} else {
				c[topC] = b[topB];
				topC++;
				topB++;
			}
		}
		while(topA < a.length) {
				c[topC] = a[topA];
				topA++;
				topC++; 
		}
		while(topB < b.length) {
				c[topC] = b[topB];
				topB++;
				topC++; 
		}
		return c;
	}
}
