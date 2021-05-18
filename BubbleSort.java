import java.util.Scanner;

/**
 * The sorting which does not required extra space then use Bubble Sort.
 * 
 * @author chandu
 *
 */
public class BubbleSort {

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

		// sort the array values using bubble sort algorithm
		// Compare each pair of adjacent items and swap them if they are in the wrong
		// order.
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) { // run through first element to last element in the array
			for (int j = 0; j < size - 1 - i; j++) {// run through first element to last element in the array and
													// subtract the ith iteration

				if (arr[j] > arr[j + 1]) {// Compare current element and previous element
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		printArray(arr);
	}

	/**
	 * print the array values in the console
	 * 
	 * @param arr Sorted Array values to be printed
	 */
	private static void printArray(int[] arr) {
		System.out.print("array values are : ");
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}
}
