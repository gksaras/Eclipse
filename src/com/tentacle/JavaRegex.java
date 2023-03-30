package com.tentacle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Visit W3Schools");
		
		boolean find = m.find();
		System.out.println(find);
		
		if(find==true) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");  
		}
	}
}
