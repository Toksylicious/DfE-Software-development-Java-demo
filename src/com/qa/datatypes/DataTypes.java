package com.qa.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println(tokeInt());
		System.out.println(tokeBool());
		System.out.println(tokeChar());
		System.out.println(tokeLong());
		System.out.println(tokeFloat());
		System.out.println(tokeString());
		
	}

	public static int tokeInt() {
		return 0;
	}

	public static boolean tokeBool() {
		return false;
	}

	public static char tokeChar() {
		return 'p';
	}

	public static long tokeLong() {
		return 52L;
	}

	public static float tokeFloat() {
		return 0.6f;
	}

	public static String tokeString() {
		return "Hi there";
	}

	public static void tokeVoid() {
		// no return
	}
}
