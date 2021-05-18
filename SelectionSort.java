import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[6];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// get the array values at the runtime and store into the array
		for (int i = 0; i < arr.length; i++) {
			System.err.println("Enter input number to Store into array");
			int arrValue = sc.nextInt();
			arr[i] = arrValue;
		}
		selectionSort(arr);
		printArray(arr);
	}
	
	static void selectionSort(int[] a) {
		for (int j = 0; j<a.length; j++) {
			int minimumIndex = j;
			for (int i=j+1; i<a.length; i++) {
				if (a[i] < a[minimumIndex]) //find which is the smallest element to right of 'j'
					minimumIndex = i;
			}//end of inner loop
			if (minimumIndex != j) { // if j is not minimum index then swap
				int temp = a[j];
				a[j] = a[minimumIndex];
				a[minimumIndex] = temp;
			}
		}//end of outer loop
	}//end of method

	
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}//end of
}
