package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		//DataType variableName = value= 
		Person olatoke = new Person("Olatoke",10,75); //new person
		
		Person ade = new Person("Ade",12,90); //new person object
		
		System.out.println(olatoke.name);
		System.out.println(olatoke.age);
		System.out.println(olatoke.score);
		System.out.println();
		System.out.println(ade.name);
		System.out.println(ade.age);
		System.out.println(ade.score);
		
	}
}
