
public class Array1 {
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		Array1.sortArray(arr);
		Array1.findDuplicates(arr);
		System.out.println();
		Array1.removeDuplicates(arr);
		
		
	}

	public static void findDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]);
				}
			}
		}
	}

	public static void removeDuplicates(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}

		}
		arr[j++] = arr[arr.length - 1];

		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void sortArray(int [] arr) {
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
