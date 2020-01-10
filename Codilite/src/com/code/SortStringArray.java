package com.code;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"java","learning", "is","always","good"};
		String temp;
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
					
					
					
				}
				
				
			}
			
			
		}
		
		System.out.println("Printing in sorted order");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}

}
