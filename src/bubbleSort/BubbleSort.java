package bubbleSort;



public class BubbleSort {

	
	public static void bubbleOptimize(int[] array) {
		boolean change = false;
		for(int i=0;i<array.length;i++) {
			change = false;
			for(int j=array.length -1;j>i;j--) {
				if(array[j] < array[j-1]) {
					change = true;
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			if(!change) {
				System.out.println("Stop Iterator:" + i);
				return;
			}
		}
	}
	
	public static void bubble(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=array.length -1;j>0;j--) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			
		}
	}

}
