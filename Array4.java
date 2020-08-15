
public class Array4 {

	public static void main(String[] args) {
		//int arr[] = { 2, 5, 1, 7, 3, 9, 5};
		int arr[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		Array4.maxDiff(arr);
	}
	
	public static void maxDiff(int [] arr) {
		int maxDiff = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int diff = Math.abs(arr[i]-arr[j]);
				if(diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		System.out.println("Max difference between two element is : "+maxDiff);
	}

}
