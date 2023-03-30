package com.task;

public class ArrayMax {

	public static void main(String[] args) {
		
		int a[]= {1,2,9,8,7,6,5,4,3};
		
		 int max=a[0];
		 
		 for (int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
