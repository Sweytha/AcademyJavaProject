package com.bptn.course.week2.polymorphism;

public class StringUtils {

	String concatenate(String s1, String s2) {

		return s1 + s2;
	}

	String concatenate(String s1, String s2, String s3) {

		return s1 + s2 + s3;
	}

	int concatenate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public static void main(String[] args) {

		StringUtils name = new StringUtils();

		System.out.println(name.concatenate("John", "Doe"));

		System.out.println(name.concatenate("Hello", "Java is", "fun"));
		
		System.out.println(name.concatenate(2,3,4));

	}

}