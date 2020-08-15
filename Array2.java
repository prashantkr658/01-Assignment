
public class Array2 {
	
	public static void sumOfUniqueElement(int [] arr) {
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}

		}
		arr[j++] = arr[arr.length - 1];

		int sum = 0;
		for (int i = 0; i < j; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		Array1.sortArray(arr);
		Array2.sumOfUniqueElement(arr);
		
		
	}

}
