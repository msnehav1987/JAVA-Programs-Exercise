package com.code;

public class MergeElementsOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = new int[] {1,4,7,10,5};
		int[] arr2 = new int[] {2,8,7,4,9,13};
		
		System.out.println("Array 1 length is " + arr1.length);
		System.out.println("Array 2 length is " + arr2.length);
		
		int[] mergearr = new int[arr1.length+arr2.length];
		int count=0;
		
		for(int i =0;i<arr1.length;i++) {
			mergearr[i] = arr1[i];
			count++;
		}	
			for(int j=0;j<arr2.length;j++) {
				mergearr[count++] = arr2[j];
				
				
				
			}
			System.out.println("Printing the merged array");
			for(int i=0;i<mergearr.length;i++) {
				System.out.println(mergearr[i] + " ");
			}	
			
				
			}
		
		
	}


