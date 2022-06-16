package com.qa.results;

//A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. 
//When all the exam marks have been added together, we can find the overall percentage that the person has 
//got by multiplying their score by 100 and then dividing by 450.
//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. 
//This class should also have 2 methods:
//Method 1 - displays the results that the person got for each exam and then the total mark..
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

//Results class created
public class Results {

	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;

	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
	}

	// first method
	public void methodOne() {
		System.out.println("Physics:    " + this.physics);
		System.out.println("Chemoistry: " + this.chemistry);
		System.out.println("Bioplogy:   " + this.biology);
		System.out.println("Total:      " + this.total);
		System.out.println();
	}

	// Second method
	public void methodTwo() {
		this.percentage = (total * 100) / 450;
		System.out.println("Percentage: " + this.percentage + "%");

	}

}
