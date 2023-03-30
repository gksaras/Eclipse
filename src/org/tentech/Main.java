package org.tentech;

import java.util.Arrays;
//import java.util.Scanner;

public class Main {

	public static void Main(String[] abc) {
	//	Scanner sc = new Scanner(System.in);
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
	}
	public static void main(String[] args) {
		String[] a= {"1","2","3","4","5"};
		//int a[]=Arrays.copyOf(args)
		Main(a);
		System.out.println(args[0]);
	}
}