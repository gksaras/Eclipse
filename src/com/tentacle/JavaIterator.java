package com.tentacle;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {

		ArrayList<String> marvel = new ArrayList<>();
		marvel.add("Kang");
		marvel.add("Falcon");
		marvel.add("Bucky");
		marvel.add("Tony");
		marvel.add("Loki");

		Iterator<String> i = marvel.iterator();

		System.out.println(i.next());

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(4);

		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			if (integer < 10) {
				it.remove();
			}
		}
		System.out.println(l);
	}
}
