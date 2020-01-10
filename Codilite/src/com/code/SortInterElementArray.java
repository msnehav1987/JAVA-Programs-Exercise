package com.code;

public class SortInterElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,2,8,1,9};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1; j< arr.length;j++){
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				
				
				
				
					
			}
			
			
			}
		
		System.out.println("Printing array nos");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		

	}

}
