package com.tentacle;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class JavaEnums {

	public static void main(String[] args) {
		
		Level l = Level.MEDIUM;
		
		switch(l) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("HighLevel");
			break;
		}		
	}
}
