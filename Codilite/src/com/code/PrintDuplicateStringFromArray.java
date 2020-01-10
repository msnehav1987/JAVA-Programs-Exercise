package com.code;

public class PrintDuplicateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"java","is","very","powerful","language","java", "is", "also", "interesting"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].contentEquals(arr[j])) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
	}

}
