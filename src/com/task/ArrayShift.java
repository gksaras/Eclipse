package com.task;

import java.util.Arrays;

public class ArrayShift {
	public static void main(String[] args) {
		
		int arr[]= {1,0,3,5,6,7,0,9,8,2};
		
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			for ( int j = i; j < len; j++) {
				if(arr[j]==0) {
					int temp = arr[j];
					arr[j]=arr[len-1];
					arr[len-1]=temp;
				}
			}
			len--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
