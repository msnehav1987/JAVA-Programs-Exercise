package com.code;

import java.util.HashSet;
import java.util.Set;

public class missingNo {
	
public static void main(String[] args) {



int[]A = {1,3,5,1,7,-1,2,4};


System.out.println("Missing element in array is :" + solution(A));
}



	
	
	public static int solution(int[] A) {
		
		
		if(A.length==0) {
			return 1;
		}
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0; i<A.length;i++) {
			s.add(A[i]);
			
			
		}
		
		for(int i =1;i<=A.length;i++) {
			if(s.contains(i) !=true) {
				return i;
			}
			
		
		
		
		}
		return A.length+1;
	}
}

		
	
