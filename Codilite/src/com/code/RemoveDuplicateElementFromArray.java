package com.code;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,12,8,12,10,16,1};
		int temp;
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		
		System.out.println("Printing array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		
			
		}
		
		int b=0;
		arr[b] = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[b] !=arr[i]) {
				b++;
				arr[b]=arr[i];
				
				
			}
			
			
		}
		
		System.out.println("Printing after removing elements");
		for(int i=0;i<=b;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
