package array;

import java.util.Arrays;

public class array {

	static void reverse() {
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length /2; i++) {
			int temp = arr.length - i - 1;
			int val = 0;
			val = arr[temp];
			arr[temp] = arr[i];
			arr[i] = val;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort() {
		int[] arr = {1,3,7,4,5};
		
		for(int i =0; i< arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

 public static void main(String[] args) {
	 sort();
}
}
