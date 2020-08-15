
public class Array5 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 5, 9, 6, 4, 7, 2};
		Array1.sortArray(arr);
		Array1.removeDuplicates(arr);
		
		System.out.println("Min : "+arr[0]);
		System.out.println("Max : "+arr[arr.length-1]);
		
	}

}
