package com.code;

public class CopyOneArrayToAnotherArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]arr1 = new int[] {1,4,7,3,0,10};
		int[] arr2 = new int[arr1.length];
		
		for(int i =0;i<arr1.length;i++) {
			arr2[i]= arr1[i];
			
		}
		System.out.println("Printing original array");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("After copying new array");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
