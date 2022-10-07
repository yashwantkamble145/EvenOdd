package com.evenodd;

public class Student {
	
int age;
String name;
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
public Student(int age, String name) {
	this.age = age;
	this.name = name;
}

public Student () {
	super();
	
}
}


	