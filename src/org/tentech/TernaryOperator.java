package org.tentech;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int x = 10, y = 15;
		int z = (x > y) ? x + y : x - y;
		if (z > 0)
			System.out.println("Positive");
		else if (z < 0)
			System.out.println(z+" "+"Negative");
		else
			System.out.println("Zero");
		
	}
}
