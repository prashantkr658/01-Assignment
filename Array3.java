
public class Array3 {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 1, 9, 2, 1, 10 };
		// int[] arr = { 6 };
		Array3.thirdLargestElement(arr);
	}

	public static void thirdLargestElement(int[] arr) {
		if (arr.length < 3) {
			System.out.println("Invalid Input, array size is less than 3");
		} else {
			Array1.sortArray(arr);

			System.out.println(arr[arr.length - 3]);
		}
	}

	/*
	 * public static void thirdLargestElement(int[] arr) { int largest = 0,
	 * secondLargest = 0, thirdLargest = 0; if (arr.length < 3) {
	 * System.out.println("Invalid Input, array size is less than 3"); } else { for
	 * (int i = 0; i < arr.length; i++) { if (arr[i] > largest) { secondLargest =
	 * largest; largest = arr[i]; } else if (arr[i] > secondLargest && arr[i] !=
	 * largest) { thirdLargest = secondLargest; secondLargest = arr[i]; } else if
	 * (arr[i] > thirdLargest && arr[i] != secondLargest) { thirdLargest = arr[i]; }
	 * 
	 * } System.out.println(thirdLargest); }
	 */
}
