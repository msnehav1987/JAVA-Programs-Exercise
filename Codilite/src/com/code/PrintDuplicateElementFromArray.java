package com.code;

public class PrintDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,10,1,12,10,4,3,12};
		
		for(int i=0;i<arr.length;i++) {
			
		
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
				}
			}
		}
	}

}
