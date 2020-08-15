
public class Array8 {
	
	public static void main(String[] args) {
		int [] arr = {3, 6, 8, -8, 10, 8 } ;
		
		Array8.findElementPair(arr);
	}
	
	public static void findElementPair(int [] arr) {
		int sum = 16;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int add = arr[i] + arr[j];
				if(add == sum) {
					System.out.println(arr[i]+", "+arr[j]);
				}
			}
		}
	}

}
