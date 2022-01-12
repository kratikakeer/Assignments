package com.te.foreachmethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {

		List<Integer> arrayList = Arrays.asList(1, 18, 45, 3, 7, 10, 12, 99, 93, 33);
		
        System.out.println("============For loop==================");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("============For each loop=============");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("============Iterator==================");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("============For each method===========");
		arrayList.forEach(System.out::println);
	}

}
