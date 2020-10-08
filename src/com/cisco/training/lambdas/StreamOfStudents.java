package com.cisco.training.lambdas;

import java.util.ArrayList;
import java.util.List;

import com.cisco.training.basics.Grade;
import com.cisco.training.basics.Student;

public class StreamOfStudents {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"a",Grade.A));
		list.add(new Student(2,"b",Grade.B));
		
		System.out.println("Before\n "+list);
		
		list
			.stream()
			.map(st -> {
			st.setRollNo(st.getRollNo()+1);
			return st.getName();
			}).forEach(s -> System.out.println(s));
		
		System.out.println("After\n "+list);

	}

}
