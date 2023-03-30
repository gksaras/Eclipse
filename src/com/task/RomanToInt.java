package com.task;

public class RomanToInt {

	int value(char r) {
		if (r == 'I' || r == 'i')
			return 1;
		if (r == 'V' || r == 'v')
			return 5;
		if (r == 'X' || r == 'x')
			return 10;
		if (r == 'L' || r == 'l')
			return 50;
		if (r == 'C' || r == 'c')
			return 100;
		if (r == 'D' || r == 'd')
			return 500;
		if (r == 'M' || r == 'm')
			return 1000;
		return -1;
	}

	int convertRomanToInt(String s) {
		int total = 0;
		for (int i = 0; i < s.length(); i++) {	// i=1 => l
			int s1 = value(s.charAt(i));		// s1 = 50
			if (i + 1 < s.length()) {			// i+1 = 2 if(2 < 2) false
				int s2 = value(s.charAt(i + 1));// s2 = 50
				if (s1 >= s2) {					// if(10 >= 50) false
					total = total + s1;			// total = 0
				} else {						
					total = total - s1;			// 0 = 0 - 10  => -10
				}
			} else {
				total = total + s1;				// -10 = -10 + 50  => 40
			}
		}
		return total;							// total = 40
	}

	public static void main(String[] args) {
		RomanToInt r = new RomanToInt();
		String str = "xl";
		System.out.println(r.convertRomanToInt(str));
	}
}
