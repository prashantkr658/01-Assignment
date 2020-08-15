
public class Array6 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 5, 9, 6, 4, 7, 2};
		Array6.SecondMaxElement(arr);
		Array6.SecondMinElement(arr);
	}
	
	public static void SecondMinElement(int[] arr) {
		int min, secondMin;
		min = secondMin = Integer.MAX_VALUE;
		if (arr.length < 2) {
			System.out.println("Invalid Input, array size is less than 2");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					secondMin = min;
					min = arr[i];
					
				} else if (arr[i] < secondMin && arr[i] != min) {
					secondMin = arr[i];
				} 

			}
			System.out.println("Min element is : "+ min + ", "+"Second Min element is : " +secondMin);
		}

	}

	public static void SecondMaxElement(int[] arr) {
		int max = 0, secondMax = 0;
		if (arr.length < 2) {
			System.out.println("Invalid Input, array size is less than 2");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					secondMax = max;
					max = arr[i];
				} else if (arr[i] > secondMax && arr[i] != max) {
					secondMax = arr[i];
				} 

			}
			System.out.println("Max Element is : "+max+", "+"Second Max element is : "+secondMax);
		}

	}
}
