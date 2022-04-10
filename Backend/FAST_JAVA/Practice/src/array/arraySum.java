package array;

public class arraySum {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int tot = 0;
		int i, num;
		
		for(i=0, num=0; i<arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(i=0; i<arr.length; i++) {
			tot += arr[i];
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println(tot);

	}

}
