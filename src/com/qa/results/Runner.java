package com.qa.results;

public class Runner {
	
	public static void main(String[] args) { // always run your code in the main method
		Results res = new Results(120,134,58); //give random scores for physics,chemistry and biology
		res.methodOne();
		res.methodTwo();
	}

}

