package com.code;

public class RemoveElementinStringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"welcome","to","java","java","is","good","language","welcome","again"};
		String temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					
					temp= arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
					
				}
			}
			
		}
		System.out.println("************Printing the sorted array");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		int b =0;
		arr[b] = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[b]!=arr[i]) {
				b++;
				arr[b] = arr[i];
				
			}
			
		}
		System.out.println("************Removing duplicate values from String array");
		
		for(int i=0;i<b;i++) {
			System.out.println(arr[i]);
		}	
		
	}

}
