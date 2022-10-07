package com.evenodd;

public class FetchStudent {
public static void main(String[] args) {
	MakeStudents ms= new MakeStudents();
	Student student = ms.getInfo();
	System.out.println(student);
	System.out.println(student.age);
	System.out.println(student.name);
	
}
}





