package insertSort;

public class InsertSort {
	public static void main(String[] args) {
		int[] array = {23,45,67,12,33,89,98,92,37,68,4,34,66,65,97,90,24};
		insertSort(array);
	}
	
	public static void insertSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<i;j++) {
				if(array[j] > array[i]) { 
					int temp = array[i];
					for(int k=i-1;k>=j;k--) {
						try {
							array[k+1] = array[k];
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.print("Wrong!" + k);
							e.printStackTrace();
						}
					}
					array[j] = temp;
				}
			}
/*			for(int iterator : array) {
				System.out.print(iterator + ",");
			}
			System.out.print("\n");*/
		}
	}
}
