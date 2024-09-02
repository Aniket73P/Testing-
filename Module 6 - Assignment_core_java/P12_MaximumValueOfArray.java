package Assignment_core_java;

public class P12_MaximumValueOfArray {
	public static void main(String[] args) {
		int arr[] = { 12,30,10,2,89,10};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println ( " minimum value : " + min );
		System.out.println();
		System.out.println ( " maximum value : " + max );
	}

}
