package com.te.hashsetimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.te.arraylistdemo.Employee;

public class ClassRoom {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<>();

		Student student1 = new Student(12, "Darshana", 70);
		Student student2 = new Student(34, "Kratika", 84);
		Student student3 = new Student(25, "Yashoda", 89);
		Student student4 = new Student(17, "Sanjana", 90);
		Student student5 = new Student(17, "Sanjana", 90);
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);

		Iterator iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("===============");
		
		ArrayList<Student> arrayList = new ArrayList(hashSet);
		
		Collections.sort(arrayList, new SortByName());
		Collections.sort(arrayList, new SortByMarks());
		Collections.sort(arrayList, new SortByRollNo());
		
		
		Iterator iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
        
			
	   

	}
}
}