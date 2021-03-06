
public class Array9 {
	//sum of two element
	public static void main(String[] args) {
		int arr[] = {1, 7, 2, 9, 6};
		Array9.sumOfTwoElements(arr);
	}
	
	public static void sumOfTwoElements(int [] arr) {
		int minSum = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum < minSum) {
					minSum = sum;
				}
			}
		}
		System.out.println(minSum);
	}

}
