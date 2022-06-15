package com.qa.constructors;

public class Person {

	public String name;
	public int age;
	public int score = 70; // default value
	
	public Person(String name,int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
}
